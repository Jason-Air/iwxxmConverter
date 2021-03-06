/**
 * Copyright (C) 2018 Dmitry Moryakov, Main aeronautical meteorological center, Moscow, Russia
 * moryakovdv[at]gmail[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gamc.spmi.iwxxmConverter.marshallers.v3;

import java.net.URISyntaxException;
import java.util.GregorianCalendar;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantLock;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.gamc.gis.service.GeoService;
import org.gamc.spmi.iwxxmConverter.common.StringConstants;
import org.gamc.spmi.iwxxmConverter.general.IWXXMHelpers;
import org.gamc.spmi.iwxxmConverter.iwxxmenums.LENGTH_UNITS;
import org.gamc.spmi.iwxxmConverter.validation.IwxxmValidator;
import org.gamc.spmi.iwxxmConverter.wmo.WMOAirWXRegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMOCloudRegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMOCloudTypeRegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMONilReasonRegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMOPrecipitationRegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMORegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMORegister.WMORegisterException;
import org.gamc.spmi.iwxxmConverter.wmo.WMORunWayContaminationRegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMORunWayDepositsRegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMORunWayFrictionRegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMOSigConvectiveCloudTypeRegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMOSigWXRegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMOSpaceWeatherLocationRegister;
import org.gamc.spmi.iwxxmConverter.wmo.WMOSpaceWeatherRegister;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import schemabindings31._int.icao.iwxxm._3.AbstractTimeObjectPropertyType;
import schemabindings31._int.icao.iwxxm._3.AerodromeForecastWeatherType;
import schemabindings31._int.icao.iwxxm._3.AerodromePresentWeatherType;
import schemabindings31._int.icao.iwxxm._3.AerodromeRecentWeatherType;
import schemabindings31._int.icao.iwxxm._3.AirportHeliportPropertyType;
import schemabindings31._int.icao.iwxxm._3.CloudAmountReportedAtAerodromeType;
import schemabindings31._int.icao.iwxxm._3.CloudLayerType;
import schemabindings31._int.icao.iwxxm._3.DistanceWithNilReasonType;
import schemabindings31._int.icao.iwxxm._3.LengthWithNilReasonType;
import schemabindings31._int.icao.iwxxm._3.ReportType;
import schemabindings31._int.icao.iwxxm._3.RunwayDirectionPropertyType;
import schemabindings31._int.icao.iwxxm._3.SigConvectiveCloudTypeType;
import schemabindings31._int.icao.iwxxm._3.StringWithNilReasonType;
import schemabindings31.aero.aixm.schema._5_1.AirportHeliportTimeSlicePropertyType;
import schemabindings31.aero.aixm.schema._5_1.AirportHeliportTimeSliceType;
import schemabindings31.aero.aixm.schema._5_1.AirportHeliportType;
import schemabindings31.aero.aixm.schema._5_1.CodeAirportHeliportDesignatorType;
import schemabindings31.aero.aixm.schema._5_1.CodeICAOType;
import schemabindings31.aero.aixm.schema._5_1.RunwayDirectionTimeSlicePropertyType;
import schemabindings31.aero.aixm.schema._5_1.RunwayDirectionTimeSliceType;
import schemabindings31.aero.aixm.schema._5_1.RunwayDirectionType;
import schemabindings31.aero.aixm.schema._5_1.TextDesignatorType;
import schemabindings31.net.opengis.gml.v_3_2_1.FeaturePropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimeInstantPropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimeInstantType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimePeriodPropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimePeriodType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimePositionType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimePrimitivePropertyType;

/**
 * Set of the helper functions. Provides creation of a common objects to use
 * during xml creation. Helps to reduce boiler-plate code. Can be extended to
 * provide specific implementation for METAR, TAF, SIGMET etc..
 */
public class IWXXM31Helpers extends IWXXMHelpers {

	private Logger logger = LoggerFactory.getLogger(IWXXM31Helpers.class);

