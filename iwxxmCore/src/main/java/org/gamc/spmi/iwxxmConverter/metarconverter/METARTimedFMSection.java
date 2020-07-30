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
package org.gamc.spmi.iwxxmConverter.metarconverter;

import org.gamc.spmi.iwxxmConverter.common.ForecastSectionType;
import org.gamc.spmi.iwxxmConverter.general.MetarForecastTimeSection;
import org.gamc.spmi.iwxxmConverter.tac.TacMessageImpl;
import org.gamc.spmi.iwxxmConverter.tac.TacSectionImpl;
import org.joda.time.DateTime;
import org.joda.time.Interval;

/**Describes BECMG FM section in METAR*/
public class METARTimedFMSection extends TacSectionImpl implements MetarForecastTimeSection {

	private MetarCommonWeatherSection commonWeatherSection = new MetarCommonWeatherSection(false);
	
	DateTime dtAT=null;
	DateTime dtFM=null;
	DateTime dtTL=null;
	ForecastSectionType sectionType = ForecastSectionType.BECMG;
	public METARTimedFMSection(String initialTac, TacMessageImpl parent) {
		super(initialTac, parent);
		
	}

	@Override
	public MetarCommonWeatherSection getCommonWeatherSection() {
		return commonWeatherSection;
	}
	
	@Override
	public DateTime getDateTimeAT() {
		return dtAT;
	}

	@Override
	public DateTime getDateTimeFROM() {
		return dtFM;
	}

	@Override
	public DateTime getDateTimeTILL() {
		return dtTL;
	}


	
	@Override
	public void parseSection() throws METARParsingException {
		StringBuffer innerTac = new StringBuffer(getInitialTacString());
		
		DateTime parentDateTime = this.getParentIssuedDateTime();
		/*
		dtAT = parseSectionDateTimeToken(MetarParsingRegexp.metarForecastDateTimeAT, innerTac.toString(), parentDateTime);
		dtTL = parseSectionDateTimeToken(MetarParsingRegexp.metarForecastDateTimeTL, innerTac.toString(), parentDateTime);
		*/
		dtFM = parseSectionDateTimeToken(MetarParsingRegexp.metarBecomingTimestamp, innerTac.toString(), parentDateTime);
		
		commonWeatherSection.parseSection(innerTac);

		
	}

	@Override
	public ForecastSectionType getSectionType() {
		return this.sectionType;
	}
	@Override
	public void setSectionType(ForecastSectionType type) {
		this.sectionType = type;
		
	}

	/**Validity period from FM marker to issue time plus 2 hours*/
	@Override
	public Interval getTrendValidityInterval() {
		
		DateTime parentDateTimeEnd = this.getParentIssuedDateTime().plusHours(2);
		return new Interval(dtFM,parentDateTimeEnd);
	}
}
