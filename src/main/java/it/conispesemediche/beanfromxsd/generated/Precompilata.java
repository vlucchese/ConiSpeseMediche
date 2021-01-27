//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.02.03 alle 01:36:40 PM CET 
//


package it.conispesemediche.beanfromxsd.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="opzionale1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="opzionale2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="opzionale3" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="proprietario">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codiceRegione" type="{}varChar3Type" minOccurs="0"/>
 *                   &lt;element name="codiceAsl" type="{}varChar3Type" minOccurs="0"/>
 *                   &lt;element name="codiceSSA" type="{}codSsaType" minOccurs="0"/>
 *                   &lt;element name="cfProprietario" type="{}cfType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="documentoSpesa" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idSpesa" type="{}idDocumentoFiscale"/>
 *                   &lt;element name="idRimborso" type="{}idDocumentoFiscale" minOccurs="0"/>
 *                   &lt;element name="dataPagamento">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{}DataMinType">
 *                         &lt;minInclusive value="2015-01-01"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="flagPagamentoAnticipato" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;enumeration value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="flagOperazione">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="I"/>
 *                         &lt;enumeration value="V"/>
 *                         &lt;enumeration value="R"/>
 *                         &lt;enumeration value="C"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cfCittadino" type="{}cfType"/>
 *                   &lt;element name="pagamentoTracciato" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="SI"/>
 *                         &lt;enumeration value="NO"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="voceSpesa" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tipoSpesa">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="TK"/>
 *                                   &lt;enumeration value="FC"/>
 *                                   &lt;enumeration value="FV"/>
 *                                   &lt;enumeration value="AS"/>
 *                                   &lt;enumeration value="AD"/>
 *                                   &lt;enumeration value="SR"/>
 *                                   &lt;enumeration value="CT"/>
 *                                   &lt;enumeration value="PI"/>
 *                                   &lt;enumeration value="IC"/>
 *                                   &lt;enumeration value="AA"/>
 *                                   &lt;enumeration value="SV"/>
 *                                   &lt;enumeration value="SP"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="flagTipoSpesa" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="importo" type="{}Dec7MinTipo"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = {
    "opzionale1",
    "opzionale2",
    "opzionale3",
    "proprietario",
    "documentoSpesa"
})
@XmlRootElement(name = "precompilata")
public class Precompilata {

    protected Object opzionale1;
    protected Object opzionale2;
    protected Object opzionale3;
    @XmlElement(required = true)
    protected Precompilata.Proprietario proprietario;
    @XmlElement(required = true)
    protected List<Precompilata.DocumentoSpesa> documentoSpesa;

    /**
     * Recupera il valore della propriet� opzionale1.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOpzionale1() {
        return opzionale1;
    }

    /**
     * Imposta il valore della propriet� opzionale1.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOpzionale1(Object value) {
        this.opzionale1 = value;
    }

    /**
     * Recupera il valore della propriet� opzionale2.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOpzionale2() {
        return opzionale2;
    }

    /**
     * Imposta il valore della propriet� opzionale2.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOpzionale2(Object value) {
        this.opzionale2 = value;
    }

    /**
     * Recupera il valore della propriet� opzionale3.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOpzionale3() {
        return opzionale3;
    }

    /**
     * Imposta il valore della propriet� opzionale3.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOpzionale3(Object value) {
        this.opzionale3 = value;
    }

    /**
     * Recupera il valore della propriet� proprietario.
     * 
     * @return
     *     possible object is
     *     {@link Precompilata.Proprietario }
     *     
     */
    public Precompilata.Proprietario getProprietario() {
        return proprietario;
    }

    /**
     * Imposta il valore della propriet� proprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link Precompilata.Proprietario }
     *     
     */
    public void setProprietario(Precompilata.Proprietario value) {
        this.proprietario = value;
    }