	private final schemabindings31._int.icao.iwxxm._3.ObjectFactory ofIWXXM = new schemabindings31._int.icao.iwxxm._3.ObjectFactory();
	private final schemabindings31.net.opengis.gml.v_3_2_1.ObjectFactory ofGML = new schemabindings31.net.opengis.gml.v_3_2_1.ObjectFactory();
	private final schemabindings31.aero.aixm.schema._5_1.ObjectFactory ofAIXM = new schemabindings31.aero.aixm.schema._5_1.ObjectFactory();

	private final schemabindings31._int.wmo.def.metce._2013.ObjectFactory ofMETCE = new schemabindings31._int.wmo.def.metce._2013.ObjectFactory();

	/* WMO registers **/
	private final WMONilReasonRegister nilRegister = new WMONilReasonRegister();

	private final WMOCloudRegister cloudReg = new WMOCloudRegister();
	private final WMOCloudTypeRegister cloudTypeReg = new WMOCloudTypeRegister();

	private final WMOSigConvectiveCloudTypeRegister sigCloudTypeReg = new WMOSigConvectiveCloudTypeRegister();

	private final WMOPrecipitationRegister precipitationReg = new WMOPrecipitationRegister();

	private final WMORunWayContaminationRegister rwContaminationReg = new WMORunWayContaminationRegister();
	private final WMORunWayDepositsRegister rwDepositReg = new WMORunWayDepositsRegister();
	private final WMORunWayFrictionRegister rwFrictionReg = new WMORunWayFrictionRegister();

	private final WMOSigWXRegister sigWxPhenomenaRegister = new WMOSigWXRegister();
	private final WMOAirWXRegister airWxPhenomenaRegister = new WMOAirWXRegister();

	private final WMOSpaceWeatherRegister swxEffectsRegister = new WMOSpaceWeatherRegister();
	private final WMOSpaceWeatherLocationRegister swxLocationRegister = new WMOSpaceWeatherLocationRegister();

	private GeoService geoService = new GeoService();

	private IwxxmValidator iwxxmValidator = new IwxxmValidator();

	public static final String NSW = "NSW";

	public schemabindings31._int.icao.iwxxm._3.ObjectFactory getOfIWXXM() {
		return ofIWXXM;
	}

	public schemabindings31.net.opengis.gml.v_3_2_1.ObjectFactory getOfGML() {
		return ofGML;
	}

	public schemabindings31.aero.aixm.schema._5_1.ObjectFactory getOfAIXM() {
		return ofAIXM;
	}

	/**
	 * Creates TimeInstantPropertyType from given DateTime
	 * 
	 * @param dt       - dateTime to process
	 * @param icaoCode - aerodrome ICAO code
	 * @return {@link TimeInstantPropertyType}
	 */
	public TimeInstantPropertyType createTimeInstantPropertyTypeForDateTime(DateTime dt, String icaoCode,
			String suffix) {

		String sDateTime = dt.toString(getDateTimeFormat()) + "Z";
		String sDateTimePosition = dt.toString(getDateTimeISOFormat());

		TimeInstantPropertyType timeInstantProperty = ofGML.createTimeInstantPropertyType();
		TimeInstantType timeInstant = ofGML.createTimeInstantType();
		timeInstant.setId(generateUUIDv4(String.format("ti-%s-%s-%s", icaoCode, sDateTime, suffix)));
		TimePositionType timePosition = ofGML.createTimePositionType();
		timePosition.getValue().add(sDateTimePosition);
		timeInstant.setTimePosition(timePosition);
		timeInstantProperty.setTimeInstant(timeInstant);

		return timeInstantProperty;
	}

	public StringWithNilReasonType createStringWithNilReasonForString(String value, String nilReason) {
		StringWithNilReasonType snrType = ofIWXXM.createStringWithNilReasonType();
		if (value == null)
			snrType.getNilReason().add(nilReason);
		else
			snrType.setValue(value);

		return snrType;
	}

