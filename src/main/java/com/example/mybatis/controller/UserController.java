package com.example.mybatis.controller;

import com.example.mybatis.bean.User;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 *@ClassName UserController.java
 *@Description 测试类
 *@Author Xiao Nong
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
    * @Author: Xiao Nong
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
    * @Author: Xiao Nong
    * @Date: 2018/12/1 
    */ 
    @RequestMapping(value = "/finduserid/{userId}")
    public User findUserById(@PathVariable("userId")  Long id) {
        return userService.findUserById(id);
    }

    /** 
    * @Description: 保存用户信息方法
    * @Param: [user] 
    * @return: void 
    * @Author: Xiao Nong
    * @Date: 2018/12/2 
    */
    @RequestMapping(value = "add")
    public void save(User user) {
        userService.insert(user);
    }
    /** 
    * @Description: 修改用户信息方法
    * @Param: [user] 
    * @return: void 
    * @Author: Xiao Nong
    * @Date: 2018/12/2 
    */ 
    @RequestMapping(value = "update")
    public void update (User user) {
        userService.update(user);
    }

    /**
    * @Description:  删除用户信息方法
    * @Param: [user]
    * @return: void
    * @Author: Xiao Nong
    * @Date: 2018/12/2
    */
    @RequestMapping(value = "delete/{userId}")
    public void delete (@PathVariable("userId") Long id) {
        userService.delete(id);
    }
}
