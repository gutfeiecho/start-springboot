package com.example.start_springboot_maven.config;

import com.alibaba.druid.FastsqlException;
import com.example.start_springboot_maven.entity.Course;
import com.example.start_springboot_maven.entity.Seller;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;

/**
 * @author lucas
 * @description 测试条件注解
 * @create 2023-09-14
 */
@ConditionalOnMissingClass(value="com.alibaba.druid.FastsqlException") // 放在类级别，如果条件不成立，则配置不生效
@SpringBootConfiguration
public class ApplicationConfigForTest {

    // 当容器中存在FastsqlException.class, 装配Course类
    @ConditionalOnClass(FastsqlException.class)
    @Bean
    public Course courseForTest() {
        return new Course();
    }

    @ConditionalOnMissingClass(value="com.alibaba.druid.FastsqlException")
    @Bean
    public Seller sellerForTest() {
        return new Seller();
    }
}
