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
 * <p>Classe Java per DettaglioErroriResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DettaglioErroriResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiOutputRichiesta" type="{http://dettaglioerrori.p730.sanita.sogei.it/}datiOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DettaglioErroriResponse", propOrder = {
    "datiOutputRichiesta"
})
public class DettaglioErroriResponse {

    @XmlElement(name = "DatiOutputRichiesta")
    protected DatiOutput datiOutputRichiesta;

    /**
     * Recupera il valore della propriet� datiOutputRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link DatiOutput }
     *     
     */
    public DatiOutput getDatiOutputRichiesta() {
        return datiOutputRichiesta;
    }

    /**
     * Imposta il valore della propriet� datiOutputRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiOutput }
     *     
     */
    public void setDatiOutputRichiesta(DatiOutput value) {
        this.datiOutputRichiesta = value;
    }

}
