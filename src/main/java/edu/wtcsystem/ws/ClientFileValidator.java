package edu.wtcsystem.ws;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by karen.rahmeier on 10/18/2016.
 */
@Path("/client")
public class ClientFileValidator {

    // The Java method will process HTTP GET requests
    @POST
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response getMessage() {
        // Return a simple message
        String output = "Client File Validator";
        return Response.status(200).entity(output).build();
    }
}
