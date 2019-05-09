//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 02:04:43 PM MSK 
//


package _int.icao.iwxxm._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAFReportStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TAFReportStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="AMENDMENT"/>
 *     &lt;enumeration value="CANCELLATION"/>
 *     &lt;enumeration value="CORRECTION"/>
 *     &lt;enumeration value="MISSING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TAFReportStatusType")
@XmlEnum
public enum TAFReportStatusType {


    /**
     * An normal issuance of a TAF
     * 
     */
    NORMAL,

    /**
     * An amendment of an earlier TAF
     * 
     */
    AMENDMENT,

    /**
     * A cancellation of an earlier TAF
     * 
     */
    CANCELLATION,

    /**
     * A correction of an earlier TAF
     * 
     */
    CORRECTION,

    /**
     * The report is missing ("NIL" from ICAO Annex 3 / WMO No. 49)
     * 
     */
    MISSING;

    public String value() {
        return name();
    }

    public static TAFReportStatusType fromValue(String v) {
        return valueOf(v);
    }

}
