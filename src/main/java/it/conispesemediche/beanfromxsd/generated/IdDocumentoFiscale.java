//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.02.03 alle 01:36:40 PM CET 
//


package it.conispesemediche.beanfromxsd.generated;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per idDocumentoFiscale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="idDocumentoFiscale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pIva">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;pattern value="([0-9]{11})"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dataEmissione" type="{}DataMinType"/>
 *         &lt;element name="numDocumentoFiscale">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dispositivo" type="{}Int3Type"/>
 *                   &lt;element name="numDocumento" type="{}numDocType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idDocumentoFiscale", propOrder = {
    "pIva",
    "dataEmissione",
    "numDocumentoFiscale"
})
public class IdDocumentoFiscale {

    @XmlElement(required = true)
    protected String pIva;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissione;
    @XmlElement(required = true)
    protected IdDocumentoFiscale.NumDocumentoFiscale numDocumentoFiscale;

    /**
     * Recupera il valore della propriet� pIva.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getPIva() {
        return pIva;
    }

    /**
     * Imposta il valore della propriet� pIva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPIva(String value) {
        this.pIva = value;
    }

    /**
     * Recupera il valore della propriet� dataEmissione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissione() {
        return dataEmissione;
    }

    /**
     * Imposta il valore della propriet� dataEmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissione(XMLGregorianCalendar value) {
        this.dataEmissione = value;
    }

    /**
     * Recupera il valore della propriet� numDocumentoFiscale.
     * 
     * @return
     *     possible object is
     *     {@link IdDocumentoFiscale.NumDocumentoFiscale }
     *     
     */
    public IdDocumentoFiscale.NumDocumentoFiscale getNumDocumentoFiscale() {
        return numDocumentoFiscale;
    }

    /**
     * Imposta il valore della propriet� numDocumentoFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDocumentoFiscale.NumDocumentoFiscale }
     *     
     */
    public void setNumDocumentoFiscale(IdDocumentoFiscale.NumDocumentoFiscale value) {
        this.numDocumentoFiscale = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dispositivo" type="{}Int3Type"/>
     *         &lt;element name="numDocumento" type="{}numDocType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dispositivo",
        "numDocumento"
    })
    public static class NumDocumentoFiscale {

        protected int dispositivo;
        @XmlElement(required = true)
        protected String numDocumento;

        /**
         * Recupera il valore della propriet� dispositivo.
         * 
         */
        public int getDispositivo() {
            return dispositivo;
        }

        /**
         * Imposta il valore della propriet� dispositivo.
         * 
         */
        public void setDispositivo(int value) {
            this.dispositivo = value;
        }

        /**
         * Recupera il valore della propriet� numDocumento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumDocumento() {
            return numDocumento;
        }

        /**
         * Imposta il valore della propriet� numDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumDocumento(String value) {
            this.numDocumento = value;
        }

    }

}
