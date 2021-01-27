/**
 * 
 */
package it.conispesemediche.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Base64;

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

/**
 * @author Vincenzo
 *
 */
@Controller
@RequestMapping(value = "/**")
public class LeggiRicevutaController {
	
private static final Logger logger = Logger.getLogger(LeggiRicevutaController.class);

	

	@Resource
	public ApplicationContext context;
	
	@Resource(name="messageSource")
	public ReloadableResourceBundleMessageSource  messageSource;
		
	@Value("${spesemediche.esiti.file}")
	private String esitiTxt;
		
	@Value("${spesemediche.esiti.file.pdf}")
	private String esitiPdf;
	
	@RequestMapping(value = "/esitispesemediche", method = RequestMethod.GET)
    public String doLogin(final Model model, final HttpServletRequest request, final HttpServletResponse response) {
    	logger.info("*** Start Esiti Dati ***");
       	
    	File file = new File(esitiPdf);

		try (FileOutputStream fos = new FileOutputStream(file);) {
			BufferedReader reader = new BufferedReader(new FileReader(esitiTxt));
			String b64 = reader.readLine();
			byte[] decoder = Base64.getDecoder().decode(b64);

			fos.write(decoder);
			logger.info("PDF File Saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	logger.info("*** Fine Esiti Dati ***");
    	model.addAttribute("ok","Operazione eseguita con successo controllare il file pdf negli esiti");
        
        return "esiti";
    }

}
