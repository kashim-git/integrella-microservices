//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityBasketUnderlyingByPercentage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityBasketUnderlyingByPercentage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}CommodityBasketUnderlyingBase">
 *       &lt;sequence>
 *         &lt;element name="constituentWeight" type="{http://www.fpml.org/FpML-5/master}NonNegativeDecimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityBasketUnderlyingByPercentage", propOrder = {
    "constituentWeight"
})
public class CommodityBasketUnderlyingByPercentage
    extends CommodityBasketUnderlyingBase
{

    protected BigDecimal constituentWeight;

    /**
     * Gets the value of the constituentWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConstituentWeight() {
        return constituentWeight;
    }

    /**
     * Sets the value of the constituentWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConstituentWeight(BigDecimal value) {
        this.constituentWeight = value;
    }

}