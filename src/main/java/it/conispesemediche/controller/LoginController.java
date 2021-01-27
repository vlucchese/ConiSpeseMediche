
package it.conispesemediche.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/**")
public class LoginController {
	
	private static final Logger logger = Logger.getLogger(LoginController.class);

	
	@Resource
	ApplicationContext context;
	
	@Resource(name="messageSource")
	ReloadableResourceBundleMessageSource  messageSource;
	
	
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String doLogin(final Model model,
    		@RequestParam(value="error", required=false, defaultValue="false") boolean error, 
    		final HttpServletRequest request, final HttpServletResponse response) {
    	logger.info("*** Start Coni Spese Mediche ***");
    	if(error) {
    		model.addAttribute("errorMsg",messageSource.getMessage("error.login", null, LocaleContextHolder.getLocale()));
    	}else {
    		HttpSession session = request.getSession();
    	}
    	
    	model.addAttribute("context",request.getContextPath());
        
        return "login";
    }
    
    
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcomePage(final Model model,
    		final HttpServletRequest request, final HttpServletResponse response) {
    	return "hello";
    }
}
