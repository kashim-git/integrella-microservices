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
 * An extension of the money type with the ability to specify a lender share amount in addition to the global amount (represented by 'amount').
 * 
 * <p>Java class for MoneyWithParticipantShare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyWithParticipantShare">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}NonNegativeMoney">
 *       &lt;sequence>
 *         &lt;element name="shareAmount" type="{http://www.fpml.org/FpML-5/master}NonNegativeDecimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyWithParticipantShare", propOrder = {
    "shareAmount"
})
public class MoneyWithParticipantShare
    extends NonNegativeMoney
{

    protected BigDecimal shareAmount;

    /**
     * Gets the value of the shareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShareAmount() {
        return shareAmount;
    }

    /**
     * Sets the value of the shareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShareAmount(BigDecimal value) {
        this.shareAmount = value;
    }

}