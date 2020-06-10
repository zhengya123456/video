package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

    @RequestMapping("/detail")
    public String hello(){
        return "detail";
    }

    @RequestMapping("/new")
    public ModelAndView getNew(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("new");
        modelAndView.addObject("message",100);
        return modelAndView;
    }
}