	public JAXBElement<StringWithNilReasonType> createTagForStringWithNilReasonForString(String value,
			String nilReason) {
		StringWithNilReasonType snrType = createStringWithNilReasonForString(value, nilReason);
		JAXBElement<StringWithNilReasonType> result = ofIWXXM.createStringWithNilReason(snrType);
		return result;

	}

	/**
	 * Сreates JAXB TimeInstantSection for a given DateTime
	 * 
	 * @param dt       - dateTime to process
	 * @param icaoCode - aerodrome ICAO code
	 * @return {@link TimeInstantpropertyType} in JAXB envelope which is ready to
	 *         embed into getRest() part of the root tag
	 */
	public TimeInstantPropertyType createJAXBTimeSection(DateTime dt, String icaoCode) {
		TimeInstantPropertyType timeProperty = createTimeInstantPropertyTypeForDateTime(dt, icaoCode, "timeproperty");
		return timeProperty;

	}

	public AbstractTimeObjectPropertyType createAbstractTimeObject(DateTime dt, String icaoCode) {
		TimeInstantPropertyType timeProperty = this.createTimeInstantPropertyTypeForDateTime(dt, icaoCode, "adt");
		JAXBElement<TimeInstantType> to = this.ofGML.createTimeInstant(timeProperty.getTimeInstant());
		AbstractTimeObjectPropertyType t = this.ofIWXXM.createAbstractTimeObjectPropertyType();
		t.setAbstractTimeObject(to);
		return t;
	}

	/**
	 * Creates valid period section for trend sections
	 * 
	 * @param start        - Begin timestamp
	 * @param end          - End timestamp
	 * @param sectionIndex - number of the section to create valid id
	 * 
	 * @return TimePeriodPropertyType
	 */
	public TimePeriodPropertyType createTrendPeriodSection(String icaoCode, DateTime start, DateTime end,
			int sectionIndex) {

		String sectionTimePeriodBeginPosition = start.toString(getDateTimeISOFormat());
		String sectionTimePeriodEndPosition = end.toString(getDateTimeISOFormat());

		String sectionTimePeriodBegin = start.toString(getDateTimeFormat()) + "Z";
		String sectionTimePeriodEnd = end.toString(getDateTimeFormat()) + "Z";

		TimePeriodPropertyType timePeriodProperty = ofGML.createTimePeriodPropertyType();
		TimePeriodType timePeriodType = ofGML.createTimePeriodType();

		timePeriodType.setId(generateUUIDv4(
				String.format("tp-%d-%s-%s", sectionIndex, sectionTimePeriodBegin, sectionTimePeriodEnd)));

		// begin
		TimeInstantType timeBeginInstant = ofGML.createTimeInstantType();
		timeBeginInstant
				.setId(generateUUIDv4(String.format("ti-%d-%s-%s", sectionIndex, icaoCode, sectionTimePeriodBegin)));

		TimePositionType timePositionBegin = ofGML.createTimePositionType();
		// timePositionBegin.getValue().add(timePeriodBeginPosition);
		timePositionBegin.getValue().add(sectionTimePeriodBeginPosition);
		timeBeginInstant.setTimePosition(timePositionBegin);

		TimeInstantPropertyType timeBeginProperty = ofGML.createTimeInstantPropertyType();
		timeBeginProperty.setTimeInstant(timeBeginInstant);

		// end
		TimeInstantType timeEndInstant = ofGML.createTimeInstantType();
		timeEndInstant.setId(generateUUIDv4(String.format("ti-%s-%s", icaoCode, sectionTimePeriodEnd)));
		TimePositionType timePositionEnd = ofGML.createTimePositionType();
		timePositionEnd.getValue().add(sectionTimePeriodEndPosition);
		timeEndInstant.setTimePosition(timePositionEnd);

		TimeInstantPropertyType timeEndProperty = ofGML.createTimeInstantPropertyType();
		timeEndProperty.setTimeInstant(timeEndInstant);

		timePeriodType.setBeginPosition(timePositionBegin);
		timePeriodType.setEndPosition(timePositionEnd);

		timePeriodProperty.setTimePeriod(timePeriodType);

		return timePeriodProperty;

	}

