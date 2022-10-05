package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LogController {

    @ResponseBody
    @RequestMapping("/login")
    public String login(HttpServletRequest req){
        req.getSession().setAttribute("springboot:session:url",req.getRequestURI());
        return "登录成功！";
    }
}
