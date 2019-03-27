package org.ironman.ticketsellingsystem.dao;


import org.ironman.ticketsellingsystem.entity.UserPasengerEntity;

import java.util.List;

public interface UserPasengerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPasengerEntity record);

    int insertSelective(UserPasengerEntity record);

    UserPasengerEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPasengerEntity record);

    int updateByPrimaryKey(UserPasengerEntity record);

    //查询与改用户绑定的所有旅客
    List<UserPasengerEntity> selectPasengerListByUserId(UserPasengerEntity record);
}