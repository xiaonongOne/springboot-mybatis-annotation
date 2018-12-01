package com.example.mybatis.controller;

import com.example.mybatis.bean.User;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *@ClassName UserController.java
 *@Description 测试类
 *@Author Ni ShiChao
 *@Date 2018/12/1
  **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /** 
    * @Description: 查询用户列表
    * @Param: 不用传参数
    * @return: java.util.List<com.example.mybatis.bean.User> 
    * @Author: Ni ShiChao
    * @Date: 2018/12/1 
    */ 
    @RequestMapping(value = "/all")
    public List<User> findAll() {
        return userService.findAll();
    }

    /** 
    * @Description: 通过id查询用户信息
    * @Param: [id] 
    * @return: com.example.mybatis.bean.User 
    * @Author: Ni ShiChao
    * @Date: 2018/12/1 
    */ 
    @RequestMapping(value = "/finduserid/{id}")
    public User findUserById(@PathVariable("id") Long id) {
        return userService.findUserById(id);
    }




}
