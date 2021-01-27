//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.02.03 alle 01:41:59 PM CET 
//


package it.conispesemediche.beanfromxsd.esiti;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the esiti package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DatiOutput_QNAME = new QName("http://dettaglioerrori.p730.sanita.sogei.it/", "datiOutput");
    private final static QName _DatiInput_QNAME = new QName("http://dettaglioerrori.p730.sanita.sogei.it/", "datiInput");
    private final static QName _DettaglioErrori_QNAME = new QName("http://dettaglioerrori.p730.sanita.sogei.it/", "DettaglioErrori");
    private final static QName _DettaglioErroriResponse_QNAME = new QName("http://dettaglioerrori.p730.sanita.sogei.it/", "DettaglioErroriResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esiti
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatiOutput }
     * 
     */
    public DatiOutput createDatiOutput() {
        return new DatiOutput();
    }

    /**
     * Create an instance of {@link DatiInput }
     * 
     */
    public DatiInput createDatiInput() {
        return new DatiInput();
    }

    /**
     * Create an instance of {@link DettaglioErrori }
     * 
     */
    public DettaglioErrori createDettaglioErrori() {
        return new DettaglioErrori();
    }

    /**
     * Create an instance of {@link DettaglioErroriResponse }
     * 
     */
    public DettaglioErroriResponse createDettaglioErroriResponse() {
        return new DettaglioErroriResponse();
    }

    /**
     * Create an instance of {@link DettaglioEsitoPositivo }
     * 
     */
    public DettaglioEsitoPositivo createDettaglioEsitoPositivo() {
        return new DettaglioEsitoPositivo();
    }

    /**
     * Create an instance of {@link DettaglioEsitoNegativo }
     * 
     */
    public DettaglioEsitoNegativo createDettaglioEsitoNegativo() {
        return new DettaglioEsitoNegativo();
    }

    /**
     * Create an instance of {@link EsitiPositivi }
     * 
     */
    public EsitiPositivi createEsitiPositivi() {
        return new EsitiPositivi();
    }

    /**
     * Create an instance of {@link EsitiNegativi }
     * 
     */
    public EsitiNegativi createEsitiNegativi() {
        return new EsitiNegativi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dettaglioerrori.p730.sanita.sogei.it/", name = "datiOutput")
    public JAXBElement<DatiOutput> createDatiOutput(DatiOutput value) {
        return new JAXBElement<DatiOutput>(_DatiOutput_QNAME, DatiOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dettaglioerrori.p730.sanita.sogei.it/", name = "datiInput")
    public JAXBElement<DatiInput> createDatiInput(DatiInput value) {
        return new JAXBElement<DatiInput>(_DatiInput_QNAME, DatiInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DettaglioErrori }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dettaglioerrori.p730.sanita.sogei.it/", name = "DettaglioErrori")
    public JAXBElement<DettaglioErrori> createDettaglioErrori(DettaglioErrori value) {
        return new JAXBElement<DettaglioErrori>(_DettaglioErrori_QNAME, DettaglioErrori.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DettaglioErroriResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dettaglioerrori.p730.sanita.sogei.it/", name = "DettaglioErroriResponse")
    public JAXBElement<DettaglioErroriResponse> createDettaglioErroriResponse(DettaglioErroriResponse value) {
        return new JAXBElement<DettaglioErroriResponse>(_DettaglioErroriResponse_QNAME, DettaglioErroriResponse.class, null, value);
    }

}
