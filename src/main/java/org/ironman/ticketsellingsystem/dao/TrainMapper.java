package org.ironman.ticketsellingsystem.dao;


import org.ironman.ticketsellingsystem.entity.TrainEntity;

import java.util.Date;
import java.util.List;

public interface TrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TrainEntity record);

    int insertSelective(TrainEntity record);

    TrainEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrainEntity record);

    int updateByPrimaryKey(TrainEntity record);

    List<TrainEntity> selectByDate(TrainEntity record);

    List<TrainEntity> selectByCard(TrainEntity record);
}