    /**
     * Gets the value of the documentoSpesa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoSpesa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoSpesa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Precompilata.DocumentoSpesa }
     * 
     * 
     */
    public List<Precompilata.DocumentoSpesa> getDocumentoSpesa() {
        if (documentoSpesa == null) {
            documentoSpesa = new ArrayList<Precompilata.DocumentoSpesa>();
        }
        return this.documentoSpesa;
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
     *         &lt;element name="idSpesa" type="{}idDocumentoFiscale"/>
     *         &lt;element name="idRimborso" type="{}idDocumentoFiscale" minOccurs="0"/>
     *         &lt;element name="dataPagamento">
     *           &lt;simpleType>
     *             &lt;restriction base="{}DataMinType">
     *               &lt;minInclusive value="2015-01-01"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="flagPagamentoAnticipato" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;enumeration value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="flagOperazione">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="I"/>
     *               &lt;enumeration value="V"/>
     *               &lt;enumeration value="R"/>
     *               &lt;enumeration value="C"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cfCittadino" type="{}cfType"/>
     *         &lt;element name="pagamentoTracciato" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="SI"/>
     *               &lt;enumeration value="NO"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="voceSpesa" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tipoSpesa">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="TK"/>
     *                         &lt;enumeration value="FC"/>
     *                         &lt;enumeration value="FV"/>
     *                         &lt;enumeration value="AS"/>
     *                         &lt;enumeration value="AD"/>
     *                         &lt;enumeration value="SR"/>
     *                         &lt;enumeration value="CT"/>
     *                         &lt;enumeration value="PI"/>
     *                         &lt;enumeration value="IC"/>
     *                         &lt;enumeration value="AA"/>
     *                         &lt;enumeration value="SV"/>
     *                         &lt;enumeration value="SP"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="flagTipoSpesa" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="importo" type="{}Dec7MinTipo"/>
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
    @XmlType(name = "", propOrder = {
        "idSpesa",
        "idRimborso",
        "dataPagamento",
        "flagPagamentoAnticipato",
        "flagOperazione",
        "cfCittadino",
        "pagamentoTracciato",
        "voceSpesa"
    })
    public static class DocumentoSpesa {

        @XmlElement(required = true)
        protected IdDocumentoFiscale idSpesa;
        protected IdDocumentoFiscale idRimborso;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataPagamento;
        protected Integer flagPagamentoAnticipato;
        @XmlElement(required = true)
        protected String flagOperazione;
        @XmlElement(required = true)
        protected String cfCittadino;
        protected String pagamentoTracciato;
        @XmlElement(required = true)
        protected List<Precompilata.DocumentoSpesa.VoceSpesa> voceSpesa;

        /**
         * Recupera il valore della propriet� idSpesa.
         * 
         * @return
         *     possible object is
         *     {@link IdDocumentoFiscale }
         *     
         */
        public IdDocumentoFiscale getIdSpesa() {
            return idSpesa;
        }

        /**
         * Imposta il valore della propriet� idSpesa.
         * 
         * @param value
         *     allowed object is
         *     {@link IdDocumentoFiscale }
         *     
         */
        public void setIdSpesa(IdDocumentoFiscale value) {
            this.idSpesa = value;
        }

        /**
         * Recupera il valore della propriet� idRimborso.
         * 
         * @return
         *     possible object is
         *     {@link IdDocumentoFiscale }
         *     
         */
        public IdDocumentoFiscale getIdRimborso() {
            return idRimborso;
        }

        /**
         * Imposta il valore della propriet� idRimborso.
         * 
         * @param value
         *     allowed object is
         *     {@link IdDocumentoFiscale }
         *     
         */
        public void setIdRimborso(IdDocumentoFiscale value) {
            this.idRimborso = value;
        }

        /**
         * Recupera il valore della propriet� dataPagamento.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataPagamento() {
            return dataPagamento;
        }

        /**
         * Imposta il valore della propriet� dataPagamento.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataPagamento(XMLGregorianCalendar value) {
            this.dataPagamento = value;
        }

        /**
         * Recupera il valore della propriet� flagPagamentoAnticipato.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFlagPagamentoAnticipato() {
            return flagPagamentoAnticipato;
        }

        /**
         * Imposta il valore della propriet� flagPagamentoAnticipato.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFlagPagamentoAnticipato(Integer value) {
            this.flagPagamentoAnticipato = value;
        }

        /**
         * Recupera il valore della propriet� flagOperazione.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlagOperazione() {
            return flagOperazione;
        }

        /**
         * Imposta il valore della propriet� flagOperazione.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlagOperazione(String value) {
            this.flagOperazione = value;
        }

        /**
         * Recupera il valore della propriet� cfCittadino.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfCittadino() {
            return cfCittadino;
        }

        /**
         * Imposta il valore della propriet� cfCittadino.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfCittadino(String value) {
            this.cfCittadino = value;
        }

        /**
         * Recupera il valore della propriet� pagamentoTracciato.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPagamentoTracciato() {
            return pagamentoTracciato;
        }

        /**
         * Imposta il valore della propriet� pagamentoTracciato.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPagamentoTracciato(String value) {
            this.pagamentoTracciato = value;
        }

        /**
         * Gets the value of the voceSpesa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voceSpesa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVoceSpesa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Precompilata.DocumentoSpesa.VoceSpesa }
         * 
         * 
         */
        public List<Precompilata.DocumentoSpesa.VoceSpesa> getVoceSpesa() {
            if (voceSpesa == null) {
                voceSpesa = new ArrayList<Precompilata.DocumentoSpesa.VoceSpesa>();
            }
            return this.voceSpesa;
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
         *         &lt;element name="tipoSpesa">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="TK"/>
         *               &lt;enumeration value="FC"/>
         *               &lt;enumeration value="FV"/>
         *               &lt;enumeration value="AS"/>
         *               &lt;enumeration value="AD"/>
         *               &lt;enumeration value="SR"/>
         *               &lt;enumeration value="CT"/>
         *               &lt;enumeration value="PI"/>
         *               &lt;enumeration value="IC"/>
         *               &lt;enumeration value="AA"/>
         *               &lt;enumeration value="SV"/>
         *               &lt;enumeration value="SP"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="flagTipoSpesa" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="importo" type="{}Dec7MinTipo"/>
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
            "tipoSpesa",
            "flagTipoSpesa",
            "importo"
        })
        public static class VoceSpesa {

            @XmlElement(required = true)
            protected String tipoSpesa;
            protected String flagTipoSpesa;
            @XmlElement(required = true)
            protected BigDecimal importo;

            /**
             * Recupera il valore della propriet� tipoSpesa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoSpesa() {
                return tipoSpesa;
            }

            /**
             * Imposta il valore della propriet� tipoSpesa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoSpesa(String value) {
                this.tipoSpesa = value;
            }

            /**
             * Recupera il valore della propriet� flagTipoSpesa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlagTipoSpesa() {
                return flagTipoSpesa;
            }

            /**
             * Imposta il valore della propriet� flagTipoSpesa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlagTipoSpesa(String value) {
                this.flagTipoSpesa = value;
            }

            /**
             * Recupera il valore della propriet� importo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporto() {
                return importo;
            }

            /**
             * Imposta il valore della propriet� importo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setImporto(BigDecimal value) {
                this.importo = value;
            }

        }

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
     *         &lt;element name="codiceRegione" type="{}varChar3Type" minOccurs="0"/>
     *         &lt;element name="codiceAsl" type="{}varChar3Type" minOccurs="0"/>
     *         &lt;element name="codiceSSA" type="{}codSsaType" minOccurs="0"/>
     *         &lt;element name="cfProprietario" type="{}cfType" minOccurs="0"/>
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
        "codiceRegione",
        "codiceAsl",
        "codiceSSA",
        "cfProprietario"
    })
    public static class Proprietario {

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

}
