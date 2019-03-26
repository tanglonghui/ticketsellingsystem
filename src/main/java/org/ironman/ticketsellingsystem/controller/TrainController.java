package org.ironman.ticketsellingsystem.controller;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.entity.TrainEntity;
import org.ironman.ticketsellingsystem.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainController {
    @Autowired
    private TrainService trainService;
    //获得列车时刻表
    @RequestMapping("/trainList")
    public BaseResult trainList(TrainEntity trainEntity){
        return trainService.trainList(trainEntity.getTrainTime());
    }
}
