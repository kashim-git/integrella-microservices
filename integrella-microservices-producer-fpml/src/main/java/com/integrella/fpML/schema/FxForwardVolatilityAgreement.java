//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a contract on future levels of implied volatility. The main characteristic of this product is that the underlying is a straddle (underlying options) with a specific tenor starting from the fixing (effective or pricing) date, and are priced on that fixing date using a level of volatility that is agreed at the time of execution of the volatility agreement.
 * 
 * <p>Java class for FxForwardVolatilityAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxForwardVolatilityAgreement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}BuyerSeller.model"/>
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/master}QuotedCurrencyPair" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="fixingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;sequence>
 *             &lt;element name="tenorPeriod" type="{http://www.fpml.org/FpML-5/master}Period"/>
 *             &lt;element name="fixingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="fixingTime" type="{http://www.fpml.org/FpML-5/master}BusinessCenterTime" minOccurs="0"/>
 *         &lt;element name="forwardVolatilityStrikePrice" type="{http://www.fpml.org/FpML-5/master}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="straddle" type="{http://www.fpml.org/FpML-5/master}FxStraddle" minOccurs="0"/>
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/FpML-5/master}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxForwardVolatilityAgreement")
public class FxForwardVolatilityAgreement
    extends Product
{


}
