package com.hlt.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hltravel on 16/3/8.
 */

@RestController
public class DemoController {


    @RequestMapping("demo")
    public String hello(){
        return "--demo--";
    }

    @RequestMapping("demo/{name}")
    public String hello(@PathVariable("name") String name,Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
