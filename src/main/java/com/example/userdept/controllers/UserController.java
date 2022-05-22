
package com.example.userdept.controllers;

import com.example.userdept.entities.User;
import com.example.userdept.repositories.UserRepsitory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    
    @Autowired
    private UserRepsitory repsitory; 
    
    @GetMapping
    public List<User> findAll(){
        List<User> result = repsitory.findAll();
        return result;
    }
  /*não levando em consideração para este exercício, demais tratamentos*/  
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        User result = repsitory.findById(id).get();
        return result;
    }
    
    @PostMapping 
    public User insert(@RequestBody User user) {
        User result = repsitory.save(user);
        return result;
    }
    
}
