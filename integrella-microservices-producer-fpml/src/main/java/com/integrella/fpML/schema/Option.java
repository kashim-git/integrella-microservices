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
 * A type for defining the common features of options. Buyer/seller information is not normally used in Transparency view but is optional in case the information is needed for administrative purposes such as Reporting Party determination.
 * 
 * <p>Java class for Option complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Option">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}BuyerSeller.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Option")
@XmlSeeAlso({
    FxAccrualOption.class,
    CommodityBasketOption.class,
    FxAccrualDigitalOption.class,
    CommodityDigitalOption.class,
    FxDigitalOption.class,
    FxOption.class,
    OptionBase.class
})
public abstract class Option
    extends Product
{


}