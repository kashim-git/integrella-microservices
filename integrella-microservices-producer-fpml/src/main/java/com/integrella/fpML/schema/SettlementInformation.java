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
 * A type that represents the choice of methods for settling a potential currency payment resulting from a trade: by means of a standard settlement instruction, by netting it out with other payments, or with an explicit settlement instruction.
 * 
 * <p>Java class for SettlementInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="standardSettlementStyle" type="{http://www.fpml.org/FpML-5/master}StandardSettlementStyleEnum"/>
 *         &lt;element name="settlementInstruction" type="{http://www.fpml.org/FpML-5/master}SettlementInstruction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInformation", propOrder = {
    "standardSettlementStyle",
    "settlementInstruction"
})
public class SettlementInformation {

    protected StandardSettlementStyleEnum standardSettlementStyle;
    protected SettlementInstruction settlementInstruction;

    /**
     * Gets the value of the standardSettlementStyle property.
     * 
     * @return
     *     possible object is
     *     {@link StandardSettlementStyleEnum }
     *     
     */
    public StandardSettlementStyleEnum getStandardSettlementStyle() {
        return standardSettlementStyle;
    }

    /**
     * Sets the value of the standardSettlementStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardSettlementStyleEnum }
     *     
     */
    public void setStandardSettlementStyle(StandardSettlementStyleEnum value) {
        this.standardSettlementStyle = value;
    }

    /**
     * Gets the value of the settlementInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstruction }
     *     
     */
    public SettlementInstruction getSettlementInstruction() {
        return settlementInstruction;
    }

    /**
     * Sets the value of the settlementInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstruction }
     *     
     */
    public void setSettlementInstruction(SettlementInstruction value) {
        this.settlementInstruction = value;
    }

}
