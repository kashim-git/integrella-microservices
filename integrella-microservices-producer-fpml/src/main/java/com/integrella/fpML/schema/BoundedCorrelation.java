//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing correlation bounds, which form a cap and a floor on the realized correlation.
 * 
 * <p>Java class for BoundedCorrelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundedCorrelation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimumBoundaryPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maximumBoundaryPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundedCorrelation", propOrder = {
    "minimumBoundaryPercent",
    "maximumBoundaryPercent"
})
public class BoundedCorrelation {

    protected BigDecimal minimumBoundaryPercent;
    protected BigDecimal maximumBoundaryPercent;

    /**
     * Gets the value of the minimumBoundaryPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumBoundaryPercent() {
        return minimumBoundaryPercent;
    }

    /**
     * Sets the value of the minimumBoundaryPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumBoundaryPercent(BigDecimal value) {
        this.minimumBoundaryPercent = value;
    }

    /**
     * Gets the value of the maximumBoundaryPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBoundaryPercent() {
        return maximumBoundaryPercent;
    }

    /**
     * Sets the value of the maximumBoundaryPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBoundaryPercent(BigDecimal value) {
        this.maximumBoundaryPercent = value;
    }

}
