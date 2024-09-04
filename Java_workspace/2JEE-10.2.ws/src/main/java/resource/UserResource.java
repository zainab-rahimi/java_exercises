package resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.Users;
import services.UserServices;

@Path("/users")
public class UserResource {
	private UserServices userservice = new UserServices();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers() {
		List <Users> users = userservice.findAll();
		System.out.println("List");
		if (!users.isEmpty()) {
			return Response.ok().build();
		}
		else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}	
	}
	
@Path("/{id}")
@GET
@Produces(MediaType.APPLICATION_JSON)
public Response getUserById(@PathParam("id") int id) {
	
	Users user = UserServices.fetchBy(id);
	System.out.println("get");
	return null;
	
}

	
}
