package com.guo.springboot02.controller;

import com.guo.springboot02.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewTestController {
    @RequestMapping("/testview")
    public String viewTest(Model model){
        model.addAttribute("name","张三");
        model.addAttribute("link","baidu.com");
        return "view";
    }

    @ResponseBody
    @RequestMapping("/user/testResource")
    public User testResouce(){
        return new User();
    }
}
