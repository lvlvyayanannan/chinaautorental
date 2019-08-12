package com.kgc.chinaautorental;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/config/config.properties")
@ComponentScan(basePackages = {"com.kgc"})
@MapperScan("com.kgc.chinaautorental")
public class ChinaautorentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChinaautorentalApplication.class, args);
    }

}
