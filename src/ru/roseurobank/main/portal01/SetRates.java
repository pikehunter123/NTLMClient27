
package ru.roseurobank.main.portal01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arRate" type="{http://portal01.main.roseurobank.ru/}arRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arRate"
})
@XmlRootElement(name = "setRates")
public class SetRates {

    protected ArRate arRate;

    /**
     * Gets the value of the arRate property.
     * 
     * @return
     *     possible object is
     *     {@link ArRate }
     *     
     */
    public ArRate getArRate() {
        return arRate;
    }

    /**
     * Sets the value of the arRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArRate }
     *     
     */
    public void setArRate(ArRate value) {
        this.arRate = value;
    }

}
