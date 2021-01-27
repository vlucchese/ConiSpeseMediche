
package it.conispesemediche.stubInvioFile;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InvioTelematicoSS730pMtom", targetNamespace = "http://ejb.invioTelematicoSS730p.sanita.finanze.it/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InvioTelematicoSS730PMtom {


    /**
     * 
     * @param opzionale3
     * @param pincodeInvianteCifrato
     * @param documento
     * @param opzionale1
     * @param nomeFileAllegato
     * @param opzionale2
     * @param datiProprietario
     * @return
     *     returns it.finanze.sanita.inviotelematicoss730p.ejb.RicevutaInvio
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "inviaFileMtom", targetNamespace = "http://ejb.invioTelematicoSS730p.sanita.finanze.it/", className = "it.finanze.sanita.inviotelematicoss730p.ejb.InviaFileMtom")
    @ResponseWrapper(localName = "inviaFileMtomResponse", targetNamespace = "http://ejb.invioTelematicoSS730p.sanita.finanze.it/", className = "it.finanze.sanita.inviotelematicoss730p.ejb.InviaFileMtomResponse")
    public RicevutaInvio inviaFileMtom(
        @WebParam(name = "nomeFileAllegato", targetNamespace = "")
        String nomeFileAllegato,
        @WebParam(name = "pincodeInvianteCifrato", targetNamespace = "")
        String pincodeInvianteCifrato,
        @WebParam(name = "datiProprietario", targetNamespace = "")
        Proprietario datiProprietario,
        @WebParam(name = "opzionale1", targetNamespace = "")
        String opzionale1,
        @WebParam(name = "opzionale2", targetNamespace = "")
        String opzionale2,
        @WebParam(name = "opzionale3", targetNamespace = "")
        String opzionale3,
        @WebParam(name = "documento", targetNamespace = "")
        byte[] documento);

}
