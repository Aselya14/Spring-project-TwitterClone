package com.twitterClone.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.twitterClone")
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.twitterClone"})
@EntityScan(basePackages="com.twitterClone")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
