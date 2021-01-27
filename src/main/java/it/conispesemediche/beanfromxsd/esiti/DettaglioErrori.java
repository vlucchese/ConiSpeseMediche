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
 * <p>Classe Java per DettaglioErrori complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DettaglioErrori">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiInputRichiesta" type="{http://dettaglioerrori.p730.sanita.sogei.it/}datiInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DettaglioErrori", propOrder = {
    "datiInputRichiesta"
})
public class DettaglioErrori {

    @XmlElement(name = "DatiInputRichiesta")
    protected DatiInput datiInputRichiesta;

    /**
     * Recupera il valore della propriet� datiInputRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link DatiInput }
     *     
     */
    public DatiInput getDatiInputRichiesta() {
        return datiInputRichiesta;
    }

    /**
     * Imposta il valore della propriet� datiInputRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiInput }
     *     
     */
    public void setDatiInputRichiesta(DatiInput value) {
        this.datiInputRichiesta = value;
    }

}