	/** creates XML section with time period, e.g. for validity periods */
	public TimePeriodPropertyType createTimePeriod(String icaoCode, DateTime from, DateTime to) {

		TimePeriodPropertyType timePeriodProperty = this.ofGML.createTimePeriodPropertyType();
		TimePeriodType timePeriodType = this.ofGML.createTimePeriodType();

		timePeriodType.setId(generateUUIDv4(String.format("tp-%s-%s-%s", icaoCode, from.toString(), to.toString())));

		// begin
		TimeInstantType timeBeginInstant = this.ofGML.createTimeInstantType();
		timeBeginInstant.setId(generateUUIDv4(String.format("ti-%s-%s", icaoCode, from.toString())));
		TimePositionType timePositionBegin = this.ofGML.createTimePositionType();
		timePositionBegin.getValue().add(from.toString());
		timeBeginInstant.setTimePosition(timePositionBegin);

		TimeInstantPropertyType timeBeginProperty = this.ofGML.createTimeInstantPropertyType();
		timeBeginProperty.setTimeInstant(timeBeginInstant);

		timePeriodType.setBeginPosition(timePositionBegin);

		// end
		TimeInstantType timeEndInstant = this.ofGML.createTimeInstantType();
		timeEndInstant.setId(generateUUIDv4(String.format("ti-%s-%s", icaoCode, to.toString())));
		TimePositionType timePositionEnd = this.ofGML.createTimePositionType();
		timePositionEnd.getValue().add(to.toString());
		timeEndInstant.setTimePosition(timePositionEnd);

		TimeInstantPropertyType timeEndProperty = this.ofGML.createTimeInstantPropertyType();
		timeEndProperty.setTimeInstant(timeEndInstant);

		timePeriodType.setEndPosition(timePositionEnd);

		timePeriodProperty.setTimePeriod(timePeriodType);

		return timePeriodProperty;

	}

	/**
	 * Сreates FeaturePropertyType for given aerodrome icao code <iwxxm:aerodrome>
	 * 
	 * @param icaoCode - ICAO code for the aerodrome.
	 * @return {@link FeaturePropertyType} with aerodrome description
	 */
	public AirportHeliportPropertyType createAirportDescriptionSectionTag(String icaoCode) {

		AirportHeliportPropertyType ahpt = ofIWXXM.createAirportHeliportPropertyType();
		AirportHeliportType aht = new AirportHeliportType();
		aht.setId(generateUUIDv4("aerodrome-" + icaoCode));

		AirportHeliportTimeSlicePropertyType ahTimeSliceProperty = ofAIXM.createAirportHeliportTimeSlicePropertyType();
		AirportHeliportTimeSliceType ahTimeSliceType = ofAIXM.createAirportHeliportTimeSliceType();
		ahTimeSliceType.setId(generateUUIDv4(String.format("aerodrome-%s-ts", icaoCode)));

		TimePrimitivePropertyType validTime = ofGML.createTimePrimitivePropertyType();
		ahTimeSliceType.setValidTime(validTime);
		ahTimeSliceType.setInterpretation("BASELINE");

		CodeAirportHeliportDesignatorType designator = ofAIXM.createCodeAirportHeliportDesignatorType();
		designator.setValue(icaoCode);
		JAXBElement<CodeAirportHeliportDesignatorType> designatorTag = ofAIXM
				.createAirportHeliportTimeSliceTypeDesignator(designator);
		ahTimeSliceType.getRest().add(designatorTag);

		CodeICAOType icaoType = ofAIXM.createCodeICAOType();
		icaoType.setValue(icaoCode);
		JAXBElement<CodeICAOType> locationIdicator = ofAIXM
				.createAirportHeliportTimeSliceTypeLocationIndicatorICAO(icaoType);
		ahTimeSliceType.getRest().add(locationIdicator);

		ahTimeSliceProperty.setAirportHeliportTimeSlice(ahTimeSliceType);

		aht.getTimeSlice().add(ahTimeSliceProperty);

		ahpt.setAirportHeliport(aht);

		return ahpt;

	}

