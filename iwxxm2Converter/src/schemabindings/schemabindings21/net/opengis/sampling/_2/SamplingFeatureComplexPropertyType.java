//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package schemabindings21.net.opengis.sampling._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamplingFeatureComplexPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamplingFeatureComplexPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/sampling/2.0}SamplingFeatureComplex"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamplingFeatureComplexPropertyType", propOrder = {
    "samplingFeatureComplex"
})
public class SamplingFeatureComplexPropertyType {

    @XmlElement(name = "SamplingFeatureComplex", required = true)
    protected SamplingFeatureComplexType samplingFeatureComplex;

    /**
     * Gets the value of the samplingFeatureComplex property.
     * 
     * @return
     *     possible object is
     *     {@link SamplingFeatureComplexType }
     *     
     */
    public SamplingFeatureComplexType getSamplingFeatureComplex() {
        return samplingFeatureComplex;
    }

    /**
     * Sets the value of the samplingFeatureComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplingFeatureComplexType }
     *     
     */
    public void setSamplingFeatureComplex(SamplingFeatureComplexType value) {
        this.samplingFeatureComplex = value;
    }

    public boolean isSetSamplingFeatureComplex() {
        return (this.samplingFeatureComplex!= null);
    }

}
