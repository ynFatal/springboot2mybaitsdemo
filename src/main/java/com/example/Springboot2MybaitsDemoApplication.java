package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dao")  //mapper接口的包
public class Springboot2MybaitsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2MybaitsDemoApplication.class, args);
    }
}
