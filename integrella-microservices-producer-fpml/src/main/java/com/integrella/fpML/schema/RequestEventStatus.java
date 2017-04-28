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
 * A type defining the content model for a message allowing one party to query the status of one event (trade or post-trade event) previously sent to another party.
 * 
 * <p>Java class for RequestEventStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestEventStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}NonCorrectableRequestMessage">
 *       &lt;sequence>
 *         &lt;element name="businessProcess" type="{http://www.fpml.org/FpML-5/master}BusinessProcess" minOccurs="0"/>
 *         &lt;element name="eventIdentifier" type="{http://www.fpml.org/FpML-5/master}EventIdentifier" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PartiesAndAccounts.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestEventStatus", propOrder = {
    "businessProcess",
    "eventIdentifier",
    "party",
    "account"
})
public class RequestEventStatus
    extends NonCorrectableRequestMessage
{

    protected BusinessProcess businessProcess;
    protected EventIdentifier eventIdentifier;
    protected List<Party> party;
    protected List<Account> account;

    /**
     * Gets the value of the businessProcess property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcess }
     *     
     */
    public BusinessProcess getBusinessProcess() {
        return businessProcess;
    }

    /**
     * Sets the value of the businessProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcess }
     *     
     */
    public void setBusinessProcess(BusinessProcess value) {
        this.businessProcess = value;
    }

    /**
     * Gets the value of the eventIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link EventIdentifier }
     *     
     */
    public EventIdentifier getEventIdentifier() {
        return eventIdentifier;
    }

    /**
     * Sets the value of the eventIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventIdentifier }
     *     
     */
    public void setEventIdentifier(EventIdentifier value) {
        this.eventIdentifier = value;
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

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

}