//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:33:13 PM MSK 
//


package _int.icao.iwxxm._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractGMLType;


/**
 * <p>Java class for AerodromeCloudForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeCloudForecastType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element name="verticalVisibility" type="{http://icao.int/iwxxm/2.1}LengthWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="layer" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://icao.int/iwxxm/2.1}CloudLayerPropertyType">
 *                 &lt;attribute name="nilReason" type="{http://www.opengis.net/gml/3.2}NilReasonType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeCloudForecastType", propOrder = {
    "verticalVisibility",
    "layer",
    "extension"
})
public class AerodromeCloudForecastType
    extends AbstractGMLType
{

    @XmlElementRef(name = "verticalVisibility", namespace = "http://icao.int/iwxxm/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<LengthWithNilReasonType> verticalVisibility;
    @XmlElement(nillable = true)
    protected List<AerodromeCloudForecastType.Layer> layer;
    protected List<Object> extension;

    /**
     * Gets the value of the verticalVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LengthWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<LengthWithNilReasonType> getVerticalVisibility() {
        return verticalVisibility;
    }

    /**
     * Sets the value of the verticalVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LengthWithNilReasonType }{@code >}
     *     
     */
    public void setVerticalVisibility(JAXBElement<LengthWithNilReasonType> value) {
        this.verticalVisibility = value;
    }

    public boolean isSetVerticalVisibility() {
        return (this.verticalVisibility!= null);
    }

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeCloudForecastType.Layer }
     * 
     * 
     */
    public List<AerodromeCloudForecastType.Layer> getLayer() {
        if (layer == null) {
            layer = new ArrayList<AerodromeCloudForecastType.Layer>();
        }
        return this.layer;
    }

    public boolean isSetLayer() {
        return ((this.layer!= null)&&(!this.layer.isEmpty()));
    }

    public void unsetLayer() {
        this.layer = null;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://icao.int/iwxxm/2.1}CloudLayerPropertyType">
     *       &lt;attribute name="nilReason" type="{http://www.opengis.net/gml/3.2}NilReasonType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Layer
        extends CloudLayerPropertyType
    {

        @XmlAttribute(name = "nilReason")
        protected List<String> nilReason;

        /**
         * Gets the value of the nilReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nilReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNilReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNilReason() {
            if (nilReason == null) {
                nilReason = new ArrayList<String>();
            }
            return this.nilReason;
        }

        public boolean isSetNilReason() {
            return ((this.nilReason!= null)&&(!this.nilReason.isEmpty()));
        }

        public void unsetNilReason() {
            this.nilReason = null;
        }

    }

}
