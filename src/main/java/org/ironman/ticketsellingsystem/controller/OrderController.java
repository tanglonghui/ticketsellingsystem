package org.ironman.ticketsellingsystem.controller;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.entity.UserTrainEntity;
import org.ironman.ticketsellingsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping()
    public BaseResult getOrderListbyState(UserTrainEntity entity){
        return orderService.getOrderList(entity);
    }
}
