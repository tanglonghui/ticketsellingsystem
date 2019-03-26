package org.ironman.ticketsellingsystem.dao;


import org.ironman.ticketsellingsystem.entity.PasengerEntity;

public interface PasengerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PasengerEntity record);

    int insertSelective(PasengerEntity record);

    PasengerEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PasengerEntity record);

    int updateByPrimaryKey(PasengerEntity record);
}