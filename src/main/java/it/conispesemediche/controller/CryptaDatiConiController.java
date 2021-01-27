/**
 * 
 */
package it.conispesemediche.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.conispesemediche.utils.Encrypt;

/**
 * @author Vincenzo
 *
 */
@Controller
@RequestMapping(value = "/**")
public class CryptaDatiConiController {
	
private static final Logger logger = Logger.getLogger(CryptaDatiConiController.class);

	

	@Resource
	public ApplicationContext context;
	
	@Resource(name="messageSource")
	public ReloadableResourceBundleMessageSource  messageSource;
	
	@Resource(name="encrypt")
	public Encrypt  encrypt;
	
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
	
	@RequestMapping(value = "/encryptconi", method = RequestMethod.GET)
    public String doLogin(final Model model, final HttpServletRequest request, final HttpServletResponse response) {
    	logger.info("*** Start Crypta Dati ***");
       	
    	model.addAttribute("pincode",encrypt.getEncryptStringBase64(pincode));
    	model.addAttribute("codiceRegione",codiceRegione);
    	model.addAttribute("codiceAsl",codiceAsl);
    	model.addAttribute("codiceSSA",codiceSSA);
    	model.addAttribute("cfProprietario",cfProprietario);
    	logger.info("*** Fine Invio Spese Mediche Coni ***");
    	model.addAttribute("ok","Operazione eseguita con successo");
        
        return "cripta";
    }

}
