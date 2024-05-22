package com.jb.controller;

import com.jb.models.User;
import com.jb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){

        return this.userService.getAllUser();
    }
    @GetMapping("/{username}")
public User getUser(@PathVariable("username") String username){
return this.userService.getUser(username);
}
@PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
}
@GetMapping("/current-user")
public String getLoggedInUser(Principal principal){
return principal.getName();
}
}
