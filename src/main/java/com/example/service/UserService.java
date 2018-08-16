package com.example.service;

import com.example.entity.User;
import com.github.pagehelper.PageInfo;

/**
 * @author: Fatal
 * @date: 2018/8/16 0016 11:55
 */
public interface UserService {

    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);

}
