//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.02.03 alle 01:41:59 PM CET 
//


package it.conispesemediche.beanfromxsd.esiti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per datiInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="datiInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pinCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opzionale1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opzionale2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opzionale3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiInput", propOrder = {
    "pinCode",
    "protocollo",
    "opzionale1",
    "opzionale2",
    "opzionale3"
})
public class DatiInput {

    @XmlElement(required = true)
    protected String pinCode;
    protected String protocollo;
    protected String opzionale1;
    protected String opzionale2;
    protected String opzionale3;

    /**
     * Recupera il valore della propriet� pinCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * Imposta il valore della propriet� pinCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCode(String value) {
        this.pinCode = value;
    }

    /**
     * Recupera il valore della propriet� protocollo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocollo() {
        return protocollo;
    }

    /**
     * Imposta il valore della propriet� protocollo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocollo(String value) {
        this.protocollo = value;
    }

    /**
     * Recupera il valore della propriet� opzionale1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpzionale1() {
        return opzionale1;
    }

    /**
     * Imposta il valore della propriet� opzionale1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpzionale1(String value) {
        this.opzionale1 = value;
    }

    /**
     * Recupera il valore della propriet� opzionale2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpzionale2() {
        return opzionale2;
    }

    /**
     * Imposta il valore della propriet� opzionale2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpzionale2(String value) {
        this.opzionale2 = value;
    }

    /**
     * Recupera il valore della propriet� opzionale3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpzionale3() {
        return opzionale3;
    }

    /**
     * Imposta il valore della propriet� opzionale3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpzionale3(String value) {
        this.opzionale3 = value;
    }

}
