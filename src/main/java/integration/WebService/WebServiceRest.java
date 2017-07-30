package integration.WebService;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.ws.Endpoint;

import antlr.collections.List;
import integration.domaine.Personne;

@Path("/webservice")
//@WebService
public class WebServiceRest {

	
//	@GET
//	@Path("/{param}")
//	public Response getMsg(@PathParam("param") String msg) {
// 
//		String output = "Jersey repond via OBJIS : " + msg;
// 
//		return Response.status(200).entity(output).build();
// 
//	}
	@GET
	@Path("/ungars")
	@Produces(MediaType.APPLICATION_JSON)
	public List getJSONService () {
		
		Personne personne = new Personne("Alexandre","Piccini");
		Personne personne2 = new Personne("Gerard","Majax");
		
		List myList = (List) new ArrayList<Personne>();
		myList.add(personne2);
		myList.add(personne);

		return myList;
	}
	
	
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response employeJSON (List myList) {
		String result = "Voici l'employe : " + myList;
		return Response.status(201).entity(result).build();
		
	}
	
	
}