	/**
	 * Creates block for RunwayDirectionPropertyType with AIXXM description of the
	 * aerodrome runway
	 */
	public RunwayDirectionPropertyType createRunwayDesignatorSectionTag(String icaoCode, String designator) {
		RunwayDirectionPropertyType runwayDir = ofIWXXM.createRunwayDirectionPropertyType();
		RunwayDirectionType rdt = ofAIXM.createRunwayDirectionType();
		rdt.setId(generateUUIDv4(String.format("runway-%s-%s", icaoCode, designator)));

		RunwayDirectionTimeSlicePropertyType rdts = ofAIXM.createRunwayDirectionTimeSlicePropertyType();
		RunwayDirectionTimeSliceType rdtst = ofAIXM.createRunwayDirectionTimeSliceType();

		TextDesignatorType textDesignator = ofAIXM.createTextDesignatorType();
		textDesignator.setValue(designator);
		JAXBElement<TextDesignatorType> textDesTag = ofAIXM.createRunwayTimeSliceTypeDesignator(textDesignator);
		rdtst.setId(generateUUIDv4(String.format("runway-%s-%s-ts", icaoCode, designator)));
		rdtst.setDesignator(textDesTag);
		rdtst.setInterpretation("BASELINE");

		TimePrimitivePropertyType tppt = ofGML.createTimePrimitivePropertyType();
		rdtst.setValidTime(tppt);

		rdts.setRunwayDirectionTimeSlice(rdtst);
		rdt.getTimeSlice().add(rdts);

		runwayDir.setRunwayDirection(rdt);
		return runwayDir;
	}

	/**
	 * Adds header with translation center properties to the message
	 * 
	 * @param report               - message of the class, derived from
	 *                             {@link ReportType} - TAFType, METARType, etc...
	 * @param translationTime      - translation time
	 * @param bulletinReceivedTime - when bulletin was received (or null if not
	 *                             applicable))
	 * @param bulletinId           - bulletin id (or null if not applicable)
	 * @param designator           - ICAO code of the translation center
	 * @param centreName           - name of the translation center
	 * @return The same report object with filled properties
	 */
	public <T extends ReportType> T addTranslationCentreHeaders(T report, DateTime translationTime,
			DateTime bulletinReceivedTime, String bulletinId, String designator, String centreName)
			throws DatatypeConfigurationException {

		// Create and set special XML DateTime object
		GregorianCalendar calDateTime = translationTime.toGregorianCalendar();
		XMLGregorianCalendar xmlCalRepr = DatatypeFactory.newInstance().newXMLGregorianCalendar(calDateTime);
		report.setTranslationTime(xmlCalRepr);

		if (bulletinReceivedTime != null) {
			GregorianCalendar bulletinDateTime = bulletinReceivedTime.toGregorianCalendar();
			XMLGregorianCalendar bulletinCalRepr = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(bulletinDateTime);
			report.setTranslatedBulletinReceptionTime(bulletinCalRepr);
		}

		report.setTranslatedBulletinID(bulletinId);

		report.setTranslationCentreName(centreName);
		report.setTranslationCentreDesignator(designator);

		return report;
	}

