//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 02:04:43 PM MSK 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The TemporalDatumBaseType partially defines the origin of a temporal coordinate reference system. This type restricts the AbstractDatumType to remove the "anchorDefinition" and "realizationEpoch" elements.
 * 
 * <p>Java class for TemporalDatumBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemporalDatumBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}metaDataProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}description" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}descriptionReference" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}identifier"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalDatumBaseType")
@XmlSeeAlso({
    TemporalDatumType.class
})
public abstract class TemporalDatumBaseType
    extends AbstractDatumType
{


}
