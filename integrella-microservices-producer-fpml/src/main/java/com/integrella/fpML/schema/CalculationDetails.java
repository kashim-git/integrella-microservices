//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A cashflow component with optional calculation details that explain how the cashflow amount was computed.
 * 
 * <p>Java class for CalculationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grossCashflow" type="{http://www.fpml.org/FpML-5/master}GrossCashflow" minOccurs="0"/>
 *         &lt;element name="observationElements" type="{http://www.fpml.org/FpML-5/master}CashflowObservation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="calculationElements" type="{http://www.fpml.org/FpML-5/master}CashflowCalculationElements" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationDetails", propOrder = {
    "grossCashflow",
    "observationElements",
    "calculationElements"
})
public class CalculationDetails {

    protected GrossCashflow grossCashflow;
    protected List<CashflowObservation> observationElements;
    protected CashflowCalculationElements calculationElements;

    /**
     * Gets the value of the grossCashflow property.
     * 
     * @return
     *     possible object is
     *     {@link GrossCashflow }
     *     
     */
    public GrossCashflow getGrossCashflow() {
        return grossCashflow;
    }

    /**
     * Sets the value of the grossCashflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossCashflow }
     *     
     */
    public void setGrossCashflow(GrossCashflow value) {
        this.grossCashflow = value;
    }

    /**
     * Gets the value of the observationElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observationElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservationElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashflowObservation }
     * 
     * 
     */
    public List<CashflowObservation> getObservationElements() {
        if (observationElements == null) {
            observationElements = new ArrayList<CashflowObservation>();
        }
        return this.observationElements;
    }

    /**
     * Gets the value of the calculationElements property.
     * 
     * @return
     *     possible object is
     *     {@link CashflowCalculationElements }
     *     
     */
    public CashflowCalculationElements getCalculationElements() {
        return calculationElements;
    }

    /**
     * Sets the value of the calculationElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashflowCalculationElements }
     *     
     */
    public void setCalculationElements(CashflowCalculationElements value) {
        this.calculationElements = value;
    }

}
