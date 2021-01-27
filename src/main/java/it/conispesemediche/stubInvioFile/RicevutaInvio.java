
package it.conispesemediche.stubInvioFile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ricevutaInvio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ricevutaInvio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceEsito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataAccoglienza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizioneEsito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dimensioneFileAllegato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeFileAllegato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protocollo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ricevutaInvio", propOrder = {
    "codiceEsito",
    "dataAccoglienza",
    "descrizioneEsito",
    "dimensioneFileAllegato",
    "nomeFileAllegato",
    "protocollo",
    "idErrore"
})
public class RicevutaInvio {

    @XmlElement(required = true)
    protected String codiceEsito;
    @XmlElement(required = true)
    protected String dataAccoglienza;
    @XmlElement(required = true)
    protected String descrizioneEsito;
    @XmlElement(required = true)
    protected String dimensioneFileAllegato;
    @XmlElement(required = true)
    protected String nomeFileAllegato;
    @XmlElement(required = true)
    protected String protocollo;
    protected String idErrore;

    /**
     * Recupera il valore della propriet� codiceEsito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceEsito() {
        return codiceEsito;
    }

    /**
     * Imposta il valore della propriet� codiceEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceEsito(String value) {
        this.codiceEsito = value;
    }

    /**
     * Recupera il valore della propriet� dataAccoglienza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAccoglienza() {
        return dataAccoglienza;
    }

    /**
     * Imposta il valore della propriet� dataAccoglienza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAccoglienza(String value) {
        this.dataAccoglienza = value;
    }

    /**
     * Recupera il valore della propriet� descrizioneEsito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneEsito() {
        return descrizioneEsito;
    }

    /**
     * Imposta il valore della propriet� descrizioneEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneEsito(String value) {
        this.descrizioneEsito = value;
    }

    /**
     * Recupera il valore della propriet� dimensioneFileAllegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensioneFileAllegato() {
        return dimensioneFileAllegato;
    }

    /**
     * Imposta il valore della propriet� dimensioneFileAllegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensioneFileAllegato(String value) {
        this.dimensioneFileAllegato = value;
    }

    /**
     * Recupera il valore della propriet� nomeFileAllegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFileAllegato() {
        return nomeFileAllegato;
    }

    /**
     * Imposta il valore della propriet� nomeFileAllegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFileAllegato(String value) {
        this.nomeFileAllegato = value;
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
     * Recupera il valore della propriet� idErrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdErrore() {
        return idErrore;
    }

    /**
     * Imposta il valore della propriet� idErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdErrore(String value) {
        this.idErrore = value;
    }

}
