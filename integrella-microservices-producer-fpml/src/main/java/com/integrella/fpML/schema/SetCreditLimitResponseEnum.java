//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetCreditLimitResponseEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetCreditLimitResponseEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SetCreditLimitFailed"/>
 *     &lt;enumeration value="SetCreditLimitSuccessful"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetCreditLimitResponseEnum")
@XmlEnum
public enum SetCreditLimitResponseEnum {

    @XmlEnumValue("SetCreditLimitFailed")
    SET_CREDIT_LIMIT_FAILED("SetCreditLimitFailed"),
    @XmlEnumValue("SetCreditLimitSuccessful")
    SET_CREDIT_LIMIT_SUCCESSFUL("SetCreditLimitSuccessful");
    private final String value;

    SetCreditLimitResponseEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetCreditLimitResponseEnum fromValue(String v) {
        for (SetCreditLimitResponseEnum c: SetCreditLimitResponseEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
