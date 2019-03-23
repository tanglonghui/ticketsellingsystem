package org.ironman.ticketsellingsystem.service.impl;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.dao.UserDao;
import org.ironman.ticketsellingsystem.entity.UserEntity;
import org.ironman.ticketsellingsystem.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {
    BaseResult baseResult;
    @Resource
    UserDao userDao;

    @Override
    public BaseResult login(String account, String password) {
        baseResult=new BaseResult();
        if (userDao.checkLogin(account, password)){

        }else {
            baseResult.setSuccess(false);
            baseResult.setMessage("账号或密码错误");
        }
        return baseResult;
    }

    @Override
    public BaseResult register(UserEntity userEntity) {
        baseResult=new BaseResult();
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
        baseResult=new BaseResult();
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
        baseResult=new BaseResult();
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

    @Override
    public BaseResult updatePassword(String account, String old, String password) {
        baseResult=new BaseResult();
        if (userDao.checkLogin(account,old)){
           if (userDao.updateUserPassword(account,old,password)==1){
               baseResult.setSuccess(true);
               baseResult.setMessage("密码修改成功");
           }else {
               baseResult.setSuccess(false);
               baseResult.setMessage("密码修改失败");
           }
        }else {
            baseResult.setSuccess(true);
            baseResult.setMessage("原密码不正确");
        }
        return baseResult;
    }

}
