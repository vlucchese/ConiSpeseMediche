package it.conispesemediche.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class TestXml {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = "C:/Users/vlucchese/Desktop/REPO/CONI/testValidate/";
		String xsd = "new.xsd";
		String xml = "sportsalute_ts.xml";
		
	    File xmlFile = new File(path+xml);
	    InputStream xmlStream = new FileInputStream(xmlFile);
	    
	    File xsdFile = new File(path+xsd);
	    InputStream xsdStream = new FileInputStream(xsdFile);
		
		System.out.println(validateAgainstXSD(xmlStream, xsdStream));
	}
	
	static boolean validateAgainstXSD(InputStream xml, InputStream xsd)
	{
		
	    try
	    {
	        SchemaFactory factory = 
	            SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	        Schema schema = factory.newSchema(new StreamSource(xsd));
	        Validator validator = schema.newValidator();
	        validator.validate(new StreamSource(xml));
	        
	        return true;
	    }
	    catch(Exception ex)
	    {
	    	System.out.println(ex);
	        return false;
	    }
	}

}
