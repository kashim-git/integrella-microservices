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
 * <p>Java class for SingleDirectionInterestRequirement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleDirectionInterestRequirement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleTreatment" type="{http://www.fpml.org/FpML-5/master}SingleTreatment" minOccurs="0"/>
 *         &lt;element name="interestAccrued" type="{http://www.fpml.org/FpML-5/master}InterestAccrued" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleDirectionInterestRequirement", propOrder = {
    "singleTreatment",
    "interestAccrued"
})
public class SingleDirectionInterestRequirement {

    protected SingleTreatment singleTreatment;
    protected InterestAccrued interestAccrued;

    /**
     * Gets the value of the singleTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link SingleTreatment }
     *     
     */
    public SingleTreatment getSingleTreatment() {
        return singleTreatment;
    }

    /**
     * Sets the value of the singleTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleTreatment }
     *     
     */
    public void setSingleTreatment(SingleTreatment value) {
        this.singleTreatment = value;
    }

    /**
     * Gets the value of the interestAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link InterestAccrued }
     *     
     */
    public InterestAccrued getInterestAccrued() {
        return interestAccrued;
    }

    /**
     * Sets the value of the interestAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestAccrued }
     *     
     */
    public void setInterestAccrued(InterestAccrued value) {
        this.interestAccrued = value;
    }

}
