//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package _int.wmo.def.opm._2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.ReferenceType;


/**
 * The «CodeList» class 'StatisticalFunctionCode' specifies the type of statistical function that is applied to the base observable property to define the statistical summary; e.g. maximum air temperature.
 * 
 * Note that WMO provides two code-tables listing statistical operators: 
 * - WMO No. 306 Vol I.2 Part B FM 92 GRIB code-table 4.10 'Type of statistical processing'; and
 * - WMO No. 306 Vol I.2 Part B FM 94 BUFR code-table 0 08 023 'First-order statistics'
 * 
 * The GRIB2 code-table is defined as the 'recommended' vocabulary for this «CodeList» class but lacks some of the necessary terms. For example, the GRIB code-table includes 'Average' but does not include 'Mean', 'Mode' or 'Median' (which can be found in the BUFR code-table). However, the BUFR code-table is _NOT_ chosen because 'Accumulation' is entirely missing. Given that 'extensibility' is set to 'any', authors are free to refer to their preferred 'statistical operator' vocabulary. The GRIB code-table is only a recommendation. 
 * 
 * <p>Java class for StatisticalFunctionCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticalFunctionCodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}ReferenceType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticalFunctionCodeType")
public class StatisticalFunctionCodeType
    extends ReferenceType
{


}
