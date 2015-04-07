
package ru.roseurobank.main.portal01;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.roseurobank.main.portal01 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.roseurobank.main.portal01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetRates }
     * 
     */
    public SetRates createSetRates() {
        return new SetRates();
    }

    /**
     * Create an instance of {@link ArRate }
     * 
     */
    public ArRate createArRate() {
        return new ArRate();
    }

    /**
     * Create an instance of {@link SetRatesResponse }
     * 
     */
    public SetRatesResponse createSetRatesResponse() {
        return new SetRatesResponse();
    }

    /**
     * Create an instance of {@link CResponse }
     * 
     */
    public CResponse createCResponse() {
        return new CResponse();
    }

    /**
     * Create an instance of {@link Rate }
     * 
     */
    public Rate createRate() {
        return new Rate();
    }

    /**
     * Create an instance of {@link Branch }
     * 
     */
    public Branch createBranch() {
        return new Branch();
    }

}
