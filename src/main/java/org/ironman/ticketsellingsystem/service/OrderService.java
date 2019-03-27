package org.ironman.ticketsellingsystem.service;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.entity.UserTrainEntity;

public interface OrderService {
    BaseResult getOrderList(UserTrainEntity entity);
    BaseResult updateState(UserTrainEntity entity);
}
