package com.guo.springboot02.controller;

import com.guo.springboot02.entity.User;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.POST ,value = "/user/{id}")
    public String postUser(@PathVariable("id") Integer id,@RequestParam String name,@CookieValue(value = "Origin",required = false) String origin){
        return "id:" + id + "\n" + "name:" + name + "\n" + "Origin:" + origin + "\n";
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE ,value = "/user")
    public User deleteUser(){
        return new User();
    }

    @RequestMapping(method = RequestMethod.PUT ,value = "/user")
    public String upDateUSer(){
        return "put-user";
    }


    @RequestMapping("/user/test")
    public String testPojo(User user){
        return user.toString();
    }


    @RequestMapping("/user/testResource")
    public User testResouce(){
        return new User();
    }
}
