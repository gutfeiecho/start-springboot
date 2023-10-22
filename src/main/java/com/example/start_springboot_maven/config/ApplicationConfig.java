package com.example.start_springboot_maven.config;

import com.example.start_springboot_maven.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author lucas
 * @description 这是一个配置类，添加@Configurable配置类
 * @create 2023-09-12
 */
@Configuration // 配置类本身也是容器中的组件
public class ApplicationConfig {

    @Scope("prototype") // 组件默认是是单实例， 当加上Scope注解，组件多实例
    @Bean("UserEntity") // 替代xml的Bean标签,组件在容器中的名字默认是方法名，可以直接修改注解名
    public User user() {
        var user = new User();
        user.setName("lucas");
        user.setAge(28);
        user.setAddress("杭州市西湖区金地草莓社区");
        user.setMobile("13610912667");
        return user;
    }
}
