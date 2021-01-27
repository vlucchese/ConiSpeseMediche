package it.conispesemediche.invioSpeseSanitarieSoap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import it.conispesemediche.beanfromxsd.generated.Precompilata.DocumentoSpesa;
import it.conispesemediche.stubInvioFile.InvioTelematicoSS730PMtom;
import it.conispesemediche.stubInvioFile.InvioTelematicoSpeseSanitarie730PService;
import it.conispesemediche.stubInvioFile.Proprietario;
import it.conispesemediche.stubInvioFile.RicevutaInvio;

public class InvioSpeseSanitarieServiceClient {

	public static void main(String[] args) {
		InvioTelematicoSpeseSanitarie730PService service = new InvioTelematicoSpeseSanitarie730PService();
		InvioTelematicoSS730PMtom hw = service.getInvioTelematicoSS730PMtomPort();
		
		
        Map<String, Object> req_ctx = ((BindingProvider)hw).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"https://invioss730pTest.sanita.finanze.it/InvioTelematicoSS730pMtomWeb/InvioTelematicoSS730pMtomPort?wsdl");

        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("Username", Collections.singletonList("UYBP8F4G"));
        headers.put("Password", Collections.singletonList("PXXCLMBE"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        
        String nomeFile="sportsalute_ts.zip";
        
        Proprietario prop =  new Proprietario();
        prop.setCfProprietario("CCSRMO77A09H501E");
        prop.setCodiceAsl("120");
        prop.setCodiceRegione("101");
        prop.setCodiceSSA("88888888");
        
        BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("C:\\InvioSpeseMediche\\SportSalute\\encrypt\\sportsalute_ts.zip"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String b64 = null;
		try {
			b64 = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] decoder = Base64.getEncoder().encode(b64.getBytes());
		
		RicevutaInvio response = hw.inviaFileMtom(nomeFile, "QhABebPIFsgHj9g2tkvYhR8NJdplbgetRkYZDjPs3NZbZz2PYhCS0WQ622dVSzMukZskuvM7fQRvLAzHyGKsNmHkmPD3WIRvgq6Dxo2rcaJIHiE0ZjU975PIGGffWLTU0sJKwNWe7+7pnHDkmdbQOvRnS5KBZwNbO1azh4EvIks=",prop , null, null, null, decoder);
		
		
		System.out.println(response);
		
		
	}

}
