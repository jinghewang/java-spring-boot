package com.hlt.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hltravel on 16/3/8.
 */

@RestController
public class TestController {


    @RequestMapping("/test")
    String home(String name) {
        return "Hello World:" + name;
    }


    @RequestMapping("/test/json")
    String json(String name) {
        return "{name:'wjh',age:18}";
    }


    @RequestMapping("/users/{username}")
    public String userProfile(@PathVariable("username") String username) {
        return String.format("user %s", username);
    }

    @RequestMapping("/posts/{id}")
    public String post(@PathVariable("id") int id) {
        return String.format("post %d", id);
    }

    @RequestMapping(value = "users/age/{age}",method = RequestMethod.GET)
    public String get(@PathVariable("age") int age){
        return String.format("age is: %d",age);
    }

}
