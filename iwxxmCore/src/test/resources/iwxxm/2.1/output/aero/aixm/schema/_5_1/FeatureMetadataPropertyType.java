//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package aero.aixm.schema._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractMetadataPropertyType;
import org.isotc211._2005.gmd.MDMetadataType;


/**
 * <p>Java class for FeatureMetadataPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureMetadataPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}MD_Metadata"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureMetadataPropertyType", propOrder = {
    "mdMetadata"
})
public class FeatureMetadataPropertyType
    extends AbstractMetadataPropertyType
{

    @XmlElement(name = "MD_Metadata", namespace = "http://www.isotc211.org/2005/gmd")
    protected MDMetadataType mdMetadata;

    /**
     * Gets the value of the mdMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link MDMetadataType }
     *     
     */
    public MDMetadataType getMDMetadata() {
        return mdMetadata;
    }

    /**
     * Sets the value of the mdMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMetadataType }
     *     
     */
    public void setMDMetadata(MDMetadataType value) {
        this.mdMetadata = value;
    }

    public boolean isSetMDMetadata() {
        return (this.mdMetadata!= null);
    }

}
