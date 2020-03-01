package org.yroffin.ctrl;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.yroffin.model.ExampleModel;
import org.yroffin.service.ExampleService;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class ExampleResource {

    @Inject
    ExampleService svc;

    @GET
    @Path("permit-all")
    @PermitAll
    @Produces("application/json")
    public ExampleModel hello() {
        return svc.hello();
    }
}