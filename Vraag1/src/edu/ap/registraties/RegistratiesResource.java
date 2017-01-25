package edu.ap.registraties;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import edu.ap.xml.XMLParser;

public class RegistratiesResource extends ServerResource {

	@Get("html")
	public String getRegs() {
		XMLParser parser = new XMLParser();
		return parser.getRegs();
	}
	
	@Post("txt")
	public String addRace(String reg) {
		XMLParser parser = new XMLParser();
		return parser.addReg(reg);
	}

}