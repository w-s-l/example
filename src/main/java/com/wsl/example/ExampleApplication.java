package com.wsl.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: wsl
 * @Since: 2024-5-6
 * @Version: 1.0
 * @Description: TODO
 */
@SpringBootApplication
@MapperScan("com.wsl.example.mapper")
public class ExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
