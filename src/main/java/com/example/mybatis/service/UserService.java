package com.example.mybatis.service;

import com.example.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;
/**
 *@ClassName UserService.java
 *@Description
 *@Author Xiao Nong
 *@Date 2018/12/1
  **/
public interface UserService {
    /** 
    * @Description: 查询用户全部列表
    * @Param: [] 
    * @return: java.util.List<com.example.mybatis.bean.User> 
    * @Author: Xiao Nong
    * @Date: 2018/12/1 
    */ 
    List<User> findAll();
    /**
    * @Description: 通过用户id查询User用户
    * @Param: [id]
    * @return: com.example.mybatis.bean.User
    * @Author: Xiao Nong
    * @Date: 2018/12/1
    */
    User findUserById(@Param("id") Long id);

   /** 
   * @Description: 保存方法 
   * @Param: [user] 
   * @return: void 
   * @Author: Xiao Nong
   * @Date: 2018/12/2 
   */ 
    void insert(User user);
    /**
    * @Description:  更改方法
    * @Param: [user]
    * @return: void
    * @Author: Xiao Nong
    * @Date: 2018/12/2
    */
    void update(User user);
    /**
    * @Description:  删除方法
    * @Param: [id]
    * @return: void
    * @Author: Xiao Nong
    * @Date: 2018/12/2
    */
    void delete(Long id);

}
