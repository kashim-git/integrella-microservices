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
 * A loan servicing notification which can be used to communicate any facility-level business event.
 * 
 * <p>Java class for FacilityNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityNotification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}AbstractFacilityNotification">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/master}facilityEventGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}FacilityDetails.model"/>
 *         &lt;element name="party" type="{http://www.fpml.org/FpML-5/master}Party" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityNotification", propOrder = {
    "facilityEventGroup",
    "facilityIdentifier",
    "facilitySummary",
    "party"
})
public class FacilityNotification
    extends AbstractFacilityNotification
{

    @XmlElementRef(name = "facilityEventGroup", namespace = "http://www.fpml.org/FpML-5/master", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FacilityEvent> facilityEventGroup;
    protected FacilityIdentifier facilityIdentifier;
    protected FacilitySummary facilitySummary;
    protected List<Party> party;

    /**
     * Gets the value of the facilityEventGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommitmentAdjustment }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityTermination }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityEvent }{@code >}
     *     
     */
    public JAXBElement<? extends FacilityEvent> getFacilityEventGroup() {
        return facilityEventGroup;
    }

    /**
     * Sets the value of the facilityEventGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommitmentAdjustment }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityTermination }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityEvent }{@code >}
     *     
     */
    public void setFacilityEventGroup(JAXBElement<? extends FacilityEvent> value) {
        this.facilityEventGroup = value;
    }

    /**
     * Gets the value of the facilityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityIdentifier }
     *     
     */
    public FacilityIdentifier getFacilityIdentifier() {
        return facilityIdentifier;
    }

    /**
     * Sets the value of the facilityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityIdentifier }
     *     
     */
    public void setFacilityIdentifier(FacilityIdentifier value) {
        this.facilityIdentifier = value;
    }

    /**
     * Gets the value of the facilitySummary property.
     * 
     * @return
     *     possible object is
     *     {@link FacilitySummary }
     *     
     */
    public FacilitySummary getFacilitySummary() {
        return facilitySummary;
    }

    /**
     * Sets the value of the facilitySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilitySummary }
     *     
     */
    public void setFacilitySummary(FacilitySummary value) {
        this.facilitySummary = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

}