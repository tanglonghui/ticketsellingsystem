package org.ironman.ticketsellingsystem.dao;


import org.ironman.ticketsellingsystem.entity.UserPasengerEntity;

public interface UserPasengerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPasengerEntity record);

    int insertSelective(UserPasengerEntity record);

    UserPasengerEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPasengerEntity record);

    int updateByPrimaryKey(UserPasengerEntity record);
}