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
 * A type defining the components specifiying an interest rate stream, including both a parametric and cashflow representation for the stream of payments.
 * 
 * <p>Java class for InterestRateStream complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestRateStream">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}Leg">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PayerReceiver.model"/>
 *         &lt;element name="calculationPeriodDates" type="{http://www.fpml.org/FpML-5/master}CalculationPeriodDates" minOccurs="0"/>
 *         &lt;element name="paymentDates" type="{http://www.fpml.org/FpML-5/master}PaymentDates" minOccurs="0"/>
 *         &lt;element name="resetDates" type="{http://www.fpml.org/FpML-5/master}ResetDates" minOccurs="0"/>
 *         &lt;element name="calculationPeriodAmount" type="{http://www.fpml.org/FpML-5/master}CalculationPeriodAmount" minOccurs="0"/>
 *         &lt;element name="stubCalculationPeriodAmount" type="{http://www.fpml.org/FpML-5/master}StubCalculationPeriodAmount" minOccurs="0"/>
 *         &lt;element name="principalExchanges" type="{http://www.fpml.org/FpML-5/master}PrincipalExchanges" minOccurs="0"/>
 *         &lt;element name="cashflows" type="{http://www.fpml.org/FpML-5/master}Cashflows" minOccurs="0"/>
 *         &lt;element name="settlementProvision" type="{http://www.fpml.org/FpML-5/master}SettlementProvision" minOccurs="0"/>
 *         &lt;element name="formula" type="{http://www.fpml.org/FpML-5/master}Formula" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRateStream", propOrder = {
    "payerPartyReference",
    "payerAccountReference",
    "receiverPartyReference",
    "receiverAccountReference",
    "calculationPeriodDates",
    "paymentDates",
    "resetDates",
    "calculationPeriodAmount",
    "stubCalculationPeriodAmount",
    "principalExchanges",
    "cashflows",
    "settlementProvision",
    "formula"
})
public class InterestRateStream
    extends Leg
{

    protected PartyReference payerPartyReference;
    protected AccountReference payerAccountReference;
    protected PartyReference receiverPartyReference;
    protected AccountReference receiverAccountReference;
    protected CalculationPeriodDates calculationPeriodDates;
    protected PaymentDates paymentDates;
    protected ResetDates resetDates;
    protected CalculationPeriodAmount calculationPeriodAmount;
    protected StubCalculationPeriodAmount stubCalculationPeriodAmount;
    protected PrincipalExchanges principalExchanges;
    protected Cashflows cashflows;
    protected SettlementProvision settlementProvision;
    protected Formula formula;

    /**
     * Gets the value of the payerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPayerPartyReference() {
        return payerPartyReference;
    }

    /**
     * Sets the value of the payerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPayerPartyReference(PartyReference value) {
        this.payerPartyReference = value;
    }

    /**
     * Gets the value of the payerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getPayerAccountReference() {
        return payerAccountReference;
    }

    /**
     * Sets the value of the payerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setPayerAccountReference(AccountReference value) {
        this.payerAccountReference = value;
    }

    /**
     * Gets the value of the receiverPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getReceiverPartyReference() {
        return receiverPartyReference;
    }

    /**
     * Sets the value of the receiverPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setReceiverPartyReference(PartyReference value) {
        this.receiverPartyReference = value;
    }

    /**
     * Gets the value of the receiverAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getReceiverAccountReference() {
        return receiverAccountReference;
    }

    /**
     * Sets the value of the receiverAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setReceiverAccountReference(AccountReference value) {
        this.receiverAccountReference = value;
    }

    /**
     * Gets the value of the calculationPeriodDates property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodDates }
     *     
     */
    public CalculationPeriodDates getCalculationPeriodDates() {
        return calculationPeriodDates;
    }

    /**
     * Sets the value of the calculationPeriodDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodDates }
     *     
     */
    public void setCalculationPeriodDates(CalculationPeriodDates value) {
        this.calculationPeriodDates = value;
    }

    /**
     * Gets the value of the paymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDates }
     *     
     */
    public PaymentDates getPaymentDates() {
        return paymentDates;
    }

    /**
     * Sets the value of the paymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDates }
     *     
     */
    public void setPaymentDates(PaymentDates value) {
        this.paymentDates = value;
    }

    /**
     * Gets the value of the resetDates property.
     * 
     * @return
     *     possible object is
     *     {@link ResetDates }
     *     
     */
    public ResetDates getResetDates() {
        return resetDates;
    }

    /**
     * Sets the value of the resetDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetDates }
     *     
     */
    public void setResetDates(ResetDates value) {
        this.resetDates = value;
    }

    /**
     * Gets the value of the calculationPeriodAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodAmount }
     *     
     */
    public CalculationPeriodAmount getCalculationPeriodAmount() {
        return calculationPeriodAmount;
    }

    /**
     * Sets the value of the calculationPeriodAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodAmount }
     *     
     */
    public void setCalculationPeriodAmount(CalculationPeriodAmount value) {
        this.calculationPeriodAmount = value;
    }

    /**
     * Gets the value of the stubCalculationPeriodAmount property.
     * 
     * @return
     *     possible object is
     *     {@link StubCalculationPeriodAmount }
     *     
     */
    public StubCalculationPeriodAmount getStubCalculationPeriodAmount() {
        return stubCalculationPeriodAmount;
    }

    /**
     * Sets the value of the stubCalculationPeriodAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link StubCalculationPeriodAmount }
     *     
     */
    public void setStubCalculationPeriodAmount(StubCalculationPeriodAmount value) {
        this.stubCalculationPeriodAmount = value;
    }

    /**
     * Gets the value of the principalExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalExchanges }
     *     
     */
    public PrincipalExchanges getPrincipalExchanges() {
        return principalExchanges;
    }

    /**
     * Sets the value of the principalExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalExchanges }
     *     
     */
    public void setPrincipalExchanges(PrincipalExchanges value) {
        this.principalExchanges = value;
    }

    /**
     * Gets the value of the cashflows property.
     * 
     * @return
     *     possible object is
     *     {@link Cashflows }
     *     
     */
    public Cashflows getCashflows() {
        return cashflows;
    }

    /**
     * Sets the value of the cashflows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cashflows }
     *     
     */
    public void setCashflows(Cashflows value) {
        this.cashflows = value;
    }

    /**
     * Gets the value of the settlementProvision property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementProvision }
     *     
     */
    public SettlementProvision getSettlementProvision() {
        return settlementProvision;
    }

    /**
     * Sets the value of the settlementProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementProvision }
     *     
     */
    public void setSettlementProvision(SettlementProvision value) {
        this.settlementProvision = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link Formula }
     *     
     */
    public Formula getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link Formula }
     *     
     */
    public void setFormula(Formula value) {
        this.formula = value;
    }

}
