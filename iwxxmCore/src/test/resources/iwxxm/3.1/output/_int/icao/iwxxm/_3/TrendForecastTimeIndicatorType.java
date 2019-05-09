//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package _int.icao.iwxxm._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrendForecastTimeIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrendForecastTimeIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="UNTIL"/>
 *     &lt;enumeration value="FROM"/>
 *     &lt;enumeration value="FROM_UNTIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrendForecastTimeIndicatorType")
@XmlEnum
public enum TrendForecastTimeIndicatorType {


    /**
     * This trend forecast specifies a time instant at which time conditions occur (AT)
     * 
     */
    AT,

    /**
     * This trend forecast specifies a time period which commences at the beginning of the trend forecast period and is completed by a specified time (TL)
     * 
     */
    UNTIL,

    /**
     * This trend forecast specifies a time period which commences at a specified time and is completed by the end of the trend forecast period (FM)
     * 
     */
    FROM,

    /**
     * This trend forecast specifies a time period which commences at a specified time and is completed by another specified time (FM and TL)
     * 
     */
    FROM_UNTIL;

    public String value() {
        return name();
    }

    public static TrendForecastTimeIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
