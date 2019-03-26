package org.ironman.ticketsellingsystem.service.impl;

import org.apache.catalina.User;
import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.dao.TrainMapper;
import org.ironman.ticketsellingsystem.entity.TrainEntity;
import org.ironman.ticketsellingsystem.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service("TrainService")
public class TrainServiceImpl implements TrainService {
    BaseResult baseResult;
    @Resource
    TrainMapper trainMapper;
    @Override
    public BaseResult trainList(Date date) {
        baseResult =new BaseResult();
        baseResult.setSuccess(true);
        TrainEntity trainEntity=new TrainEntity();
        trainEntity.setTrainTime(date);
        baseResult.setList(trainMapper.selectByDate(trainEntity));
        return baseResult;
    }
}
