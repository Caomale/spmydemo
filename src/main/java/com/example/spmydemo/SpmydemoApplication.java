package com.example.spmydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.spmydemo.mapper")
public class SpmydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpmydemoApplication.class, args);
    }

}
