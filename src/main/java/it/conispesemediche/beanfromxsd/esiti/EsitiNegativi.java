//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.02.03 alle 01:41:59 PM CET 
//


package it.conispesemediche.beanfromxsd.esiti;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per esitiNegativi complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="esitiNegativi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dettaglioEsitoNegativo" type="{http://dettaglioerrori.p730.sanita.sogei.it/}dettaglioEsitoNegativo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esitiNegativi", propOrder = {
    "dettaglioEsitoNegativo"
})
public class EsitiNegativi {

    @XmlElement(required = true)
    protected List<DettaglioEsitoNegativo> dettaglioEsitoNegativo;

    /**
     * Gets the value of the dettaglioEsitoNegativo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglioEsitoNegativo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettaglioEsitoNegativo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DettaglioEsitoNegativo }
     * 
     * 
     */
    public List<DettaglioEsitoNegativo> getDettaglioEsitoNegativo() {
        if (dettaglioEsitoNegativo == null) {
            dettaglioEsitoNegativo = new ArrayList<DettaglioEsitoNegativo>();
        }
        return this.dettaglioEsitoNegativo;
    }

}
