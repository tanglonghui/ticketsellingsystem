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
    /**
     * @param : userId state
     * @Description TODO : 根据状态获得订单结果
     */
    @RequestMapping("/orderList")
    public BaseResult getOrderListbyState(UserTrainEntity entity){
        return orderService.getOrderList(entity);
    }
    /**
     * @param : userId state
     * @Description TODO : 改变订单状态
     */
    @RequestMapping("/changOrderState")
    public BaseResult changOrderState(UserTrainEntity entity){
        return orderService.updateState(entity);
    }
    /**
     * @param : userId state
     * @Description TODO : 购买车票
     */
    @RequestMapping("/addOrder")
    public BaseResult addOrder(UserTrainEntity entity){
        return orderService.insertOrder(entity);
    }

}
