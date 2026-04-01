package com.yhj.aipassagecreator1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class AiPassageCreator1Application {

    public static void main(String[] args) {
        SpringApplication.run(AiPassageCreator1Application.class, args);
    }

}
