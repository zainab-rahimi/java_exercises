import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.jupiter.api.Test;

import com.phdareys.ws.entity.User;

import junit.framework.TestCase;

public class UserResourceTest extends TestCase {

    private static final String FULL_PATH = "http://localhost:8080/2JEE-10.2-WebService-CORR/restapi/users";
    
    @Test
    public void testListAllUsers() {

        final ResteasyClient client = new ResteasyClientBuilder().build();
        final ResteasyWebTarget target = client
            .target(FULL_PATH);
        String response = target.request().get(String.class);
        System.out.println(response);
    }
/*
    @Test
    public void testGetUser() {

        final ResteasyClient client = new ResteasyClientBuilder().build();
        final ResteasyWebTarget target = client
            .target(FULL_PATH + "/100");
        Response response = target.request().get();
        User user = response.readEntity(User.class);
        System.out.println(user.toString());
        response.close();
    }
/*
    @Test
    public void testCreateUser() {
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(FULL_PATH);
        Response response = target.request()
            .post(Entity.entity(new User((long) 100, "Amir", "amir@gmail.com"), "application/json"));
        System.out.println(response.getStatus());
        response.close();
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setName("Ram");
        user.setEmail("ram@gmail.com");
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(FULL_PATH + "/102");
        Response response = target.request()
            .put(Entity.entity(user, "application/json"));
        System.out.println(response.getStatus());
        response.close();
    }

    @Test
    public void testDeleteUser() {
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(FULL_PATH + "/101");
        Response response = target.request()
            .delete();
        System.out.println(response.getStatus());
        response.close();

        final ResteasyWebTarget target1 = client
            .target(FULL_PATH);
        String response1 = target1.request().get(String.class);
        System.out.println(response1);
    }
*/
}
