//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 02:04:43 PM MSK 
//


package org.isotc211._2005.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.RecordTypePropertyType;


/**
 * Information about the domain of the raster cell
 * 
 * <p>Java class for MD_CoverageDescription_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_CoverageDescription_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/org.isotc211._2005.gmd}AbstractMD_ContentInformation_Type">
 *       &lt;sequence>
 *         &lt;element name="attributeDescription" type="{http://www.isotc211.org/2005/gco}RecordType_PropertyType"/>
 *         &lt;element name="contentType" type="{http://www.isotc211.org/2005/org.isotc211._2005.gmd}MD_CoverageContentTypeCode_PropertyType"/>
 *         &lt;element name="dimension" type="{http://www.isotc211.org/2005/org.isotc211._2005.gmd}MD_RangeDimension_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_CoverageDescription_Type", propOrder = {
    "attributeDescription",
    "contentType",
    "dimension"
})
@XmlSeeAlso({
    MDImageDescriptionType.class
})
public class MDCoverageDescriptionType
    extends AbstractMDContentInformationType
{

    @XmlElement(required = true)
    protected RecordTypePropertyType attributeDescription;
    @XmlElement(required = true)
    protected MDCoverageContentTypeCodePropertyType contentType;
    protected List<MDRangeDimensionPropertyType> dimension;

    /**
     * Gets the value of the attributeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public RecordTypePropertyType getAttributeDescription() {
        return attributeDescription;
    }

    /**
     * Sets the value of the attributeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public void setAttributeDescription(RecordTypePropertyType value) {
        this.attributeDescription = value;
    }

    public boolean isSetAttributeDescription() {
        return (this.attributeDescription!= null);
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link MDCoverageContentTypeCodePropertyType }
     *     
     */
    public MDCoverageContentTypeCodePropertyType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCoverageContentTypeCodePropertyType }
     *     
     */
    public void setContentType(MDCoverageContentTypeCodePropertyType value) {
        this.contentType = value;
    }

    public boolean isSetContentType() {
        return (this.contentType!= null);
    }

    /**
     * Gets the value of the dimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRangeDimensionPropertyType }
     * 
     * 
     */
    public List<MDRangeDimensionPropertyType> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<MDRangeDimensionPropertyType>();
        }
        return this.dimension;
    }

    public boolean isSetDimension() {
        return ((this.dimension!= null)&&(!this.dimension.isEmpty()));
    }

    public void unsetDimension() {
        this.dimension = null;
    }

}
