//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package _int.wmo.def.opm._2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import net.opengis.gml.v_3_2_1.AreaType;
import net.opengis.gml.v_3_2_1.AssociationRoleType;
import net.opengis.gml.v_3_2_1.CodeType;
import net.opengis.gml.v_3_2_1.LengthType;
import net.opengis.gml.v_3_2_1.VolumeType;


/**
 * <p>Java class for StatisticalQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticalQualifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aggregationArea" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="aggregationLength" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="aggregationTimePeriod" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="aggregationVolume" type="{http://www.opengis.net/gml/3.2}VolumeType" minOccurs="0"/>
 *         &lt;element name="otherAggregation" type="{http://www.opengis.net/gml/3.2}AssociationRoleType" minOccurs="0"/>
 *         &lt;element name="statisticalFunction" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticalQualifierType", propOrder = {
    "description",
    "aggregationArea",
    "aggregationLength",
    "aggregationTimePeriod",
    "aggregationVolume",
    "otherAggregation",
    "statisticalFunction"
})
public class StatisticalQualifierType {

    protected String description;
    protected AreaType aggregationArea;
    protected LengthType aggregationLength;
    protected Duration aggregationTimePeriod;
    protected VolumeType aggregationVolume;
    protected AssociationRoleType otherAggregation;
    @XmlElement(required = true)
    protected CodeType statisticalFunction;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the aggregationArea property.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getAggregationArea() {
        return aggregationArea;
    }

    /**
     * Sets the value of the aggregationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setAggregationArea(AreaType value) {
        this.aggregationArea = value;
    }

    public boolean isSetAggregationArea() {
        return (this.aggregationArea!= null);
    }

    /**
     * Gets the value of the aggregationLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getAggregationLength() {
        return aggregationLength;
    }

    /**
     * Sets the value of the aggregationLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setAggregationLength(LengthType value) {
        this.aggregationLength = value;
    }

    public boolean isSetAggregationLength() {
        return (this.aggregationLength!= null);
    }

    /**
     * Gets the value of the aggregationTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAggregationTimePeriod() {
        return aggregationTimePeriod;
    }

    /**
     * Sets the value of the aggregationTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAggregationTimePeriod(Duration value) {
        this.aggregationTimePeriod = value;
    }

    public boolean isSetAggregationTimePeriod() {
        return (this.aggregationTimePeriod!= null);
    }

    /**
     * Gets the value of the aggregationVolume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getAggregationVolume() {
        return aggregationVolume;
    }

    /**
     * Sets the value of the aggregationVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setAggregationVolume(VolumeType value) {
        this.aggregationVolume = value;
    }

    public boolean isSetAggregationVolume() {
        return (this.aggregationVolume!= null);
    }

    /**
     * Gets the value of the otherAggregation property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationRoleType }
     *     
     */
    public AssociationRoleType getOtherAggregation() {
        return otherAggregation;
    }

    /**
     * Sets the value of the otherAggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationRoleType }
     *     
     */
    public void setOtherAggregation(AssociationRoleType value) {
        this.otherAggregation = value;
    }

    public boolean isSetOtherAggregation() {
        return (this.otherAggregation!= null);
    }

    /**
     * Gets the value of the statisticalFunction property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatisticalFunction() {
        return statisticalFunction;
    }

    /**
     * Sets the value of the statisticalFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatisticalFunction(CodeType value) {
        this.statisticalFunction = value;
    }

    public boolean isSetStatisticalFunction() {
        return (this.statisticalFunction!= null);
    }

}
