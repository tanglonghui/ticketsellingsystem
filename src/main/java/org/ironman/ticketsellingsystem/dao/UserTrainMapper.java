package org.ironman.ticketsellingsystem.dao;


import org.ironman.ticketsellingsystem.entity.UserTrainEntity;

import java.util.List;

public interface UserTrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserTrainEntity record);

    int insertSelective(UserTrainEntity record);

    UserTrainEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTrainEntity record);

    int updateByPrimaryKey(UserTrainEntity record);

    //以状态和userId查询数据。
    List<UserTrainEntity> selectByState(UserTrainEntity record);

    //修改状态
    int updateState(UserTrainEntity record);

    //插入
    int insertNoId(UserTrainEntity record);
}