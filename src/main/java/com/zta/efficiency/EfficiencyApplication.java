package com.zta.efficiency;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoConfiguration
@MapperScan("com.zta.efficiency.dao")
@SpringBootApplication
public class EfficiencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EfficiencyApplication.class, args);
    }
}
