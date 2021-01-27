
package it.conispesemediche.stubInvioFile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per proprietario complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="proprietario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceRegione" type="{http://ejb.invioTelematicoSS730p.sanita.finanze.it/}varChar3Type" minOccurs="0"/>
 *         &lt;element name="codiceAsl" type="{http://ejb.invioTelematicoSS730p.sanita.finanze.it/}varChar3Type" minOccurs="0"/>
 *         &lt;element name="codiceSSA" type="{http://ejb.invioTelematicoSS730p.sanita.finanze.it/}codSsaType" minOccurs="0"/>
 *         &lt;element name="cfProprietario" type="{http://ejb.invioTelematicoSS730p.sanita.finanze.it/}cfType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proprietario", propOrder = {
    "codiceRegione",
    "codiceAsl",
    "codiceSSA",
    "cfProprietario"
})
public class Proprietario {

    protected String codiceRegione;
    protected String codiceAsl;
    protected String codiceSSA;
    protected String cfProprietario;

    /**
     * Recupera il valore della propriet� codiceRegione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRegione() {
        return codiceRegione;
    }

    /**
     * Imposta il valore della propriet� codiceRegione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRegione(String value) {
        this.codiceRegione = value;
    }

    /**
     * Recupera il valore della propriet� codiceAsl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAsl() {
        return codiceAsl;
    }

    /**
     * Imposta il valore della propriet� codiceAsl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAsl(String value) {
        this.codiceAsl = value;
    }

    /**
     * Recupera il valore della propriet� codiceSSA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceSSA() {
        return codiceSSA;
    }

    /**
     * Imposta il valore della propriet� codiceSSA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceSSA(String value) {
        this.codiceSSA = value;
    }

    /**
     * Recupera il valore della propriet� cfProprietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfProprietario() {
        return cfProprietario;
    }

    /**
     * Imposta il valore della propriet� cfProprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfProprietario(String value) {
        this.cfProprietario = value;
    }

}
