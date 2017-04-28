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
 * A type specifying the date from which the early termination clause can be exercised.
 * 
 * <p>Java class for StartingDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartingDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="dateRelativeTo" type="{http://www.fpml.org/FpML-5/master}DateReference"/>
 *         &lt;element name="adjustableDate" type="{http://www.fpml.org/FpML-5/master}AdjustableDate"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartingDate", propOrder = {
    "dateRelativeTo",
    "adjustableDate"
})
public class StartingDate {

    protected DateReference dateRelativeTo;
    protected AdjustableDate adjustableDate;

    /**
     * Gets the value of the dateRelativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link DateReference }
     *     
     */
    public DateReference getDateRelativeTo() {
        return dateRelativeTo;
    }

    /**
     * Sets the value of the dateRelativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateReference }
     *     
     */
    public void setDateRelativeTo(DateReference value) {
        this.dateRelativeTo = value;
    }

    /**
     * Gets the value of the adjustableDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getAdjustableDate() {
        return adjustableDate;
    }

    /**
     * Sets the value of the adjustableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setAdjustableDate(AdjustableDate value) {
        this.adjustableDate = value;
    }

}