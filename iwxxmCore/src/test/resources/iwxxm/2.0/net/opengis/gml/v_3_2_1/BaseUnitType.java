//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 02:04:43 PM MSK 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseUnitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}UnitDefinitionType">
 *       &lt;sequence>
 *         &lt;element name="unitsSystem" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseUnitType", propOrder = {
    "unitsSystem"
})
public class BaseUnitType
    extends UnitDefinitionType
{

    @XmlElement(required = true)
    protected ReferenceType unitsSystem;

    /**
     * Gets the value of the unitsSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getUnitsSystem() {
        return unitsSystem;
    }

    /**
     * Sets the value of the unitsSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setUnitsSystem(ReferenceType value) {
        this.unitsSystem = value;
    }

    public boolean isSetUnitsSystem() {
        return (this.unitsSystem!= null);
    }

}
