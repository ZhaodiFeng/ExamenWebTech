package edu.ap.races;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RacesApplication extends Application {

	    /**
	     * Creates a root Restlet that will receive all incoming calls.
	     */
	   @Override
	   public synchronized Restlet createInboundRoot() {

	       Router router = new Router(getContext());

	       router.attach("/race", RacesResource.class);
	       router.attach("/race/{race_id}", RaceResource.class);
	       router.attach("/race/{race_id}/runner", RaceRunnersResource.class);
	       router.attach("/race/{race_id}/runner/{runner_id}", RaceRunnerResource.class);

	       return router;
	   }
}


