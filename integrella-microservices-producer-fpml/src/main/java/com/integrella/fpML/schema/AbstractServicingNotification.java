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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An abstract base type for all syndicated loan servicing notifications; the wrapper for loan events which occur through the life-cycle of a deal.
 * 
 * <p>Java class for AbstractServicingNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractServicingNotification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}CorrectableRequestMessage">
 *       &lt;sequence>
 *         &lt;element name="noticeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="isGlobalOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="paymentDetails" type="{http://www.fpml.org/FpML-5/master}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractServicingNotification", propOrder = {
    "noticeDate",
    "isGlobalOnly",
    "paymentDetails"
})
@XmlSeeAlso({
    AbstractFacilityNotification.class,
    AbstractContractNotification.class
})
public abstract class AbstractServicingNotification
    extends CorrectableRequestMessage
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar noticeDate;
    protected Boolean isGlobalOnly;
    protected List<Payment> paymentDetails;

    /**
     * Gets the value of the noticeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNoticeDate() {
        return noticeDate;
    }

    /**
     * Sets the value of the noticeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNoticeDate(XMLGregorianCalendar value) {
        this.noticeDate = value;
    }

    /**
     * Gets the value of the isGlobalOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGlobalOnly() {
        return isGlobalOnly;
    }

    /**
     * Sets the value of the isGlobalOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGlobalOnly(Boolean value) {
        this.isGlobalOnly = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPaymentDetails() {
        if (paymentDetails == null) {
            paymentDetails = new ArrayList<Payment>();
        }
        return this.paymentDetails;
    }

}
