package org.ironman.ticketsellingsystem.service.impl;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.dao.TrainMapper;
import org.ironman.ticketsellingsystem.dao.UserPasengerMapper;
import org.ironman.ticketsellingsystem.dao.UserTrainMapper;
import org.ironman.ticketsellingsystem.entity.TrainEntity;
import org.ironman.ticketsellingsystem.entity.UserTrainEntity;
import org.ironman.ticketsellingsystem.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    UserTrainMapper userTrainMapper;
    @Resource
    TrainMapper trainMapper;

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
        int i = userTrainMapper.updateByPrimaryKeySelective(entity);
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
        TrainEntity trainEntity = trainMapper.selectByPrimaryKey(entity.getTrainId());
        Integer seat;
        //商务座
        if (entity.getSeat().equals("0")) {
            seat = Integer.parseInt(trainEntity.getBusinessSeat());
            if (seat > 1) {
                seat--;
                trainEntity.setBusinessSeat(seat.toString());
                trainMapper.updateByPrimaryKeySelective(trainEntity);
            }else {
                baseResult.setSuccess(false);
                baseResult.setMessage("购买失败");
                return baseResult;
            }
        }
        //一等座
        else if (entity.getSeat().equals("1")) {
            seat = Integer.parseInt(trainEntity.getFirstSeat());
            if (seat > 1) {
                seat--;
                trainEntity.setFirstSeat(seat.toString());
                trainMapper.updateByPrimaryKeySelective(trainEntity);
            }else {
                baseResult.setSuccess(false);
                baseResult.setMessage("购买失败");
                return baseResult;
            }
        }
        //二等座
        else if (entity.getSeat().equals("2")) {
            seat = Integer.parseInt(trainEntity.getSecondSeat());
            if (seat > 1) {
                seat--;
                trainEntity.setSecondSeat(seat.toString());
                trainMapper.updateByPrimaryKeySelective(trainEntity);
            }else {
                baseResult.setSuccess(false);
                baseResult.setMessage("购买失败");
                return baseResult;
            }
        } else {
            baseResult.setSuccess(false);
            baseResult.setMessage("购买失败");
            return baseResult;
        }
        int i = userTrainMapper.insertNoId(entity);
        if (i == 1) {
            baseResult.setSuccess(true);
            baseResult.setMessage("" + entity.getId());
        } else {
            baseResult.setSuccess(false);
            baseResult.setMessage("购买失败");
        }
        return baseResult;
    }

}
