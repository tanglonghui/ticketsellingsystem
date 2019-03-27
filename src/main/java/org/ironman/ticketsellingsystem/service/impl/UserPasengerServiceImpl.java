package org.ironman.ticketsellingsystem.service.impl;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.dao.UserPasengerMapper;
import org.ironman.ticketsellingsystem.entity.UserPasengerEntity;
import org.ironman.ticketsellingsystem.service.UserPasengerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserPasengerService")
public class UserPasengerServiceImpl implements UserPasengerService {
    @Resource
    UserPasengerMapper userPasengerMapper;


    @Override
    public BaseResult getPasengerByUserId(UserPasengerEntity entity) {
        BaseResult baseResult=new BaseResult();
        baseResult.setSuccess(true);
        baseResult.setList(userPasengerMapper.selectPasengerListByUserId(entity));
        return baseResult;
    }
}
