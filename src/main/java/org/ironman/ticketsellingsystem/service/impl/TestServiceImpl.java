package org.ironman.ticketsellingsystem.service.impl;

import org.ironman.ticketsellingsystem.dao.TestDao;
import org.ironman.ticketsellingsystem.entity.TestEntity;
import org.ironman.ticketsellingsystem.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("TestService")
public class TestServiceImpl implements TestService {
    @Resource
    private TestDao testDao;
    @Override
    public TestEntity getUserNameById(int id) {
        //业务逻辑代码
        return testDao.selectUserName(id);
    }
}
