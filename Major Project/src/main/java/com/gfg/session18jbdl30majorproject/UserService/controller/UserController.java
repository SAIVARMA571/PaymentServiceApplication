package com.gfg.session18jbdl30majorproject.UserService.controller;


import com.gfg.session18jbdl30majorproject.UserService.Entities.UserServiceRequest;
import com.gfg.session18jbdl30majorproject.UserService.manager.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    @Qualifier("service1")
    private UserService userService;

    @PostMapping("/user")
    void create(@RequestBody UserServiceRequest userServiceRequest){
        userService.create(userServiceRequest);
    }

    @GetMapping("/user/{username}")
    ResponseEntity get(@PathVariable("username") String username){
       return ResponseEntity.ok(userService.get(username));
    }
}
