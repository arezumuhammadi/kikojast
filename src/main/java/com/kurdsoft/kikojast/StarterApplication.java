package com.kurdsoft.kikojast;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StarterApplication {
    public static void main(String[] args) {

        SpringApplication.run(StarterApplication.class);
    }
}
