package com.gx.springboo2_demo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gx.springboo2_demo.mapper")
@SpringBootApplication
public class CAApplication {

    public static void main(String[] args) {
        SpringApplication.run(CAApplication.class, args);
    }

}
