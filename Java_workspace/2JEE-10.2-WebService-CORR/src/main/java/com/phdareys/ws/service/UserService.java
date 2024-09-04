package com.phdareys.ws.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.NotFoundException;

import com.phdareys.ws.entity.User;

public class UserService {
	private List < User > users = new ArrayList < User > ();

    public List < User > findAll() {
    	users = new ArrayList < User > ();
        users.add(new User(100, "Ramesh", "ramesh@gmail.com"));
        users.add(new User(101, "Tony", "tony@gmail.com"));
        users.add(new User(102, "Tom", "tom@gmail.com"));
        users.add(new User(103, "John", "john@gmail.com"));
        
        return users;
    }

    public User fetchBy(long id) throws NotFoundException {
        for (User user: findAll()) {
            if (id == user.getId()) {
                return user;
            } else {
                throw new NotFoundException("Resource not found with Id :: " + id);
            }
        }
        return null;
    }

    public boolean create(User user) {
        return users.add(user);
    }

    public boolean update(User user) {
        for (User updateUser: users) {
            if (user.getId() == updateUser.getId()) {
                users.remove(updateUser);
                users.add(user);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id) throws NotFoundException {
        for (User user: users) {
            if (user.getId()==id) {
                users.remove(user);
                return true;
            }
        }
        return false;
    }
}
