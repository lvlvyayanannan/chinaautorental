package com.chinaautorental;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.chinaautorental.*"})
@MapperScan("com.chinaautorental.dao")
public class ChinaautorentalApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChinaautorentalApplication.class, args);
    }
}
