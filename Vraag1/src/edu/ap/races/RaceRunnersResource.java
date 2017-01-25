package edu.ap.races;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import edu.ap.xml.XMLParser;

/**
 * This resource represents all runners for a race instance
 */
public class RaceRunnersResource extends ServerResource {

	@Get("html")
	public String getRunners() {
		String race_id = getAttribute("race_id");
		XMLParser parser = new XMLParser();
		return parser.getRunners(race_id);
	}

}
