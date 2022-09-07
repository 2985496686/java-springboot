package com;

import com.config.BeanConfig;
import com.entity.Car;
import com.entity.Pet;
import com.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @ SpringBootApplication 标记为springboot应用
 * 主程序类
 * 不能直接放在java目录下
 *
 * @ Import注解，将指定类交给IOC容器进行管理，bean的id名为全类名
 */

@Import({User.class,Pet.class})
@SpringBootApplication
public class MainClass {
    public static void main(String[] args) {
        //返回ioc容器
        ConfigurableApplicationContext ioc = SpringApplication.run(MainClass.class, args);

        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println(name);
        }

        Pet pet = ioc.getBean("pet",Pet.class);
        User user = ioc.getBean("user",User.class);
        BeanConfig beanConfig = ioc.getBean(BeanConfig.class);

        //被@bean标记的方法返回的对象会被ioc容器管理，并且默认都是单例的，在不修改配置的情况下返回值为true
        System.out.println(ioc.getBean("pet",Pet.class) == ioc.getBean("pet",Pet.class));

        /*
            当proxyBeanMethods为true时表示被@Bean标注的方法会被代理，我们获取的BeanConfig对象其实是代理对象
            ,我们通过代理对象获取bean时会在ioc容器中检查该对象是否在容器中存在，如果存在那么就会返回容器中的对象
            在这种情况下，下面返回结果为true

            当proxyBeanMethods为false时，BeanConfig对象就不会被代理
         */
        System.out.println(pet == user.getPet());
        System.out.println(beanConfig.getPet() == beanConfig.getPet());

        System.out.println(ioc.getBean(Car.class));

    }
}
