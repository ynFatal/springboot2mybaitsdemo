package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Fatal
 * @date: 2018/8/16 0016 12:05
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 添加
     * @param user
     */
    @PostMapping("/")
    @ResponseBody
    public int addUser (User user){
        // 进行校验...
        return userService.addUser(user);
    }

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     */
    @GetMapping("/")
    @ResponseBody
    public Object finAllUser(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                             @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        // 当前页的详细信息
        PageInfo<User> data = userService.findAllUser(pageNum, pageSize);
        return data;
    }

}
