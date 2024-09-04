package com.phdareys.ws.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.phdareys.ws.entity.HelloWorld;

@Path("hello")
public class HelloWorldResource {
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)	
	public Response helloWorld() {

        HelloWorld helloWorld = new HelloWorld("Hello BGE!");

        return Response.ok(helloWorld).build();
    }
}
