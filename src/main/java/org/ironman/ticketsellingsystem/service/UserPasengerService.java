package org.ironman.ticketsellingsystem.service;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.entity.UserPasengerEntity;

public interface UserPasengerService {
    BaseResult getPasengerByUserId(UserPasengerEntity entity);
}
