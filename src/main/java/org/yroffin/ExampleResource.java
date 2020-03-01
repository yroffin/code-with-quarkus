package org.yroffin;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@RequestScoped
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("permit-all")
    @PermitAll
    public String hello() {
        return "hello plus dev plus";
    }
}