package com.phdareys.ws.resource;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.phdareys.ws.entity.User;
import com.phdareys.ws.service.UserService;

@Path("users")
public class UserResource {

    private UserService userService = new UserService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {

        List < User > users = userService.findAll();
        System.out.println("List");
        if (!users.isEmpty()) {
            return Response.ok(users).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserById(@PathParam("id") int id) {

        User user = userService.fetchBy(id);
        System.out.println("Get");

        if (user.getId()!= 0) {
            return Response.ok(user).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser(User user) {
        System.out.println("Create");
        boolean result = userService.create(user);
        if (result) {
            return Response.ok().status(Response.Status.CREATED).build();
        } else {
            return Response.notModified().build();
        }
    }


    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUser(@PathParam("id") long id, User user) {
        boolean result = userService.update(user);
        System.out.println("Update");

        if (result) {
            return Response.ok().status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.notModified().build();
        }
    }


    @Path("/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteUser(@PathParam("id") int id) {
        boolean result = userService.delete(id);
        System.out.println("Delete");

        if (result) {
            return Response.ok().status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.notModified().build();
        }
    }
}