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
 * <p>Java class for AltimeterSourceStatusPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltimeterSourceStatusPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AltimeterSourceStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltimeterSourceStatusPropertyType", propOrder = {
    "altimeterSourceStatus"
})
public class AltimeterSourceStatusPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AltimeterSourceStatus", required = true)
    protected AltimeterSourceStatusType altimeterSourceStatus;

    /**
     * Gets the value of the altimeterSourceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AltimeterSourceStatusType }
     *     
     */
    public AltimeterSourceStatusType getAltimeterSourceStatus() {
        return altimeterSourceStatus;
    }

    /**
     * Sets the value of the altimeterSourceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltimeterSourceStatusType }
     *     
     */
    public void setAltimeterSourceStatus(AltimeterSourceStatusType value) {
        this.altimeterSourceStatus = value;
    }

    public boolean isSetAltimeterSourceStatus() {
        return (this.altimeterSourceStatus!= null);
    }

}