	/**
	 * Creates cloud layer section. Takes the right linkk from WMO register helper
	 * 
	 * @param cloudAmount   - octants
	 * @param cloudHeight   - height of cloud in given units
	 * @param cloudTypeCode - significant cloud type if exists
	 * 
	 * @param nilReason     - it should be set when somehow values are missed
	 * @param units         - {@link LENGTH_UNITS} unit of measure.
	 * @return cloudLayer
	 * @throws WMORegisterException 
	 */
	public CloudLayerType createCloudLayerSection(String cloudAmount, double cloudHeight, String cloudTypeCode,
			String nilReasonUrl, LENGTH_UNITS units) throws WMORegisterException {

		// Create layer
		// Layer cloudLayer = ofIWXXM.createAerodromeCloudForecastTypeLayer();
		CloudLayerType currentLayer = ofIWXXM.createCloudLayerType();

		// Cloud amount seems to conform WMO schemas with
		CloudAmountReportedAtAerodromeType amount = ofIWXXM.createCloudAmountReportedAtAerodromeType();

		// Get the right link to WMO code table for cloud amount octant

		amount.setHref(cloudReg.getWMOUrlByCode(cloudAmount));

		// Height of clouds
		DistanceWithNilReasonType layerDistanceBase = ofIWXXM.createDistanceWithNilReasonType();
		if (nilReasonUrl != null) {
			layerDistanceBase.getNilReason().add(nilReasonUrl);
		} else {
			layerDistanceBase.setUom(units.getStringValue());
			layerDistanceBase.setValue(cloudHeight);
		}

		currentLayer.setAmount(amount);
		currentLayer.setBase(layerDistanceBase);
	
		if (cloudTypeCode != null && !cloudTypeCode.isEmpty()) {

			SigConvectiveCloudTypeType cloudType = ofIWXXM.createSigConvectiveCloudTypeType();

			// Get the right link to WMO code table for cloud type

			cloudType.setHref(sigCloudTypeReg.getWMOUrlByCode(sigCloudTypeReg.getCloudTypeByStringCode(cloudTypeCode)));
			currentLayer.setCloudType(ofIWXXM.createCloudLayerTypeCloudType(cloudType));
		}

		// cloudLayer.setCloudLayer(currentLayer);
		return currentLayer;

	}

	/**
	 * Created cloud section with pointing the nil reason, e.g. for NSC or NCD cases
	 */
	public CloudLayerType createEmptyCloudLayerSection(String nilReasonUrl) {

		// Create layer

		CloudLayerType currentLayer = ofIWXXM.createCloudLayerType();
		DistanceWithNilReasonType layerDistanceBase = ofIWXXM.createDistanceWithNilReasonType();

		layerDistanceBase.getNilReason().add(nilReasonUrl);

		currentLayer.setBase(layerDistanceBase);

		return currentLayer;

	}

	/** Creates tag for vertical visibility 
	 * @throws WMORegisterException */
	public JAXBElement<LengthWithNilReasonType> createVerticalVisibilitySection(Optional<Integer> visibilityValue) throws WMORegisterException {
		LengthWithNilReasonType vvType = ofIWXXM.createLengthWithNilReasonType();
		
		//Vertical visibility is present, for example VV015
		if (visibilityValue.isPresent()) {
			vvType.setUom(LENGTH_UNITS.FT.getStringValue());
			vvType.setValue(visibilityValue.get());
		}
		else {
			vvType.getNilReason().add(nilRegister.getWMOUrlByCode(WMONilReasonRegister.NIL_REASON_NOT_OBSERVABLE));
		}
		
		return ofIWXXM.createAerodromeCloudTypeVerticalVisibility(vvType);

	}

	/** returns link for WMO weather register for present weather in METAR 
	 * @throws WMORegisterException */
	public AerodromePresentWeatherType createPresentWeatherSection(String weather) throws WMORegisterException {

		AerodromePresentWeatherType presentWeather = ofIWXXM.createAerodromePresentWeatherType();
		if (weather.equalsIgnoreCase(StringConstants.NO_SIGNIFICANT_WEATHER_CHANGES)) {
			presentWeather.getNilReason().add(nilRegister.getWMOUrlByCode(WMONilReasonRegister.NIL_REASON_NOTHING_OF_OPERATIONAL_SIGNIFICANCE));
			return presentWeather;
		}
		presentWeather.setHref(getPrecipitationReg().getWMOUrlByCode(weather));

		return presentWeather;
	}

