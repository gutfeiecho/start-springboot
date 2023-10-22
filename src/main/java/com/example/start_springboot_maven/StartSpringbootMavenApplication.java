package com.example.start_springboot_maven;

import com.example.start_springboot_maven.entity.Course;
import com.example.start_springboot_maven.entity.EntityForTest;
import com.example.start_springboot_maven.entity.Seller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Field;

// C:\Users\29533\IdeaProjects\start_springboot_maven\src\main\java\com\example\start_springboot_maven\StartSpringbootMavenApplication.java
@SpringBootApplication
public class StartSpringbootMavenApplication {
    public static void main(String[] args) {
        // java 10: 局部变量类型的自动推断
        var ioc = SpringApplication.run(StartSpringbootMavenApplication.class, args);

        // 1. 获取容器中所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();

        // 2. 遍历
        // dispatcherServlet beanNameViewResolver characterEncodingFilter multipartResolver
        // Springboot将配置自动配置好
        for (String name : names) {
            System.out.println(name);
        }
        EntityForTest entityForTest = ioc.getBean(EntityForTest.class);

        System.out.println("entityForTest::" +entityForTest);
//        Object userEntity01 = ioc.getBean("UserEntity");
//        Object userEntity02 = ioc.getBean("UserEntity");
//
//        System.out.println(userEntity01 == userEntity02); // false
//        for(String s: ioc.getBeanNamesForType(Seller.class)) {
//            System.out.println("Seller: " + s);
//        }
//
//        for(String s: ioc.getBeanNamesForType(Course.class)) {
//            System.out.println("Course: " + s);
//        }
    }

}
