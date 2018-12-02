package com.example.mybatis.service.impl;

import com.example.mybatis.bean.User;
import com.example.mybatis.dao.UserMapper;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
/**
 *@ClassName UserServiceImpl.java
 *@Description 用户实现类
 *@Author Xiao Nong
 *@Date 2018/12/1
  **/
@Service
public class UserServiceImpl implements UserService  {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<User> list = userMapper.getAll();
        return list;
    }

    @Override
    public User findUserById(Long id)
    {
        return userMapper.getOne(id);
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }


}
