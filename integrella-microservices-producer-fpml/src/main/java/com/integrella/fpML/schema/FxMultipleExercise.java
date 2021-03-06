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
 * Describes the limits on the size of notional when multiple exercise is allowed.
 * 
 * <p>Java class for FxMultipleExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxMultipleExercise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimumNotionalAmount" type="{http://www.fpml.org/FpML-5/master}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="maximumNotionalAmount" type="{http://www.fpml.org/FpML-5/master}NonNegativeMoney" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxMultipleExercise", propOrder = {
    "minimumNotionalAmount",
    "maximumNotionalAmount"
})
public class FxMultipleExercise {

    protected NonNegativeMoney minimumNotionalAmount;
    protected NonNegativeMoney maximumNotionalAmount;

    /**
     * Gets the value of the minimumNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getMinimumNotionalAmount() {
        return minimumNotionalAmount;
    }

    /**
     * Sets the value of the minimumNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setMinimumNotionalAmount(NonNegativeMoney value) {
        this.minimumNotionalAmount = value;
    }

    /**
     * Gets the value of the maximumNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getMaximumNotionalAmount() {
        return maximumNotionalAmount;
    }

    /**
     * Sets the value of the maximumNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setMaximumNotionalAmount(NonNegativeMoney value) {
        this.maximumNotionalAmount = value;
    }

}
