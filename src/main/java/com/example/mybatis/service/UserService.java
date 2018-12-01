package com.example.mybatis.service;

import com.example.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UserService {
    /** 
    * @Description: 查询用户全部列表
    * @Param: [] 
    * @return: java.util.List<com.example.mybatis.bean.User> 
    * @Author: Ni ShiChao
    * @Date: 2018/12/1 
    */ 
    List<User> findAll();
    /**
    * @Description: 通过用户id查询User用户
    * @Param: [id]
    * @return: com.example.mybatis.bean.User
    * @Author: Ni ShiChao
    * @Date: 2018/12/1
    */
    User findUserById(@Param("id") Long id);

}
