package com.guo.springboot02;

import com.guo.springboot02.entity.Persion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot02Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Springboot02Application.class, args);
        Persion persion = ioc.getBean(Persion.class);
        System.out.println(persion);
    }

}
