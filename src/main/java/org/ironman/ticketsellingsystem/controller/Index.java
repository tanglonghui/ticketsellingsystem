package org.ironman.ticketsellingsystem.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Index {
    @RequestMapping("/test123")
    public String index(){
        return "testsss";
    }
}