	/** returns link for WMO weather register for recent weather in METAR 
	 * @throws WMORegisterException */
	public AerodromeRecentWeatherType createRecentWeatherSection(String weather) throws WMORegisterException {

		AerodromeRecentWeatherType recentWeather = ofIWXXM.createAerodromeRecentWeatherType();

		if (weather.equalsIgnoreCase(StringConstants.NO_SIGNIFICANT_WEATHER_CHANGES)) {
			recentWeather.getNilReason().add(nilRegister.getWMOUrlByCode(WMONilReasonRegister.NIL_REASON_NOTHING_OF_OPERATIONAL_SIGNIFICANCE));
			return recentWeather;
		}
		recentWeather.setHref(getPrecipitationReg().getWMOUrlByCode(weather));

		return recentWeather;
	}

	/**
	 * returns link for WMO weather register for forecasted weather in METAR and TAF
	 * @throws WMORegisterException 
	 */
	public AerodromeForecastWeatherType createForecastWeatherSection(String weather) throws WMORegisterException {
		AerodromeForecastWeatherType fcstWeather = ofIWXXM.createAerodromeForecastWeatherType();

		if (weather.equalsIgnoreCase(StringConstants.NO_SIGNIFICANT_WEATHER_CHANGES)) {
			fcstWeather.getNilReason().add(nilRegister.getWMOUrlByCode(WMONilReasonRegister.NIL_REASON_NOTHING_OF_OPERATIONAL_SIGNIFICANCE));
			return fcstWeather;
		}

		fcstWeather.setHref(getPrecipitationReg().getWMOUrlByCode(weather));
		return fcstWeather;

	}

	public WMOCloudRegister getCloudReg() {
		return cloudReg;
	}

	public WMOCloudTypeRegister getCloudTypeReg() {
		return cloudTypeReg;
	}

	public WMOPrecipitationRegister getPrecipitationReg() {
		return precipitationReg;
	}

	public WMORunWayContaminationRegister getRwContaminationReg() {
		return rwContaminationReg;
	}

	public WMORunWayDepositsRegister getRwDepositReg() {
		return rwDepositReg;
	}

	public WMORunWayFrictionRegister getRwFrictionReg() {
		return rwFrictionReg;
	}

	public WMOSigConvectiveCloudTypeRegister getSigCloudTypeReg() {
		return sigCloudTypeReg;
	}

	public WMOSigWXRegister getSigWxPhenomenaRegister() {
		return sigWxPhenomenaRegister;
	}

	public WMOSpaceWeatherRegister getSpaceWeatherReg() {
		return swxEffectsRegister;
	}

	public WMOSpaceWeatherLocationRegister getSpaceWeatherLocationReg() {
		return swxLocationRegister;
	}

	public WMONilReasonRegister getNilRegister() {
		return nilRegister;
	}

	public WMOAirWXRegister getAirWxPhenomenaRegister() {
		return airWxPhenomenaRegister;
	}

	public WMOSpaceWeatherRegister getSwxEffectsRegister() {
		return swxEffectsRegister;
	}

	public WMOSpaceWeatherLocationRegister getSwxLocationRegister() {
		return swxLocationRegister;
	}

	/**
	 * set the geoservice. Use this method to pre-set the geoservice with
	 * non-default initialization e.g. Iwxxm31Helpers helpers = new
	 * Iwxxm31Helpers(); GeoService gs = new GeoService(); gs.init(true,
	 * "my-firs-catalog", true)); helpers.setGeoService(gs);
	 */
	public void setGeoService(GeoService geoService) {

		this.geoService = geoService;
	}

	/** returns geoservice initializing it if necessary with default parameters */
	public GeoService getGeoService() throws URISyntaxException {
		if (!geoService.isServiceInit())
			geoService.init(false, "", true);

		return geoService;

	}

	public schemabindings31._int.wmo.def.metce._2013.ObjectFactory getOfMETCE() {
		return ofMETCE;
	}

}
