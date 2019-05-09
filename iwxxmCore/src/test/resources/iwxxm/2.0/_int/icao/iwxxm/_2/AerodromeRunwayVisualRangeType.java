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
import net.opengis.gml.v_3_2_1.LengthType;


/**
 * <p>Java class for AerodromeRunwayVisualRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeRunwayVisualRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="runway" type="{http://icao.int/iwxxm/2.0}RunwayDirectionPropertyType"/>
 *         &lt;element name="meanRVR" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         &lt;element name="meanRVROperator" type="{http://icao.int/iwxxm/2.0}RelationalOperatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pastTendency" type="{http://icao.int/iwxxm/2.0}VisualRangeTendencyType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeRunwayVisualRangeType", propOrder = {
    "runway",
    "meanRVR",
    "meanRVROperator"
})
public class AerodromeRunwayVisualRangeType {

    @XmlElement(required = true)
    protected RunwayDirectionPropertyType runway;
    @XmlElement(required = true)
    protected LengthType meanRVR;
    protected RelationalOperatorType meanRVROperator;
    @XmlAttribute(name = "pastTendency")
    protected VisualRangeTendencyType pastTendency;

    /**
     * Gets the value of the runway property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayDirectionPropertyType }
     *     
     */
    public RunwayDirectionPropertyType getRunway() {
        return runway;
    }

    /**
     * Sets the value of the runway property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDirectionPropertyType }
     *     
     */
    public void setRunway(RunwayDirectionPropertyType value) {
        this.runway = value;
    }

    public boolean isSetRunway() {
        return (this.runway!= null);
    }

    /**
     * Gets the value of the meanRVR property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMeanRVR() {
        return meanRVR;
    }

    /**
     * Sets the value of the meanRVR property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMeanRVR(LengthType value) {
        this.meanRVR = value;
    }

    public boolean isSetMeanRVR() {
        return (this.meanRVR!= null);
    }

    /**
     * Gets the value of the meanRVROperator property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getMeanRVROperator() {
        return meanRVROperator;
    }

    /**
     * Sets the value of the meanRVROperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setMeanRVROperator(RelationalOperatorType value) {
        this.meanRVROperator = value;
    }

    public boolean isSetMeanRVROperator() {
        return (this.meanRVROperator!= null);
    }

    /**
     * Gets the value of the pastTendency property.
     * 
     * @return
     *     possible object is
     *     {@link VisualRangeTendencyType }
     *     
     */
    public VisualRangeTendencyType getPastTendency() {
        return pastTendency;
    }

    /**
     * Sets the value of the pastTendency property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualRangeTendencyType }
     *     
     */
    public void setPastTendency(VisualRangeTendencyType value) {
        this.pastTendency = value;
    }

    public boolean isSetPastTendency() {
        return (this.pastTendency!= null);
    }

}
