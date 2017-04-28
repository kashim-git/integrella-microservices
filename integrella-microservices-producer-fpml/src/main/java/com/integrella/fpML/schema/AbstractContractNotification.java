//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An extension of the AbstractServicingNotification which includes a reference to the facility and the loan contract to which embedded loan events apply. This abtract type should be used to 'wrap' contract-level business events.
 * 
 * <p>Java class for AbstractContractNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractContractNotification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}AbstractServicingNotification">
 *       &lt;sequence>
 *         &lt;element name="facilityOutstandingsPosition" type="{http://www.fpml.org/FpML-5/master}FacilityOutstandingsPosition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractContractNotification", propOrder = {
    "facilityOutstandingsPosition"
})
@XmlSeeAlso({
    AccrualOptionChangeNotification.class,
    PrepaymentNotification.class,
    NonRecurringFeePaymentNotification.class,
    LoanContractNotification.class,
    LcNotification.class,
    RolloverNotification.class
})
public abstract class AbstractContractNotification
    extends AbstractServicingNotification
{

    protected FacilityOutstandingsPosition facilityOutstandingsPosition;

    /**
     * Gets the value of the facilityOutstandingsPosition property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityOutstandingsPosition }
     *     
     */
    public FacilityOutstandingsPosition getFacilityOutstandingsPosition() {
        return facilityOutstandingsPosition;
    }

    /**
     * Sets the value of the facilityOutstandingsPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityOutstandingsPosition }
     *     
     */
    public void setFacilityOutstandingsPosition(FacilityOutstandingsPosition value) {
        this.facilityOutstandingsPosition = value;
    }

}