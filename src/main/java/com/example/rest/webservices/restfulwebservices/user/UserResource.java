package com.example.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;
    //get all users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }
    //get user by ID

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping("/users")
    public void createUser (@RequestBody User user){
        User saved = service.save(user);

    }

    public static void main (String[] Args) {
        for (int i=0; i<50; i++) {
            System.out.println("Sorry, Please erdu");
        }
    }
}
