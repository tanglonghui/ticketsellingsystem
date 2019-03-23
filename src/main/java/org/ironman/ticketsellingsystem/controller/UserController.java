package org.ironman.ticketsellingsystem.controller;


import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.entity.UserEntity;
import org.ironman.ticketsellingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


//@Controller 和 @RestController 是有区别的。@RestController 相当于@Controller+@ResponseBody
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    //登录
    @RequestMapping("/login")
    public BaseResult login(HttpServletRequest request) {
        return userService.login(request.getParameter("account"),request.getParameter("password"));
    }
    //注册
    @RequestMapping("/register")
    public BaseResult register(UserEntity userEntity) {

        return userService.register(userEntity);
    }
    //修改个人信息
    @RequestMapping("/updateUser")
    public BaseResult updateUser(UserEntity userEntity) {

        return userService.register(userEntity);
    }
    //获得用户信息
    @RequestMapping("/selectUser")
    public BaseResult selectUser(int id) {
        return userService.selectUser(id);
    }

    //登录
    @RequestMapping("updatePassword")
    public BaseResult updadtePassword(HttpServletRequest request) {
        return userService.updatePassword(request.getParameter("account"),request.getParameter("password"),request.getParameter("password"));
    }
}
