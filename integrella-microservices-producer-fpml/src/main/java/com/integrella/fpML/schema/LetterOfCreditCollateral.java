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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines a letter of credit.
 * 
 * <p>Java class for LetterOfCreditCollateral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterOfCreditCollateral">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}LcSummary">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.fpml.org/FpML-5/master}NonNegativeDecimal" minOccurs="0"/>
 *         &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="marketValue" type="{http://www.fpml.org/FpML-5/master}NonNegativeDecimal" minOccurs="0"/>
 *         &lt;element name="haircut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="collateralValue" type="{http://www.fpml.org/FpML-5/master}NonNegativeDecimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterOfCreditCollateral", propOrder = {
    "amount",
    "valueDate",
    "marketValue",
    "haircut",
    "collateralValue"
})
public class LetterOfCreditCollateral
    extends LcSummary
{

    protected BigDecimal amount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate;
    protected BigDecimal marketValue;
    protected BigDecimal haircut;
    protected BigDecimal collateralValue;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the marketValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarketValue() {
        return marketValue;
    }

    /**
     * Sets the value of the marketValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarketValue(BigDecimal value) {
        this.marketValue = value;
    }

    /**
     * Gets the value of the haircut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHaircut() {
        return haircut;
    }

    /**
     * Sets the value of the haircut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHaircut(BigDecimal value) {
        this.haircut = value;
    }

    /**
     * Gets the value of the collateralValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollateralValue() {
        return collateralValue;
    }

    /**
     * Sets the value of the collateralValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollateralValue(BigDecimal value) {
        this.collateralValue = value;
    }

}