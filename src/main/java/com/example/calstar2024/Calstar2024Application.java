package com.example.calstar2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Calstar2024Application {

    public static void main(String[] args) {
        SpringApplication.run(Calstar2024Application.class, args);
    }
}
