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
 * A type to define business date convention adjustment to final payment period per leg. - For use with pre-trade Credit Limit Check messages.
 * 
 * <p>Java class for FinalCalculationPeriodDateAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinalCalculationPeriodDateAdjustment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relevantUnderlyingDateReference" type="{http://www.fpml.org/FpML-5/master}RelevantUnderlyingDateReference" minOccurs="0"/>
 *         &lt;element name="swapStreamReference" type="{http://www.fpml.org/FpML-5/master}InterestRateStreamReference" minOccurs="0"/>
 *         &lt;element name="businessDayConvention" type="{http://www.fpml.org/FpML-5/master}BusinessDayConventionEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinalCalculationPeriodDateAdjustment", propOrder = {
    "relevantUnderlyingDateReference",
    "swapStreamReference",
    "businessDayConvention"
})
public class FinalCalculationPeriodDateAdjustment {

    protected RelevantUnderlyingDateReference relevantUnderlyingDateReference;
    protected InterestRateStreamReference swapStreamReference;
    protected BusinessDayConventionEnum businessDayConvention;

    /**
     * Gets the value of the relevantUnderlyingDateReference property.
     * 
     * @return
     *     possible object is
     *     {@link RelevantUnderlyingDateReference }
     *     
     */
    public RelevantUnderlyingDateReference getRelevantUnderlyingDateReference() {
        return relevantUnderlyingDateReference;
    }

    /**
     * Sets the value of the relevantUnderlyingDateReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelevantUnderlyingDateReference }
     *     
     */
    public void setRelevantUnderlyingDateReference(RelevantUnderlyingDateReference value) {
        this.relevantUnderlyingDateReference = value;
    }

    /**
     * Gets the value of the swapStreamReference property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateStreamReference }
     *     
     */
    public InterestRateStreamReference getSwapStreamReference() {
        return swapStreamReference;
    }

    /**
     * Sets the value of the swapStreamReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateStreamReference }
     *     
     */
    public void setSwapStreamReference(InterestRateStreamReference value) {
        this.swapStreamReference = value;
    }

    /**
     * Gets the value of the businessDayConvention property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayConventionEnum }
     *     
     */
    public BusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    /**
     * Sets the value of the businessDayConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayConventionEnum }
     *     
     */
    public void setBusinessDayConvention(BusinessDayConventionEnum value) {
        this.businessDayConvention = value;
    }

}