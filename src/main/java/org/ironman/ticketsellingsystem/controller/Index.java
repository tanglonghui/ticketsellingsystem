package org.ironman.ticketsellingsystem.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {
    @RequestMapping("/test123")
    public ModelAndView index(){
        ModelAndView md=new ModelAndView("test.html");
        md.addObject("m","你好，世界");
        return md;
    }
}
