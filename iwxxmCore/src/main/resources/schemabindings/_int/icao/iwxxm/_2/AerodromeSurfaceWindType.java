//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 02:04:43 PM MSK 
//


package _int.icao.iwxxm._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AngleType;
import net.opengis.gml.v_3_2_1.SpeedType;


/**
 * <p>Java class for AerodromeSurfaceWindType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeSurfaceWindType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meanWindDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="meanWindSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType"/>
 *         &lt;element name="meanWindSpeedOperator" type="{http://icao.int/iwxxm/2.0}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="windGustSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/>
 *         &lt;element name="windGustSpeedOperator" type="{http://icao.int/iwxxm/2.0}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="extremeClockwiseWindDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="extremeCounterClockwiseWindDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="variableWindDirection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeSurfaceWindType", propOrder = {
    "meanWindDirection",
    "meanWindSpeed",
    "meanWindSpeedOperator",
    "windGustSpeed",
    "windGustSpeedOperator",
    "extremeClockwiseWindDirection",
    "extremeCounterClockwiseWindDirection"
})
public class AerodromeSurfaceWindType {

    protected AngleType meanWindDirection;
    @XmlElement(required = true)
    protected SpeedType meanWindSpeed;
    protected RelationalOperatorType meanWindSpeedOperator;
    protected SpeedType windGustSpeed;
    protected RelationalOperatorType windGustSpeedOperator;
    protected AngleType extremeClockwiseWindDirection;
    protected AngleType extremeCounterClockwiseWindDirection;
    @XmlAttribute(name = "variableWindDirection")
    protected Boolean variableWindDirection;

    /**
     * Gets the value of the meanWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getMeanWindDirection() {
        return meanWindDirection;
    }

    /**
     * Sets the value of the meanWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setMeanWindDirection(AngleType value) {
        this.meanWindDirection = value;
    }

    public boolean isSetMeanWindDirection() {
        return (this.meanWindDirection!= null);
    }

    /**
     * Gets the value of the meanWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getMeanWindSpeed() {
        return meanWindSpeed;
    }

    /**
     * Sets the value of the meanWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setMeanWindSpeed(SpeedType value) {
        this.meanWindSpeed = value;
    }

    public boolean isSetMeanWindSpeed() {
        return (this.meanWindSpeed!= null);
    }

    /**
     * Gets the value of the meanWindSpeedOperator property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getMeanWindSpeedOperator() {
        return meanWindSpeedOperator;
    }

    /**
     * Sets the value of the meanWindSpeedOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setMeanWindSpeedOperator(RelationalOperatorType value) {
        this.meanWindSpeedOperator = value;
    }

    public boolean isSetMeanWindSpeedOperator() {
        return (this.meanWindSpeedOperator!= null);
    }

    /**
     * Gets the value of the windGustSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getWindGustSpeed() {
        return windGustSpeed;
    }

    /**
     * Sets the value of the windGustSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setWindGustSpeed(SpeedType value) {
        this.windGustSpeed = value;
    }

    public boolean isSetWindGustSpeed() {
        return (this.windGustSpeed!= null);
    }

    /**
     * Gets the value of the windGustSpeedOperator property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getWindGustSpeedOperator() {
        return windGustSpeedOperator;
    }

    /**
     * Sets the value of the windGustSpeedOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setWindGustSpeedOperator(RelationalOperatorType value) {
        this.windGustSpeedOperator = value;
    }

    public boolean isSetWindGustSpeedOperator() {
        return (this.windGustSpeedOperator!= null);
    }

    /**
     * Gets the value of the extremeClockwiseWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getExtremeClockwiseWindDirection() {
        return extremeClockwiseWindDirection;
    }

    /**
     * Sets the value of the extremeClockwiseWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setExtremeClockwiseWindDirection(AngleType value) {
        this.extremeClockwiseWindDirection = value;
    }

    public boolean isSetExtremeClockwiseWindDirection() {
        return (this.extremeClockwiseWindDirection!= null);
    }

    /**
     * Gets the value of the extremeCounterClockwiseWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getExtremeCounterClockwiseWindDirection() {
        return extremeCounterClockwiseWindDirection;
    }

    /**
     * Sets the value of the extremeCounterClockwiseWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setExtremeCounterClockwiseWindDirection(AngleType value) {
        this.extremeCounterClockwiseWindDirection = value;
    }

    public boolean isSetExtremeCounterClockwiseWindDirection() {
        return (this.extremeCounterClockwiseWindDirection!= null);
    }

    /**
     * Gets the value of the variableWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isVariableWindDirection() {
        return variableWindDirection;
    }

    /**
     * Sets the value of the variableWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariableWindDirection(boolean value) {
        this.variableWindDirection = value;
    }

    public boolean isSetVariableWindDirection() {
        return (this.variableWindDirection!= null);
    }

    public void unsetVariableWindDirection() {
        this.variableWindDirection = null;
    }

}
