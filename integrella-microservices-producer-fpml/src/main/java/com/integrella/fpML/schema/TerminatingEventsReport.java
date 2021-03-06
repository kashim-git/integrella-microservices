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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type defining the content model for a message allowing one party to send a report consisting of a series of maturity and option expiry events for trades. This can be used either for upcoming expirations/maturities, or for already completed events.
 * 
 * <p>Java class for TerminatingEventsReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminatingEventsReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}NotificationMessage">
 *       &lt;sequence>
 *         &lt;element name="asOfDate" type="{http://www.fpml.org/FpML-5/master}IdentifiedDate" minOccurs="0"/>
 *         &lt;element name="reportContents" type="{http://www.fpml.org/FpML-5/master}ReportContents" minOccurs="0"/>
 *         &lt;element name="fromDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}MaturityAndExpiryEvents.model" maxOccurs="unbounded"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PartiesAndAccounts.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminatingEventsReport", propOrder = {
    "asOfDate",
    "reportContents",
    "fromDateTime",
    "toDateTime",
    "maturityAndExpiryEventsModel",
    "party",
    "account"
})
public class TerminatingEventsReport
    extends NotificationMessage
{

    protected IdentifiedDate asOfDate;
    protected ReportContents reportContents;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDateTime;
    @XmlElements({
        @XmlElement(name = "optionExpiry", type = OptionExpiryBase.class),
        @XmlElement(name = "tradeMaturity", type = TradeMaturity.class)
    })
    protected List<Object> maturityAndExpiryEventsModel;
    protected List<Party> party;
    protected List<Account> account;

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setAsOfDate(IdentifiedDate value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the reportContents property.
     * 
     * @return
     *     possible object is
     *     {@link ReportContents }
     *     
     */
    public ReportContents getReportContents() {
        return reportContents;
    }

    /**
     * Sets the value of the reportContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportContents }
     *     
     */
    public void setReportContents(ReportContents value) {
        this.reportContents = value;
    }

    /**
     * Gets the value of the fromDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDateTime() {
        return fromDateTime;
    }

    /**
     * Sets the value of the fromDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDateTime(XMLGregorianCalendar value) {
        this.fromDateTime = value;
    }

    /**
     * Gets the value of the toDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDateTime() {
        return toDateTime;
    }

    /**
     * Sets the value of the toDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDateTime(XMLGregorianCalendar value) {
        this.toDateTime = value;
    }

    /**
     * Gets the value of the maturityAndExpiryEventsModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maturityAndExpiryEventsModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaturityAndExpiryEventsModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionExpiryBase }
     * {@link TradeMaturity }
     * 
     * 
     */
    public List<Object> getMaturityAndExpiryEventsModel() {
        if (maturityAndExpiryEventsModel == null) {
            maturityAndExpiryEventsModel = new ArrayList<Object>();
        }
        return this.maturityAndExpiryEventsModel;
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
