//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A syndicated bank loan deal (credit agreement) definition.
 * 
 * <p>Java class for Deal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Deal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}DealSummary">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}DealRules.model"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}facilityGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deal", propOrder = {
    "assignmentFee",
    "proRataFacilities",
    "facilityGroup"
})
public class Deal
    extends DealSummary
{

    protected AssignmentFee assignmentFee;
    protected List<ProRataFacilities> proRataFacilities;
    @XmlElementRef(name = "facilityGroup", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends Facility>> facilityGroup;

    /**
     * Gets the value of the assignmentFee property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentFee }
     *     
     */
    public AssignmentFee getAssignmentFee() {
        return assignmentFee;
    }

    /**
     * Sets the value of the assignmentFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentFee }
     *     
     */
    public void setAssignmentFee(AssignmentFee value) {
        this.assignmentFee = value;
    }

    /**
     * Gets the value of the proRataFacilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proRataFacilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProRataFacilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProRataFacilities }
     * 
     * 
     */
    public List<ProRataFacilities> getProRataFacilities() {
        if (proRataFacilities == null) {
            proRataFacilities = new ArrayList<ProRataFacilities>();
        }
        return this.proRataFacilities;
    }

    /**
     * Gets the value of the facilityGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Revolver }{@code >}
     * {@link JAXBElement }{@code <}{@link DelayedDraw }{@code >}
     * {@link JAXBElement }{@code <}{@link LetterOfCreditFacility }{@code >}
     * {@link JAXBElement }{@code <}{@link TermLoan }{@code >}
     * {@link JAXBElement }{@code <}{@link Facility }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Facility>> getFacilityGroup() {
        if (facilityGroup == null) {
            facilityGroup = new ArrayList<JAXBElement<? extends Facility>>();
        }
        return this.facilityGroup;
    }

}