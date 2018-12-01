package com.example.mybatis.service.impl;

import com.example.mybatis.bean.User;
import com.example.mybatis.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService  {

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }
}
