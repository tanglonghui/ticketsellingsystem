package org.ironman.ticketsellingsystem.dao;

import org.apache.ibatis.annotations.Param;
import org.ironman.ticketsellingsystem.entity.UserEntity;

public interface UserDao {
    //检查账号密码是否正确
    boolean checkLogin(@Param("account")String account, @Param("password")String password);
    //检查该账号是否被注册
    boolean checkRegister(String account);
    //返回值是插入操作的主键
    int insertUser(UserEntity userEntity);
    //返回值是更新的条目数量
    int updateUser(UserEntity userEntity);
    //通过id 查询用户信息
    UserEntity selectUser(int id);
    //修改账号密码 返回值是更新的条目数量
    int updateUserPassword(@Param("account")String account,@Param("old")String old, @Param("password")String password);
    //修改用户信息 返回值是更新的条目数量
    int updateUserInfo(UserEntity userEntity);
}
