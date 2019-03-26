package org.ironman.ticketsellingsystem.service;

import org.ironman.ticketsellingsystem.base.BaseResult;

import java.util.Date;

public interface TrainService {
    //根据时间查询某天的列车车次
    BaseResult trainList(Date date);
}
