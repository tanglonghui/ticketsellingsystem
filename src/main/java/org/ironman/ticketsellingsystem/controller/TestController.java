package org.ironman.ticketsellingsystem.controller;


import org.ironman.ticketsellingsystem.entity.TestEntity;
import org.ironman.ticketsellingsystem.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
//@Controller 和 @RestController 是有区别的。@RestController 相当于@Controller+@ResponseBody
@Controller
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/test")
    public String index(Model model) {
        TestEntity testEntity=testService.getUserNameById(1);
       // model.addAttribute("hello", "hello world");
        model.addAttribute("hello", testEntity.getUsername());
        return "test";
    }
}
