//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package _int.icao.iwxxm._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;


/**
 * <p>Java class for SpaceWeatherRegionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpaceWeatherRegionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://icao.int/iwxxm/3.0}AirspaceVolumePropertyType"/>
 *         &lt;element name="locationIndicator" type="{http://icao.int/iwxxm/3.0}SpaceWeatherLocationType"/>
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpaceWeatherRegionType", propOrder = {
    "rest"
})
public class SpaceWeatherRegionType
    extends AbstractFeatureType
{

    @XmlElementRefs({
        @XmlElementRef(name = "location", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extension", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "locationIndicator", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Location" is used by two different parts of a schema. See: 
     * line 124 of file:/C:/Users/sit/git/iwxxmConverter/src/test/resources/iwxxm/3.1/spaceWxAdvisory.xsd
     * line 27 of http://schemas.opengis.net/gml/3.2.1/feature.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ExtensionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceWeatherLocationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceVolumePropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
