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
 * A type for defining exercise procedures associated with an American style exercise of an equity option. This entity inherits from the type SharedAmericanExercise.
 * 
 * <p>Java class for EquityAmericanExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityAmericanExercise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}SharedAmericanExercise">
 *       &lt;sequence>
 *         &lt;element name="latestExerciseTimeType" type="{http://www.fpml.org/FpML-5/master}TimeTypeEnum" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}EquityExpiration.model"/>
 *         &lt;element name="equityMultipleExercise" type="{http://www.fpml.org/FpML-5/master}EquityMultipleExercise" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityAmericanExercise", propOrder = {
    "latestExerciseTimeType",
    "equityExpirationTimeType",
    "equityExpirationTime",
    "expirationTimeDetermination",
    "equityMultipleExercise"
})
public class EquityAmericanExercise
    extends SharedAmericanExercise
{

    protected TimeTypeEnum latestExerciseTimeType;
    protected TimeTypeEnum equityExpirationTimeType;
    protected BusinessCenterTime equityExpirationTime;
    protected DeterminationMethod expirationTimeDetermination;
    protected EquityMultipleExercise equityMultipleExercise;

    /**
     * Gets the value of the latestExerciseTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTypeEnum }
     *     
     */
    public TimeTypeEnum getLatestExerciseTimeType() {
        return latestExerciseTimeType;
    }

    /**
     * Sets the value of the latestExerciseTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTypeEnum }
     *     
     */
    public void setLatestExerciseTimeType(TimeTypeEnum value) {
        this.latestExerciseTimeType = value;
    }

    /**
     * Gets the value of the equityExpirationTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTypeEnum }
     *     
     */
    public TimeTypeEnum getEquityExpirationTimeType() {
        return equityExpirationTimeType;
    }

    /**
     * Sets the value of the equityExpirationTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTypeEnum }
     *     
     */
    public void setEquityExpirationTimeType(TimeTypeEnum value) {
        this.equityExpirationTimeType = value;
    }

    /**
     * Gets the value of the equityExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getEquityExpirationTime() {
        return equityExpirationTime;
    }

    /**
     * Sets the value of the equityExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setEquityExpirationTime(BusinessCenterTime value) {
        this.equityExpirationTime = value;
    }

    /**
     * Gets the value of the expirationTimeDetermination property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethod }
     *     
     */
    public DeterminationMethod getExpirationTimeDetermination() {
        return expirationTimeDetermination;
    }

    /**
     * Sets the value of the expirationTimeDetermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethod }
     *     
     */
    public void setExpirationTimeDetermination(DeterminationMethod value) {
        this.expirationTimeDetermination = value;
    }

    /**
     * Gets the value of the equityMultipleExercise property.
     * 
     * @return
     *     possible object is
     *     {@link EquityMultipleExercise }
     *     
     */
    public EquityMultipleExercise getEquityMultipleExercise() {
        return equityMultipleExercise;
    }

    /**
     * Sets the value of the equityMultipleExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityMultipleExercise }
     *     
     */
    public void setEquityMultipleExercise(EquityMultipleExercise value) {
        this.equityMultipleExercise = value;
    }

}
