//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a trade identifier with a reference to the party that this trade is associated with.
 * 
 * <p>Java class for TradeIdentifierExtended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeIdentifierExtended">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}TradeIdentifier">
 *       &lt;sequence>
 *         &lt;element name="associatedPartyReference" type="{http://www.fpml.org/FpML-5/master}PartyReference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeIdentifierExtended", propOrder = {
    "associatedPartyReference"
})
public class TradeIdentifierExtended
    extends TradeIdentifier
{

    @XmlElement(required = true)
    protected PartyReference associatedPartyReference;

    /**
     * Gets the value of the associatedPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getAssociatedPartyReference() {
        return associatedPartyReference;
    }

    /**
     * Sets the value of the associatedPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setAssociatedPartyReference(PartyReference value) {
        this.associatedPartyReference = value;
    }

}