//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Allocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Allocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allocationTradeId" type="{http://www.fpml.org/FpML-5/master}TradeIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PartyAndAccountReferences.model"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="allocatedFraction" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="allocatedNotional" type="{http://www.fpml.org/FpML-5/master}Money" maxOccurs="2"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}AllocationContent.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allocation", propOrder = {
    "allocationTradeId",
    "partyReference",
    "accountReference",
    "allocatedFraction",
    "allocatedNotional",
    "collateral",
    "creditChargeAmount",
    "approvals",
    "masterConfirmationDate",
    "relatedParty"
})
public class Allocation {

    protected List<TradeIdentifier> allocationTradeId;
    protected PartyReference partyReference;
    protected AccountReference accountReference;
    protected BigDecimal allocatedFraction;
    protected List<Money> allocatedNotional;
    protected Collateral collateral;
    protected Money creditChargeAmount;
    protected Approvals approvals;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar masterConfirmationDate;
    protected List<RelatedParty> relatedParty;

    /**
     * Gets the value of the allocationTradeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allocationTradeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllocationTradeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeIdentifier }
     * 
     * 
     */
    public List<TradeIdentifier> getAllocationTradeId() {
        if (allocationTradeId == null) {
            allocationTradeId = new ArrayList<TradeIdentifier>();
        }
        return this.allocationTradeId;
    }

    /**
     * Gets the value of the partyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPartyReference() {
        return partyReference;
    }

    /**
     * Sets the value of the partyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPartyReference(PartyReference value) {
        this.partyReference = value;
    }

    /**
     * Gets the value of the accountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getAccountReference() {
        return accountReference;
    }

    /**
     * Sets the value of the accountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setAccountReference(AccountReference value) {
        this.accountReference = value;
    }

    /**
     * Gets the value of the allocatedFraction property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllocatedFraction() {
        return allocatedFraction;
    }

    /**
     * Sets the value of the allocatedFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllocatedFraction(BigDecimal value) {
        this.allocatedFraction = value;
    }

    /**
     * Gets the value of the allocatedNotional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allocatedNotional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllocatedNotional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Money }
     * 
     * 
     */
    public List<Money> getAllocatedNotional() {
        if (allocatedNotional == null) {
            allocatedNotional = new ArrayList<Money>();
        }
        return this.allocatedNotional;
    }

    /**
     * Gets the value of the collateral property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral }
     *     
     */
    public Collateral getCollateral() {
        return collateral;
    }

    /**
     * Sets the value of the collateral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral }
     *     
     */
    public void setCollateral(Collateral value) {
        this.collateral = value;
    }

    /**
     * Gets the value of the creditChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCreditChargeAmount() {
        return creditChargeAmount;
    }

    /**
     * Sets the value of the creditChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCreditChargeAmount(Money value) {
        this.creditChargeAmount = value;
    }

    /**
     * Gets the value of the approvals property.
     * 
     * @return
     *     possible object is
     *     {@link Approvals }
     *     
     */
    public Approvals getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Approvals }
     *     
     */
    public void setApprovals(Approvals value) {
        this.approvals = value;
    }

    /**
     * Gets the value of the masterConfirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMasterConfirmationDate() {
        return masterConfirmationDate;
    }

    /**
     * Sets the value of the masterConfirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMasterConfirmationDate(XMLGregorianCalendar value) {
        this.masterConfirmationDate = value;
    }

    /**
     * Gets the value of the relatedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedParty }
     * 
     * 
     */
    public List<RelatedParty> getRelatedParty() {
        if (relatedParty == null) {
            relatedParty = new ArrayList<RelatedParty>();
        }
        return this.relatedParty;
    }

}
