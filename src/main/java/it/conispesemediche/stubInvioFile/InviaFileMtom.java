
package it.conispesemediche.stubInvioFile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per inviaFileMtom complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="inviaFileMtom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeFileAllegato" type="{http://ejb.invioTelematicoSS730p.sanita.finanze.it/}tipoNomeFileAllegato"/>
 *         &lt;element name="pincodeInvianteCifrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datiProprietario" type="{http://ejb.invioTelematicoSS730p.sanita.finanze.it/}proprietario" minOccurs="0"/>
 *         &lt;element name="opzionale1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opzionale2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opzionale3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "inviaFileMtom", propOrder = {
    "nomeFileAllegato",
    "pincodeInvianteCifrato",
    "datiProprietario",
    "opzionale1",
    "opzionale2",
    "opzionale3",
    "documento"
})
public class InviaFileMtom {

    @XmlElement(required = true)
    protected String nomeFileAllegato;
    @XmlElement(required = true)
    protected String pincodeInvianteCifrato;
    protected Proprietario datiProprietario;
    protected String opzionale1;
    protected String opzionale2;
    protected String opzionale3;
    @XmlElement(required = true)
    protected byte[] documento;

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
     * Recupera il valore della propriet� pincodeInvianteCifrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPincodeInvianteCifrato() {
        return pincodeInvianteCifrato;
    }

    /**
     * Imposta il valore della propriet� pincodeInvianteCifrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPincodeInvianteCifrato(String value) {
        this.pincodeInvianteCifrato = value;
    }

    /**
     * Recupera il valore della propriet� datiProprietario.
     * 
     * @return
     *     possible object is
     *     {@link Proprietario }
     *     
     */
    public Proprietario getDatiProprietario() {
        return datiProprietario;
    }

    /**
     * Imposta il valore della propriet� datiProprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link Proprietario }
     *     
     */
    public void setDatiProprietario(Proprietario value) {
        this.datiProprietario = value;
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

    /**
     * Recupera il valore della propriet� documento.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocumento() {
        return documento;
    }

    /**
     * Imposta il valore della propriet� documento.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocumento(byte[] value) {
        this.documento = value;
    }

}
