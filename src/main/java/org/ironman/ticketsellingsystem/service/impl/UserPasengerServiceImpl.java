package org.ironman.ticketsellingsystem.service.impl;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.dao.PasengerMapper;
import org.ironman.ticketsellingsystem.dao.UserPasengerMapper;
import org.ironman.ticketsellingsystem.entity.PasengerEntity;
import org.ironman.ticketsellingsystem.entity.UserPasengerEntity;
import org.ironman.ticketsellingsystem.service.UserPasengerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserPasengerService")
public class UserPasengerServiceImpl implements UserPasengerService {
    @Resource
    UserPasengerMapper userPasengerMapper;
    @Resource
    PasengerMapper pasengerMapper;


    @Override
    public BaseResult getPasengerByUserId(UserPasengerEntity entity) {
        BaseResult baseResult=new BaseResult();
        baseResult.setSuccess(true);
        baseResult.setList(userPasengerMapper.selectPasengerListByUserId(entity));
        return baseResult;
    }

    @Override
    public BaseResult addPasenger(UserPasengerEntity entity) {
        BaseResult baseResult=new BaseResult();
        PasengerEntity pasengerEntity=entity.toPasengerEntity();
        int i=pasengerMapper.insertNoId(pasengerEntity);
        if (i==1){
            entity.setPasengerId(pasengerEntity.getId());
            int j=userPasengerMapper.insert(entity);
            if (j==1){
                baseResult.setSuccess(true);
                baseResult.setMessage("新增成功");
            }else {
                baseResult.setSuccess(false);
                baseResult.setMessage("新增失败");
            }
        }else {
            baseResult.setSuccess(false);
            baseResult.setMessage("新增失败");
        }
        return baseResult;
    }
}
