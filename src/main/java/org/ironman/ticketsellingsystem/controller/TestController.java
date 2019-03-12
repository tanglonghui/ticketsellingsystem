package org.ironman.ticketsellingsystem.controller;


import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.entity.TestEntity;
import org.ironman.ticketsellingsystem.entity.UserEntity;
import org.ironman.ticketsellingsystem.service.TestService;
import org.ironman.ticketsellingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @Autowired
    private UserService userService;
    @RequestMapping("/test2")
    @ResponseBody
    public BaseResult test2(Model model) {
//        boolean b=userService.register("1");
//        boolean f=userService.login("1","1");
//        if (f){
//            model.addAttribute("hello", "正确");
//        }else {
//            model.addAttribute("hello", "错误");
//        }
//        UserEntity userEntity=new UserEntity();
//        userEntity.setId(1);
//        userEntity.setAccount("5");
//        userEntity.setPassword("2");
//        userEntity.setAge(2);
//        userEntity.setEmal("2");
//        userEntity.setPhone("2");
//        userEntity.setIdCard(3);
//        userEntity.setType("2");
//        userEntity.setName("2");
//        userEntity.setSex("2222");
//        userEntity.setState("1");

        return userService.selectUser(10);
    }
}
