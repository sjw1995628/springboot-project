package com.jwson.www.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Spring Boot Application 하면 자동 설정 빈 읽기등이 자동으로 되며, 모든 빈들의 최상단에 위치하게 된다.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
