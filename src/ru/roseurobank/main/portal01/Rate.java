
package ru.roseurobank.main.portal01;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODE_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODE_OUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUY_VALUE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="SELL_VALUE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rate", propOrder = {
    "code",
    "date",
    "codein",
    "codeout",
    "buyvalue",
    "sellvalue"
})
public class Rate {

    @XmlElement(name = "CODE")
    protected BigInteger code;
    @XmlElement(name = "DATE")
    protected String date;
    @XmlElement(name = "CODE_IN")
    protected String codein;
    @XmlElement(name = "CODE_OUT")
    protected String codeout;
    @XmlElement(name = "BUY_VALUE")
    protected Float buyvalue;
    @XmlElement(name = "SELL_VALUE")
    protected Float sellvalue;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCODE(BigInteger value) {
        this.code = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATE() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATE(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the codein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEIN() {
        return codein;
    }

    /**
     * Sets the value of the codein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEIN(String value) {
        this.codein = value;
    }

    /**
     * Gets the value of the codeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEOUT() {
        return codeout;
    }

    /**
     * Sets the value of the codeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEOUT(String value) {
        this.codeout = value;
    }

    /**
     * Gets the value of the buyvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBUYVALUE() {
        return buyvalue;
    }

    /**
     * Sets the value of the buyvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBUYVALUE(Float value) {
        this.buyvalue = value;
    }

    /**
     * Gets the value of the sellvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSELLVALUE() {
        return sellvalue;
    }

    /**
     * Sets the value of the sellvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSELLVALUE(Float value) {
        this.sellvalue = value;
    }

}
