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
    /**
     * @param : userId
     * @Description TODO : TODO :  查询旅客的我的列表
     */
    @RequestMapping("/myPasengerList")
    public BaseResult getPasenger(UserPasengerEntity userPasengerEntity){
        return userPasengerService.getPasengerByUserId(userPasengerEntity);
    }
    /**
     * @param : userId  PasengerEntity
     * @Description TODO :   新增绑定一个旅客
     */
    @RequestMapping("/addPasenger")
    public BaseResult addPasenger(UserPasengerEntity userPasengerEntity){
        return userPasengerService.addPasenger(userPasengerEntity);
    }
    /**
     * @parms :   id
     * @describe TODO :   移除一个旅客
     */
    @RequestMapping("/removePasenger")
    public BaseResult removePasenger(UserPasengerEntity userPasengerEntity){
        return userPasengerService.removePasenger(userPasengerEntity);
    }
}
