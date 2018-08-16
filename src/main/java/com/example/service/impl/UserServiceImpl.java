package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Fatal
 * @date: 2018/8/16 0016 11:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;    // 这里会报错，但并不会影响

    @Override
    public int addUser(User user) {
        // 进行校验...
        return userDao.insert(user);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件 pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageInfo<User> findAllUser(int pageNum, int pageSize) {
        // 进行校验...
        // 将参数传进这个方法就可以实现物理分页了，非常简单
        PageHelper.startPage(pageNum,pageSize);
        // 查询出整个 List
        List<User> users = userDao.selectUsers();
        // 把查询结果给 PageInfo，它会帮我们取出当前页的数据
        PageInfo result = new PageInfo(users);
        return result;
    }
}
