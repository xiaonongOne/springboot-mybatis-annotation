package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *@ClassName Application.java
 *@Description 启动类
 *@Author Xiao Nong
 *@Date 2018/12/1
  **/
@SpringBootApplication
@MapperScan("com.example.mybatis.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
