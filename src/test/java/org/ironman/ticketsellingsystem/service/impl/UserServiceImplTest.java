package org.ironman.ticketsellingsystem.service.impl;

import org.ironman.ticketsellingsystem.TicketsellingsystemApplicationTests;
import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserServiceImplTest extends TicketsellingsystemApplicationTests {
    @Autowired
    private UserService userService;
    BaseResult baseResult;
    @Test
    public void login() {
        baseResult =new BaseResult();
        assertEquals(true,userService.login("1","1").isSuccess());
    }

    @Test
    public void register() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void selectUser() {
    }

    @Test
    public void updatePassword() {
    }

    @Test
    public void forgetPassword() {
    }
}