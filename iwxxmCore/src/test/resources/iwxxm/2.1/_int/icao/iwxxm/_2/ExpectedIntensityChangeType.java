//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:33:13 PM MSK 
//


package _int.icao.iwxxm._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpectedIntensityChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpectedIntensityChangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_CHANGE"/>
 *     &lt;enumeration value="WEAKEN"/>
 *     &lt;enumeration value="INTENSIFY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpectedIntensityChangeType")
@XmlEnum
public enum ExpectedIntensityChangeType {


    /**
     * No change (NC)
     * 
     */
    NO_CHANGE,

    /**
     * Forecast to weaken (WKN)
     * 
     */
    WEAKEN,

    /**
     * Forecast to intensify (INTSF)
     * 
     */
    INTENSIFY;

    public String value() {
        return name();
    }

    public static ExpectedIntensityChangeType fromValue(String v) {
        return valueOf(v);
    }

}
