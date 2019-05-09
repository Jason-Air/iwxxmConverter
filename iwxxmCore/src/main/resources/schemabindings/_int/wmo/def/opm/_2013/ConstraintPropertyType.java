//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 02:04:43 PM MSK 
//


package _int.wmo.def.opm._2013;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstraintPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstraintPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://def.wmo.int/opm/2013}Constraint"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintPropertyType", propOrder = {
    "constraint"
})
public class ConstraintPropertyType {

    @XmlElementRef(name = "Constraint", namespace = "http://def.wmo.int/opm/2013", type = JAXBElement.class)
    protected JAXBElement<? extends ConstraintType> constraint;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the constraint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConstraintType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoryConstraintType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RangeConstraintType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScalarConstraintType }{@code >}
     *     
     */
    public JAXBElement<? extends ConstraintType> getConstraint() {
        return constraint;
    }

    /**
     * Sets the value of the constraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConstraintType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CategoryConstraintType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RangeConstraintType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScalarConstraintType }{@code >}
     *     
     */
    public void setConstraint(JAXBElement<? extends ConstraintType> value) {
        this.constraint = value;
    }

    public boolean isSetConstraint() {
        return (this.constraint!= null);
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

}
