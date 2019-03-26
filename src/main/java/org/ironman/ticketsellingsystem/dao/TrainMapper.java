package org.ironman.ticketsellingsystem.dao;


import org.ironman.ticketsellingsystem.entity.TrainEntity;

public interface TrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TrainEntity record);

    int insertSelective(TrainEntity record);

    TrainEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrainEntity record);

    int updateByPrimaryKey(TrainEntity record);
}