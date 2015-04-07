
package ru.roseurobank.main.portal01;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIS_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIS_SERVICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ERROR_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CResponse", propOrder = {
    "cissystem",
    "cisservice",
    "errorcode",
    "errormessage"
})
public class CResponse {

    @XmlElement(name = "CIS_SYSTEM")
    protected String cissystem;
    @XmlElement(name = "CIS_SERVICE")
    protected String cisservice;
    @XmlElement(name = "ERROR_CODE")
    protected BigInteger errorcode;
    @XmlElement(name = "ERROR_MESSAGE")
    protected String errormessage;

    /**
     * Gets the value of the cissystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCISSYSTEM() {
        return cissystem;
    }

    /**
     * Sets the value of the cissystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCISSYSTEM(String value) {
        this.cissystem = value;
    }

    /**
     * Gets the value of the cisservice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCISSERVICE() {
        return cisservice;
    }

    /**
     * Sets the value of the cisservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCISSERVICE(String value) {
        this.cisservice = value;
    }

    /**
     * Gets the value of the errorcode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getERRORCODE() {
        return errorcode;
    }

    /**
     * Sets the value of the errorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setERRORCODE(BigInteger value) {
        this.errorcode = value;
    }

    /**
     * Gets the value of the errormessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORMESSAGE() {
        return errormessage;
    }

    /**
     * Sets the value of the errormessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORMESSAGE(String value) {
        this.errormessage = value;
    }

}
