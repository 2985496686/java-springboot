package com.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 *@ ConfigurationProperties：配置属性绑定，可以将properties文件中配置的信息对应到一个Bean中，其中prefix是key的前缀
 * 使用前提：这个Bean必须在IOC容器中存在
 * 如果想要将properties配置文件与第三方类库中的类对应，我们可以在配置类(只要是spring)上使用该注解@EnableConfigurationProperties，
 * @ EnableConfigurationProperties要与@ConfigurationProperties配合使用
 * 注意二者使用位置：@ConfigurationProperties要放在要绑定的类上，@ EnableConfigurationProperties要放在spring组件上
 * 例：@EnableConfigurationProperties(Assert.class)
 * 该注解有两个功能：
 * 1.将Assert注册到IOC容器当中
 * 2.提示spring容器进行配置属性绑定
 */
@Component
@ConfigurationProperties(prefix = "car")
public class Car {

    public Car(String brand, long price) {
        this.brand = brand;
        this.price = price;
    }

    public Car() {
    }

    private String brand;

    private long price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }


}
