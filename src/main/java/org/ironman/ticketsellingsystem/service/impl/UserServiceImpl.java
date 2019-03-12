package org.ironman.ticketsellingsystem.service.impl;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.dao.UserDao;
import org.ironman.ticketsellingsystem.entity.UserEntity;
import org.ironman.ticketsellingsystem.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {
    BaseResult baseResult=new BaseResult();
    @Resource
    UserDao userDao;

    @Override
    public BaseResult login(String account, String password) {
        if (userDao.checkLogin(account, password)){

        }else {
            baseResult.setSuccess(false);
            baseResult.setMessage("账号或密码错误");
        }
        return baseResult;
    }

    @Override
    public BaseResult register(UserEntity userEntity) {
        if (userDao.checkRegister(userEntity.getAccount())){
            baseResult.setSuccess(false);
            baseResult.setMessage("该账号已经注册");
        }else {
            userDao.insertUser(userEntity);
            baseResult.setSuccess(true);
            baseResult.setMessage("注册成功");
        }
        return baseResult;
    }

    @Override
    public BaseResult updateUser(UserEntity userEntity) {
        if (userDao.updateUser(userEntity)==1){
            baseResult.setSuccess(true);
            baseResult.setMessage("资料更改成功");
        }else {
            baseResult.setSuccess(false);
            baseResult.setMessage("资料更改失败");
        }
        return baseResult;
    }

    @Override
    public BaseResult selectUser(int id) {
        UserEntity userEntity=userDao.selectUser(id);
        if (userEntity!=null){
            baseResult.setSuccess(true);
            baseResult.setData(userEntity);
        }else {
            baseResult.setSuccess(false);
            baseResult.setMessage("查询失败");
        }
        return baseResult;
    }

//    @Override
//    public BaseResult updateUserPassword(int id,String old, String reset) {
//        return null;
//    }
}
