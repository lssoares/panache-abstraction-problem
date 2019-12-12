package org.acme;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Optional;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;



@Path("/example")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class ExampleResource {

    @Inject
    ExampleRepository exampleRepository;



    @GET
    @Path("{id}")
    public Response find( @PathParam("id") Long id){

        return Optional.of(exampleRepository
                .findById(id))
                .map(Response::ok)
                .orElse(Response.status(NOT_FOUND))
                .build();

    }


    @GET
    @Path("")
    public Response list() {

        return Response.ok(exampleRepository.listAll()).build();
    }

    @GET
    @Path("/empty")
    public Response listEmpty() {

        return Response.ok(exampleRepository.listEmpty()).build();
    }

}