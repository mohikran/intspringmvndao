package integration.WebService;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import integration.domaine.Personne;

public class MainRESTWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne personne = new Personne();

		Client client = Client.create();
		WebResource webresource = client.resource("http://localhost:8080/integtoutspring/rest/webservice/ungars/");
		String input = "Ceci est un test";
		ClientResponse response = webresource.type("application/json").post(ClientResponse.class, input);

		if (response.getStatus() != 201) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}

		System.out.println("Output from Server .... \n");
		String output = response.getEntity(String.class);
		System.out.println(output);
	}

}
