//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package _int.icao.iwxxm._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolcanicAshSIGMETPositionCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolcanicAshSIGMETPositionCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://icao.int/iwxxm/3.0}SIGMETPositionCollectionType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="volcanoId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolcanicAshSIGMETPositionCollectionType")
public class VolcanicAshSIGMETPositionCollectionType
    extends SIGMETPositionCollectionType
{

    @XmlAttribute(name = "volcanoId", required = true)
    protected String volcanoId;

    /**
     * Gets the value of the volcanoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolcanoId() {
        return volcanoId;
    }

    /**
     * Sets the value of the volcanoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolcanoId(String value) {
        this.volcanoId = value;
    }

    public boolean isSetVolcanoId() {
        return (this.volcanoId!= null);
    }

}
