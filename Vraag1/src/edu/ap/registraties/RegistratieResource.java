package edu.ap.registraties;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import edu.ap.xml.XMLParser;

/**
 * This resource represents all runners for a race instance
 */
public class RegistratieResource extends ServerResource {

	@Get("html")
	public String getReg() {
		String reg_id = getAttribute("reg_id");
		XMLParser parser = new XMLParser();
		return parser.getReg(reg_id);
	}

}
