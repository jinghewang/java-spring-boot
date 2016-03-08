package com.hlt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hltravel on 16/3/8.
 */

@Controller
public class HelloController {


    @RequestMapping("hello1")
    public String hello1(){
        return "--hello--";
    }


    @RequestMapping("hello2/{name}")
    public String hello(@PathVariable("name") String name,Model model){
        model.addAttribute("name",name);
        return "hello";
    }


    @RequestMapping("hello3/{name}")
    public ModelAndView hello2(@PathVariable("name") String name,Model model){
        model.addAttribute("name",name);
        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;
    }
}
