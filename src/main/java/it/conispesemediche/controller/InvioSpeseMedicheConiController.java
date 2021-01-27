/**
 * 
 */
package it.conispesemediche.controller;

import java.io.File;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.altevie.invioSpese.jaxb.fileAllegato.Precompilata;
import com.altevie.invioSpese.jaxb.fileAllegato.Precompilata.DocumentoSpesa;

import it.conispesemediche.utils.Encrypt;

/**
 * @author Vincenzo
 *
 */
@Controller
@RequestMapping(value = "/**")
public class InvioSpeseMedicheConiController {
	
private static final Logger logger = Logger.getLogger(InvioSpeseMedicheConiController.class);

	

	@Resource
	public ApplicationContext context;
	
	@Resource(name="messageSource")
	public ReloadableResourceBundleMessageSource  messageSource;
	
	@Resource(name="encrypt")
	public Encrypt  encrypt;
	
	@Value("${coni.xml.path}")
	private String fileDaCriptare;

	@Value("${coni.xml.path.cript}")
	private String fileCriptato;
	
	@Value("${coni.codicepin}")
	private String pincode;
		
	@Value("${coni.codiceRegione}")
	private String codiceRegione;
	
	@Value("${coni.codiceAsl}")
	private String codiceAsl;
	
	@Value("${coni.codiceSSA}")
	private String codiceSSA;
	
	@Value("${coni.cfProprietario}")
	private String cfProprietario;
	
	@RequestMapping(value = "/inviaspesemedicheconi", method = RequestMethod.GET)
    public String doLogin(final Model model, final HttpServletRequest request, final HttpServletResponse response) {
    	logger.info("*** Start Invio Spese Mediche Coni ***");
    	File fileInput = new File(fileDaCriptare);
    	JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance (Precompilata.class);
		} catch (JAXBException e) {
			logger.error(e.getMessage());
			model.addAttribute("ko","Operazione fallita"+e.getMessage());
	        return "createxmlenc";
		}
    	
    	Unmarshaller jaxbUnmarshaller = null;
		try {
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			logger.error(e.getMessage());
			model.addAttribute("ko","Operazione fallita"+e.getMessage());
	        return "createxmlenc";
		}
		Precompilata precompilata = null;
    	try {
    		precompilata = (Precompilata) jaxbUnmarshaller.unmarshal(fileInput);
		} catch (JAXBException e) {
			logger.error(e.getMessage());
			model.addAttribute("ko","Operazione fallita"+e.getMessage());
	        return "createxmlenc";
		}
    	
    	if(precompilata.getProprietario()!=null) {
    		if(StringUtils.isNotEmpty(precompilata.getProprietario().getCfProprietario())) {
    			String cf = precompilata.getProprietario().getCfProprietario();
    			String cfEnc = encrypt.getEncryptStringBase64(cf);
    			precompilata.getProprietario().setCfProprietario(cfEnc);
    		}
    	}
    	for(DocumentoSpesa ds : precompilata.getDocumentoSpesa()) {
    		if(StringUtils.isNotEmpty(ds.getCfCittadino())) {
    			String cfcitt = ds.getCfCittadino();
    			String cfcittEnc = encrypt.getEncryptStringBase64(cfcitt);
    			ds.setCfCittadino(cfcittEnc);
    		}
    		/*
    		ds.setPagamentoTracciato("SI");
    		ds.setTipoDocumento("F");
    		ds.setFlagOpposizione("0");
    		if(!CollectionUtils.isEmpty(ds.getVoceSpesa())) {
        		for (Precompilata.DocumentoSpesa.VoceSpesa eachVoce : ds.getVoceSpesa()) {
        			eachVoce.setAliquotaIVA(null);
        			eachVoce.setNaturaIVA("N4");
    			}
    		}
    		*/
    	}
    	
    	Marshaller jaxbMarshaller = null;
    	
    	try {
			jaxbMarshaller = jaxbContext.createMarshaller();
		} catch (JAXBException e) {
			logger.error(e.getMessage());
			model.addAttribute("ko","Operazione fallita"+e.getMessage());
	        return "createxmlenc";
		}
    	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    	File fileOutput = new File(fileCriptato.concat("sportsalute_ts.xml"));
    	
    	try {
			jaxbMarshaller.marshal(precompilata, fileOutput);
		} catch (JAXBException e) {
			logger.error(e.getMessage());
			model.addAttribute("ko","Operazione fallita"+e.getMessage());
	        return "createxmlenc";
		}
    	
    	logger.debug(fileOutput.getAbsolutePath());
    	    	
    	model.addAttribute("pincode",encrypt.getEncryptStringBase64(pincode));
    	model.addAttribute("codiceRegione",codiceRegione);
    	model.addAttribute("codiceAsl",codiceAsl);
    	model.addAttribute("codiceSSA",codiceSSA);
    	model.addAttribute("cfProprietario",cfProprietario);
    	logger.info("*** Fine Invio Spese Mediche Coni ***");
    	model.addAttribute("ok","Operazione eseguita con successo");
        
        return "createxmlenc";
    }
}
