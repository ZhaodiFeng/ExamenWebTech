package edu.ap.registraties;

import org.restlet.resource.ClientResource;

public class TestClient {

     public static void main(String[] args) {
           
             try {
            	ClientResource resource = new ClientResource("http://localhost:8181/stvincent/regs");
            	// Post a new race
            	String reg= "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
            	reg += "<reg id=\"0\" date=\"13/07/2016\"><name>Alan</name>";
            	reg += "<geboorteDatum>10/05/1993</geboorteDatum>";
            	reg += "<verpleegkundige>Unkown</verpleegkundige><diagnose>Unkonwn</diagnose></reg>";
        		resource.post(reg);
        		// get the response
        		reg= "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
            	reg += "<reg id=\"1\" date=\"14/07/2016\"><name>Bob</name>";
            	reg += "<geboorteDatum>10/05/1990</geboorteDatum>";
            	reg += "<verpleegkundige>Unkown</verpleegkundige><diagnose>Unkonwn</diagnose></reg>";
            	resource.post(reg);
            	System.out.println(resource.getResponseEntity().getText());
            }
            catch (Exception e) {
                System.out.println("In main : " + e.getMessage());
            }
        }
    }
