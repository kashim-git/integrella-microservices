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
 * The different options for specifying the Delivery Periods for a physically settled gas trade.
 * 
 * <p>Java class for GasDeliveryPeriods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasDeliveryPeriods">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}CommodityDeliveryPeriods">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="supplyStartTime" type="{http://www.fpml.org/FpML-5/master}PrevailingTime" minOccurs="0"/>
 *         &lt;element name="supplyEndTime" type="{http://www.fpml.org/FpML-5/master}PrevailingTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasDeliveryPeriods", propOrder = {
    "supplyStartTime",
    "supplyEndTime"
})
public class GasDeliveryPeriods
    extends CommodityDeliveryPeriods
{

    protected PrevailingTime supplyStartTime;
    protected PrevailingTime supplyEndTime;

    /**
     * Gets the value of the supplyStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link PrevailingTime }
     *     
     */
    public PrevailingTime getSupplyStartTime() {
        return supplyStartTime;
    }

    /**
     * Sets the value of the supplyStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevailingTime }
     *     
     */
    public void setSupplyStartTime(PrevailingTime value) {
        this.supplyStartTime = value;
    }

    /**
     * Gets the value of the supplyEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link PrevailingTime }
     *     
     */
    public PrevailingTime getSupplyEndTime() {
        return supplyEndTime;
    }

    /**
     * Sets the value of the supplyEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevailingTime }
     *     
     */
    public void setSupplyEndTime(PrevailingTime value) {
        this.supplyEndTime = value;
    }

}