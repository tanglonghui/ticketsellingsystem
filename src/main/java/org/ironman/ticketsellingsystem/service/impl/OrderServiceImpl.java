package org.ironman.ticketsellingsystem.service.impl;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.dao.UserPasengerMapper;
import org.ironman.ticketsellingsystem.dao.UserTrainMapper;
import org.ironman.ticketsellingsystem.entity.UserTrainEntity;
import org.ironman.ticketsellingsystem.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    UserTrainMapper userTrainMapper;

    @Override
    public BaseResult getOrderList(UserTrainEntity entity) {
        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(true);
        baseResult.setList(userTrainMapper.selectByState(entity));
        return baseResult;
    }

    @Override
    public BaseResult updateState(UserTrainEntity entity) {
        BaseResult baseResult = new BaseResult();
        int i = userTrainMapper.updateState(entity);
        if (i == 1) {
            baseResult.setSuccess(true);
            baseResult.setMessage("更新成功");
        } else {
            baseResult.setSuccess(false);
            baseResult.setMessage("更新失败");
        }
        return baseResult;
    }

    @Override
    public BaseResult insertOrder(UserTrainEntity entity) {
        BaseResult baseResult = new BaseResult();
        int i = userTrainMapper.insertNoId(entity);
        if (i == 1) {
            baseResult.setSuccess(true);
            baseResult.setMessage("购买成功");
        } else {
            baseResult.setSuccess(false);
            baseResult.setMessage("购买失败");
        }
        return baseResult;
    }

//    @Override
//    public BaseResult insertOrder(UserTrainEntity entity) {
//        return null;
//    }
}
