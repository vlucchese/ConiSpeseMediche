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
 * <p>Classe Java per esitiPositivi complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="esitiPositivi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dettagliEsito" type="{http://dettaglioerrori.p730.sanita.sogei.it/}dettaglioEsitoPositivo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esitiPositivi", propOrder = {
    "dettagliEsito"
})
public class EsitiPositivi {

    @XmlElement(required = true)
    protected DettaglioEsitoPositivo dettagliEsito;

    /**
     * Recupera il valore della propriet� dettagliEsito.
     * 
     * @return
     *     possible object is
     *     {@link DettaglioEsitoPositivo }
     *     
     */
    public DettaglioEsitoPositivo getDettagliEsito() {
        return dettagliEsito;
    }

    /**
     * Imposta il valore della propriet� dettagliEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link DettaglioEsitoPositivo }
     *     
     */
    public void setDettagliEsito(DettaglioEsitoPositivo value) {
        this.dettagliEsito = value;
    }

}
