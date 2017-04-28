//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the components that are common for return type swaps, including short and long form return swaps representations.
 * 
 * <p>Java class for ReturnSwapBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnSwapBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}BuyerSeller.model" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}returnSwapLeg" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="principalExchangeFeatures" type="{http://www.fpml.org/FpML-5/master}PrincipalExchangeFeatures" minOccurs="0"/>
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/FpML-5/master}ReturnSwapAdditionalPayment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnSwapBase")
@XmlSeeAlso({
    EquitySwapTransactionSupplement.class,
    ReturnSwap.class
})
public abstract class ReturnSwapBase
    extends Product
{


}