package org.ironman.ticketsellingsystem.dao;


import org.apache.ibatis.annotations.Param;
import org.ironman.ticketsellingsystem.entity.UserEntity;
/**
 *  分析：
 *  增加： 注册新用户
 *  查询： 查询用户信息
 *  修改： 修改账号，密码。
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    int insertUser(UserEntity userEntityEntity);

    //检查账号密码是否正确
    boolean checkLogin(@Param("account") String account, @Param("password") String password);

    //检查该账号是否被注册
    boolean checkRegister(String account);

    //返回值是更新的条目数量
    int updateUser(UserEntity userEntityEntity);

    //通过account 查询用户信息
    UserEntity selectUser(String account);

    //修改账号密码 返回值是更新的条目数量
    int updateUserPassword(UserEntity userEntityEntity);

    //修改用户信息 返回值是更新的条目数量
    int updateUserInfo(UserEntity userEntityEntity);
}