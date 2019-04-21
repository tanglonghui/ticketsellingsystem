package org.ironman.ticketsellingsystem.service;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.entity.TrainEntity;

import java.util.Date;

public interface TrainService {
    //根据时间查询某天的列车车次
    BaseResult trainList(TrainEntity trainEntity);
    //根据时间查询某天的列车车次
    BaseResult trainListByCard(String trainCard);
}
