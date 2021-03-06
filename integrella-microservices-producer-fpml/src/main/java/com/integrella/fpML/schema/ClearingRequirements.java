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
 * <p>Java class for ClearingRequirements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearingRequirements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supervisoryBody" type="{http://www.fpml.org/FpML-5/master}SupervisoryBody" minOccurs="0"/>
 *         &lt;element name="mandatorilyClearable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.fpml.org/FpML-5/master}Reason" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingRequirements", propOrder = {
    "supervisoryBody",
    "mandatorilyClearable",
    "reason"
})
public class ClearingRequirements {

    protected SupervisoryBody supervisoryBody;
    protected Boolean mandatorilyClearable;
    protected List<Reason> reason;

    /**
     * Gets the value of the supervisoryBody property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisoryBody }
     *     
     */
    public SupervisoryBody getSupervisoryBody() {
        return supervisoryBody;
    }

    /**
     * Sets the value of the supervisoryBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisoryBody }
     *     
     */
    public void setSupervisoryBody(SupervisoryBody value) {
        this.supervisoryBody = value;
    }

    /**
     * Gets the value of the mandatorilyClearable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatorilyClearable() {
        return mandatorilyClearable;
    }

    /**
     * Sets the value of the mandatorilyClearable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatorilyClearable(Boolean value) {
        this.mandatorilyClearable = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reason }
     * 
     * 
     */
    public List<Reason> getReason() {
        if (reason == null) {
            reason = new ArrayList<Reason>();
        }
        return this.reason;
    }

}
