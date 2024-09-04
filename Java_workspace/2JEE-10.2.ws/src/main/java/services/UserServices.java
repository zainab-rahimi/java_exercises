package services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.NotFoundException;

import model.Users;

public class UserServices {
	 private List <Users> users = new ArrayList <Users> () ;
	 
	 public List <Users> findAll(){
		 users = new ArrayList <Users>();
		 users.add(new Users (100, "Felani","felani@gmail.com"));
		 users.add(new Users (200, "Felani2","felani2@gmail.com"));
		 users.add(new Users (300, "Felani3","felani3@gmail.com"));
		return users; 
	 }
	 
	 public Users fetchBy( int id) throws NotFoundException {
		 for (Users users: findAll()) {
			 if (id == users.getId()) {
				 return users;
			 }else {
				 throw new NotFoundException ("The requested resource with the id " + id + " is not found");
			 }
		 }
		 return null;
	 }
		 
	public boolean create (Users user) {
		return users.add(user);
	}
	 
	public boolean update (Users user) {
		for (Users updateUser: users) {
			if (user.getId() == updateUser.getId()) {
				users.remove(updateUser);
				users.add(user);
				return true;
			}
		}
		return false;
	}
}
