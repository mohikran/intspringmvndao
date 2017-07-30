package WebService;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.xml.ws.Endpoint;

@Path("/webservice")
@WebService
public class WebServiceRest {

	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey repond via OBJIS : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}

	
}
