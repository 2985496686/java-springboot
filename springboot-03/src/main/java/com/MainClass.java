package com;

import com.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "com.mapper")
public class MainClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(MainClass.class,args);
    }
}
