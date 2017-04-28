//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PeriodEnum")
@XmlEnum
public enum PeriodEnum {


    /**
     * Day.
     * 
     */
    D,

    /**
     * Week.
     * 
     */
    W,

    /**
     * Month.
     * 
     */
    M,

    /**
     * Year.
     * 
     */
    Y;

    public String value() {
        return name();
    }

    public static PeriodEnum fromValue(String v) {
        return valueOf(v);
    }

}