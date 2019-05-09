//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 02:04:43 PM MSK 
//


package _int.wmo.def.opm._2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstraintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constraintProperty" type="{http://def.wmo.int/opm/2013}ObservablePropertyPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintType", propOrder = {
    "description",
    "constraintProperty"
})
@XmlSeeAlso({
    CategoryConstraintType.class,
    RangeConstraintType.class,
    ScalarConstraintType.class
})
public class ConstraintType {

    protected String description;
    @XmlElement(required = true)
    protected ObservablePropertyPropertyType constraintProperty;

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
     * Gets the value of the constraintProperty property.
     * 
     * @return
     *     possible object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public ObservablePropertyPropertyType getConstraintProperty() {
        return constraintProperty;
    }

    /**
     * Sets the value of the constraintProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public void setConstraintProperty(ObservablePropertyPropertyType value) {
        this.constraintProperty = value;
    }

    public boolean isSetConstraintProperty() {
        return (this.constraintProperty!= null);
    }

}
