package org.ironman.ticketsellingsystem.controller;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.entity.UserPasengerEntity;
import org.ironman.ticketsellingsystem.service.UserPasengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPasengerController {
    @Autowired
    UserPasengerService userPasengerService;
    @RequestMapping("/myPasengerList")
    public BaseResult getPasenger(UserPasengerEntity userPasengerEntity){
        return userPasengerService.getPasengerByUserId(userPasengerEntity);
    }

}
