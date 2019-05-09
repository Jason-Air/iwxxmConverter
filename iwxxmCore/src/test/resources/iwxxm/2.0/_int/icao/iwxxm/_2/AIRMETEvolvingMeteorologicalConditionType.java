//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 02:04:43 PM MSK 
//


package _int.icao.iwxxm._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.schema._5_1.AirspaceVolumePropertyType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.AngleType;
import net.opengis.gml.v_3_2_1.LengthType;
import net.opengis.gml.v_3_2_1.SpeedType;


/**
 * <p>Java class for AIRMETEvolvingMeteorologicalConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AIRMETEvolvingMeteorologicalConditionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="directionOfMotion" type="{http://icao.int/iwxxm/2.0}AngleWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="geometry" type="{http://www.aixm.aero/schema/5.1.1}AirspaceVolumePropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="geometryLowerLimitOperator" type="{http://icao.int/iwxxm/2.0}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="geometryUpperLimitOperator" type="{http://icao.int/iwxxm/2.0}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="speedOfMotion" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/>
 *         &lt;element name="cloudBase" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="cloudBaseReference" type="{http://www.aixm.aero/schema/5.1.1}CodeVerticalReferenceBaseType" minOccurs="0"/>
 *         &lt;element name="cloudTop" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="cloudTopReference" type="{http://www.aixm.aero/schema/5.1.1}CodeVerticalReferenceBaseType" minOccurs="0"/>
 *         &lt;element name="surfaceVisibility" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="surfaceVisibilityCause" type="{http://icao.int/iwxxm/2.0}WeatherCausingVisibilityReductionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="surfaceWindDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="surfaceWindSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="intensityChange" type="{http://icao.int/iwxxm/2.0}AIRMETExpectedIntensityChangeType" />
 *       &lt;attribute name="timeIndicator" use="required" type="{http://icao.int/iwxxm/2.0}TimeIndicatorType" />
 *       &lt;attribute name="approximateLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AIRMETEvolvingMeteorologicalConditionType", propOrder = {
    "directionOfMotion",
    "geometry",
    "geometryLowerLimitOperator",
    "geometryUpperLimitOperator",
    "speedOfMotion",
    "cloudBase",
    "cloudBaseReference",
    "cloudTop",
    "cloudTopReference",
    "surfaceVisibility",
    "surfaceVisibilityCause",
    "surfaceWindDirection",
    "surfaceWindSpeed",
    "extension"
})
public class AIRMETEvolvingMeteorologicalConditionType
    extends AbstractFeatureType
{

    @XmlElementRef(name = "directionOfMotion", namespace = "http://icao.int/iwxxm/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<AngleWithNilReasonType> directionOfMotion;
    @XmlElement(required = true)
    protected List<AirspaceVolumePropertyType> geometry;
    protected RelationalOperatorType geometryLowerLimitOperator;
    protected RelationalOperatorType geometryUpperLimitOperator;
    protected SpeedType speedOfMotion;
    protected LengthType cloudBase;
    protected String cloudBaseReference;
    protected LengthType cloudTop;
    protected String cloudTopReference;
    protected LengthType surfaceVisibility;
    protected List<WeatherCausingVisibilityReductionType> surfaceVisibilityCause;
    protected AngleType surfaceWindDirection;
    protected SpeedType surfaceWindSpeed;
    protected List<Object> extension;
    @XmlAttribute(name = "intensityChange")
    protected AIRMETExpectedIntensityChangeType intensityChange;
    @XmlAttribute(name = "timeIndicator", required = true)
    protected TimeIndicatorType timeIndicator;
    @XmlAttribute(name = "approximateLocation")
    protected Boolean approximateLocation;

    /**
     * Gets the value of the directionOfMotion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<AngleWithNilReasonType> getDirectionOfMotion() {
        return directionOfMotion;
    }

    /**
     * Sets the value of the directionOfMotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public void setDirectionOfMotion(JAXBElement<AngleWithNilReasonType> value) {
        this.directionOfMotion = value;
    }

    public boolean isSetDirectionOfMotion() {
        return (this.directionOfMotion!= null);
    }

    /**
     * Gets the value of the geometry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceVolumePropertyType }
     * 
     * 
     */
    public List<AirspaceVolumePropertyType> getGeometry() {
        if (geometry == null) {
            geometry = new ArrayList<AirspaceVolumePropertyType>();
        }
        return this.geometry;
    }

    public boolean isSetGeometry() {
        return ((this.geometry!= null)&&(!this.geometry.isEmpty()));
    }

    public void unsetGeometry() {
        this.geometry = null;
    }

    /**
     * Gets the value of the geometryLowerLimitOperator property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getGeometryLowerLimitOperator() {
        return geometryLowerLimitOperator;
    }

    /**
     * Sets the value of the geometryLowerLimitOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setGeometryLowerLimitOperator(RelationalOperatorType value) {
        this.geometryLowerLimitOperator = value;
    }

    public boolean isSetGeometryLowerLimitOperator() {
        return (this.geometryLowerLimitOperator!= null);
    }

    /**
     * Gets the value of the geometryUpperLimitOperator property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getGeometryUpperLimitOperator() {
        return geometryUpperLimitOperator;
    }

    /**
     * Sets the value of the geometryUpperLimitOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setGeometryUpperLimitOperator(RelationalOperatorType value) {
        this.geometryUpperLimitOperator = value;
    }

    public boolean isSetGeometryUpperLimitOperator() {
        return (this.geometryUpperLimitOperator!= null);
    }

    /**
     * Gets the value of the speedOfMotion property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getSpeedOfMotion() {
        return speedOfMotion;
    }

    /**
     * Sets the value of the speedOfMotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setSpeedOfMotion(SpeedType value) {
        this.speedOfMotion = value;
    }

    public boolean isSetSpeedOfMotion() {
        return (this.speedOfMotion!= null);
    }

    /**
     * Gets the value of the cloudBase property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCloudBase() {
        return cloudBase;
    }

    /**
     * Sets the value of the cloudBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCloudBase(LengthType value) {
        this.cloudBase = value;
    }

    public boolean isSetCloudBase() {
        return (this.cloudBase!= null);
    }

    /**
     * Gets the value of the cloudBaseReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudBaseReference() {
        return cloudBaseReference;
    }

    /**
     * Sets the value of the cloudBaseReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudBaseReference(String value) {
        this.cloudBaseReference = value;
    }

    public boolean isSetCloudBaseReference() {
        return (this.cloudBaseReference!= null);
    }

    /**
     * Gets the value of the cloudTop property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCloudTop() {
        return cloudTop;
    }

    /**
     * Sets the value of the cloudTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCloudTop(LengthType value) {
        this.cloudTop = value;
    }

    public boolean isSetCloudTop() {
        return (this.cloudTop!= null);
    }

    /**
     * Gets the value of the cloudTopReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudTopReference() {
        return cloudTopReference;
    }

    /**
     * Sets the value of the cloudTopReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudTopReference(String value) {
        this.cloudTopReference = value;
    }

    public boolean isSetCloudTopReference() {
        return (this.cloudTopReference!= null);
    }

    /**
     * Gets the value of the surfaceVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSurfaceVisibility() {
        return surfaceVisibility;
    }

    /**
     * Sets the value of the surfaceVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSurfaceVisibility(LengthType value) {
        this.surfaceVisibility = value;
    }

    public boolean isSetSurfaceVisibility() {
        return (this.surfaceVisibility!= null);
    }

    /**
     * Gets the value of the surfaceVisibilityCause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfaceVisibilityCause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfaceVisibilityCause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherCausingVisibilityReductionType }
     * 
     * 
     */
    public List<WeatherCausingVisibilityReductionType> getSurfaceVisibilityCause() {
        if (surfaceVisibilityCause == null) {
            surfaceVisibilityCause = new ArrayList<WeatherCausingVisibilityReductionType>();
        }
        return this.surfaceVisibilityCause;
    }

    public boolean isSetSurfaceVisibilityCause() {
        return ((this.surfaceVisibilityCause!= null)&&(!this.surfaceVisibilityCause.isEmpty()));
    }

    public void unsetSurfaceVisibilityCause() {
        this.surfaceVisibilityCause = null;
    }

    /**
     * Gets the value of the surfaceWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getSurfaceWindDirection() {
        return surfaceWindDirection;
    }

    /**
     * Sets the value of the surfaceWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setSurfaceWindDirection(AngleType value) {
        this.surfaceWindDirection = value;
    }

    public boolean isSetSurfaceWindDirection() {
        return (this.surfaceWindDirection!= null);
    }

    /**
     * Gets the value of the surfaceWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getSurfaceWindSpeed() {
        return surfaceWindSpeed;
    }

    /**
     * Sets the value of the surfaceWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setSurfaceWindSpeed(SpeedType value) {
        this.surfaceWindSpeed = value;
    }

    public boolean isSetSurfaceWindSpeed() {
        return (this.surfaceWindSpeed!= null);
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    /**
     * Gets the value of the intensityChange property.
     * 
     * @return
     *     possible object is
     *     {@link AIRMETExpectedIntensityChangeType }
     *     
     */
    public AIRMETExpectedIntensityChangeType getIntensityChange() {
        return intensityChange;
    }

    /**
     * Sets the value of the intensityChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRMETExpectedIntensityChangeType }
     *     
     */
    public void setIntensityChange(AIRMETExpectedIntensityChangeType value) {
        this.intensityChange = value;
    }

    public boolean isSetIntensityChange() {
        return (this.intensityChange!= null);
    }

    /**
     * Gets the value of the timeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIndicatorType }
     *     
     */
    public TimeIndicatorType getTimeIndicator() {
        return timeIndicator;
    }

    /**
     * Sets the value of the timeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIndicatorType }
     *     
     */
    public void setTimeIndicator(TimeIndicatorType value) {
        this.timeIndicator = value;
    }

    public boolean isSetTimeIndicator() {
        return (this.timeIndicator!= null);
    }

    /**
     * Gets the value of the approximateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isApproximateLocation() {
        return approximateLocation;
    }

    /**
     * Sets the value of the approximateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateLocation(boolean value) {
        this.approximateLocation = value;
    }

    public boolean isSetApproximateLocation() {
        return (this.approximateLocation!= null);
    }

    public void unsetApproximateLocation() {
        this.approximateLocation = null;
    }

}
