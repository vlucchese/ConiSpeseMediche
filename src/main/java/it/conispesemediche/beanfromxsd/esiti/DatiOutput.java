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
 * <p>Classe Java per datiOutput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="datiOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esitoChiamata" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="esitiPositivi" type="{http://dettaglioerrori.p730.sanita.sogei.it/}esitiPositivi" minOccurs="0"/>
 *         &lt;element name="esitiNegativi" type="{http://dettaglioerrori.p730.sanita.sogei.it/}esitiNegativi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiOutput", propOrder = {
    "esitoChiamata",
    "esitiPositivi",
    "esitiNegativi"
})
public class DatiOutput {

    @XmlElement(required = true)
    protected String esitoChiamata;
    protected EsitiPositivi esitiPositivi;
    protected EsitiNegativi esitiNegativi;

    /**
     * Recupera il valore della propriet� esitoChiamata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsitoChiamata() {
        return esitoChiamata;
    }

    /**
     * Imposta il valore della propriet� esitoChiamata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsitoChiamata(String value) {
        this.esitoChiamata = value;
    }

    /**
     * Recupera il valore della propriet� esitiPositivi.
     * 
     * @return
     *     possible object is
     *     {@link EsitiPositivi }
     *     
     */
    public EsitiPositivi getEsitiPositivi() {
        return esitiPositivi;
    }

    /**
     * Imposta il valore della propriet� esitiPositivi.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitiPositivi }
     *     
     */
    public void setEsitiPositivi(EsitiPositivi value) {
        this.esitiPositivi = value;
    }

    /**
     * Recupera il valore della propriet� esitiNegativi.
     * 
     * @return
     *     possible object is
     *     {@link EsitiNegativi }
     *     
     */
    public EsitiNegativi getEsitiNegativi() {
        return esitiNegativi;
    }

    /**
     * Imposta il valore della propriet� esitiNegativi.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitiNegativi }
     *     
     */
    public void setEsitiNegativi(EsitiNegativi value) {
        this.esitiNegativi = value;
    }

}
