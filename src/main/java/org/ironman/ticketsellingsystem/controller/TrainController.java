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
    /**
     * @param :
     * @Description TODO : 通过时间获得当天的列车时刻表(起点，终点)
     */
    @RequestMapping("/trainList")
    public BaseResult getTrainListbyTime(TrainEntity trainEntity){
        return trainService.trainList(trainEntity.getTrainTime());
    }
    /**
     * @param :
     * @Description TODO : 通过列车型号获得当天的列车时刻表
     */
    @RequestMapping("/trainListCard")
    public BaseResult getTrainListbyId(TrainEntity trainEntity){
        return trainService.trainListByCard(trainEntity.getTrainCard());
    }
}
