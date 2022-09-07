package com.config;

import com.entity.Car;
import com.entity.Pet;
import com.entity.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ Configuration将类标记为配置组件，相当于spring的xml文件，该类也会被ioc容器管理
 *
 *  配置类中的方法可以被@ Bean标注，被标注方法的返回值会被IOC容器进行管理,并且都是单例的，bean的id默认为方法名，也可以自己设置
 *
 *  proxyBeanMethods是@ Configuration的属性，表示：被@Bean标记的方法是否要被代理，默认为true
 *    Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *    Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *    组件依赖必须使用Full模式默认。其他默认是否Lite模式
 *
 *    Full和Lite使用情况
 *    当组件之间无依赖关系，使用Lite可以不用创建代理，减少判断，加快程序启动
 *    当组件之间存在依赖关系，使用依赖关系，需要使用Full模式，不然依赖类中存在的依赖对象，与容器中的依赖对象不一致
 *
 */
@Configuration(proxyBeanMethods = true)
public class BeanConfig {

    @Bean("user")
    public User getUser(){
        return new User("zhangsan",getPet());
    }

    @Bean("pet")
    public Pet getPet(){
        return new Pet("dog");
    }
}
