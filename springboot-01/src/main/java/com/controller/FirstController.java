package com.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Controller
 * @ ResponseBody
 */
@RestController
public class FirstController {

    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World!!!";
    }

}
