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
 * <p>Java class for InterestDirection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestDirection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="singleDirection" type="{http://www.fpml.org/FpML-5/master}SingleDirectionInterestRequirement"/>
 *         &lt;element name="bothDirections" type="{http://www.fpml.org/FpML-5/master}BothDirectionsInterestRequirement"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestDirection", propOrder = {
    "singleDirection",
    "bothDirections"
})
public class InterestDirection {

    protected SingleDirectionInterestRequirement singleDirection;
    protected BothDirectionsInterestRequirement bothDirections;

    /**
     * Gets the value of the singleDirection property.
     * 
     * @return
     *     possible object is
     *     {@link SingleDirectionInterestRequirement }
     *     
     */
    public SingleDirectionInterestRequirement getSingleDirection() {
        return singleDirection;
    }

    /**
     * Sets the value of the singleDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleDirectionInterestRequirement }
     *     
     */
    public void setSingleDirection(SingleDirectionInterestRequirement value) {
        this.singleDirection = value;
    }

    /**
     * Gets the value of the bothDirections property.
     * 
     * @return
     *     possible object is
     *     {@link BothDirectionsInterestRequirement }
     *     
     */
    public BothDirectionsInterestRequirement getBothDirections() {
        return bothDirections;
    }

    /**
     * Sets the value of the bothDirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BothDirectionsInterestRequirement }
     *     
     */
    public void setBothDirections(BothDirectionsInterestRequirement value) {
        this.bothDirections = value;
    }

}
