//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package aero.aixm.schema._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightRestrictionLevelPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightRestrictionLevelPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}FlightRestrictionLevel"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRestrictionLevelPropertyType", propOrder = {
    "flightRestrictionLevel"
})
public class FlightRestrictionLevelPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "FlightRestrictionLevel", required = true)
    protected FlightRestrictionLevelType flightRestrictionLevel;

    /**
     * Gets the value of the flightRestrictionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRestrictionLevelType }
     *     
     */
    public FlightRestrictionLevelType getFlightRestrictionLevel() {
        return flightRestrictionLevel;
    }

    /**
     * Sets the value of the flightRestrictionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRestrictionLevelType }
     *     
     */
    public void setFlightRestrictionLevel(FlightRestrictionLevelType value) {
        this.flightRestrictionLevel = value;
    }

    public boolean isSetFlightRestrictionLevel() {
        return (this.flightRestrictionLevel!= null);
    }

}
