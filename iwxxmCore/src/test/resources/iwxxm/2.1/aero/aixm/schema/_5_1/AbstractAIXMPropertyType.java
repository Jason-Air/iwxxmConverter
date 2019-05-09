//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:33:13 PM MSK 
//


package aero.aixm.schema._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * It provides a basis for deriving AIXM feature/object properties. It defines the nilReason attribute and currently, it is only used for properties that are derived from association with an AIM object.
 * 
 * <p>Java class for AbstractAIXMPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="nilReason" type="{http://www.opengis.net/gml/3.2}NilReasonEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMPropertyType")
@XmlSeeAlso({
    ElevatedPointPropertyType.class,
    CurvePropertyType.class,
    ElevatedSurfacePropertyType.class,
    AirspaceVolumePropertyType.class,
    AirspaceGeometryComponentPropertyType.class,
    SurfacePropertyType.class,
    ElevatedCurvePropertyType.class,
    PointPropertyType.class
})
public abstract class AbstractAIXMPropertyType {

    @XmlAttribute(name = "nilReason")
    protected String nilReason;

    /**
     * Gets the value of the nilReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNilReason() {
        return nilReason;
    }

    /**
     * Sets the value of the nilReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNilReason(String value) {
        this.nilReason = value;
    }

    public boolean isSetNilReason() {
        return (this.nilReason!= null);
    }

}
