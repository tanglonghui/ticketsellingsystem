package org.ironman.ticketsellingsystem.dao;


import org.ironman.ticketsellingsystem.entity.UserTrainEntity;

public interface UserTrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserTrainEntity record);

    int insertSelective(UserTrainEntity record);

    UserTrainEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTrainEntity record);

    int updateByPrimaryKey(UserTrainEntity record);
}