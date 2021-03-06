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
 * This type contains all the constituent weight and reference information.
 * 
 * <p>Java class for ReferencePoolItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencePoolItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constituentWeight" type="{http://www.fpml.org/FpML-5/master}ConstituentWeight" minOccurs="0"/>
 *         &lt;element name="referencePair" type="{http://www.fpml.org/FpML-5/master}ReferencePair" minOccurs="0"/>
 *         &lt;element name="protectionTermsReference" type="{http://www.fpml.org/FpML-5/master}ProtectionTermsReference" minOccurs="0"/>
 *         &lt;element name="settlementTermsReference" type="{http://www.fpml.org/FpML-5/master}SettlementTermsReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencePoolItem", propOrder = {
    "constituentWeight",
    "referencePair",
    "protectionTermsReference",
    "settlementTermsReference"
})
public class ReferencePoolItem {

    protected ConstituentWeight constituentWeight;
    protected ReferencePair referencePair;
    protected ProtectionTermsReference protectionTermsReference;
    protected SettlementTermsReference settlementTermsReference;

    /**
     * Gets the value of the constituentWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ConstituentWeight }
     *     
     */
    public ConstituentWeight getConstituentWeight() {
        return constituentWeight;
    }

    /**
     * Sets the value of the constituentWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstituentWeight }
     *     
     */
    public void setConstituentWeight(ConstituentWeight value) {
        this.constituentWeight = value;
    }

    /**
     * Gets the value of the referencePair property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePair }
     *     
     */
    public ReferencePair getReferencePair() {
        return referencePair;
    }

    /**
     * Sets the value of the referencePair property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePair }
     *     
     */
    public void setReferencePair(ReferencePair value) {
        this.referencePair = value;
    }

    /**
     * Gets the value of the protectionTermsReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionTermsReference }
     *     
     */
    public ProtectionTermsReference getProtectionTermsReference() {
        return protectionTermsReference;
    }

    /**
     * Sets the value of the protectionTermsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionTermsReference }
     *     
     */
    public void setProtectionTermsReference(ProtectionTermsReference value) {
        this.protectionTermsReference = value;
    }

    /**
     * Gets the value of the settlementTermsReference property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTermsReference }
     *     
     */
    public SettlementTermsReference getSettlementTermsReference() {
        return settlementTermsReference;
    }

    /**
     * Sets the value of the settlementTermsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTermsReference }
     *     
     */
    public void setSettlementTermsReference(SettlementTermsReference value) {
        this.settlementTermsReference = value;
    }

}
