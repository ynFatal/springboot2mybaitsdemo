package com.example.dao;

import com.example.entity.User;

import java.util.List;

/**
 * User 映射接口
 * @author: Fatal
 * @date: 2018/8/16 0016 11:40
 */
public interface UserDao {

    int insert(User record);

    List<User> selectUsers();

}
