package org.ironman.ticketsellingsystem.service;

import org.ironman.ticketsellingsystem.base.BaseResult;
import org.ironman.ticketsellingsystem.entity.UserEntity;

public interface UserService {
    //登录操作
    BaseResult login(String account, String password);
    //注册操作
    BaseResult register(UserEntity userEntity);
    //修改个人用户信息操作
    BaseResult updateUser(UserEntity userEntity);
    //查询操作
    BaseResult selectUser(int id);
    //修改密码
    BaseResult updatePassword(String account,String old,String password);
}
