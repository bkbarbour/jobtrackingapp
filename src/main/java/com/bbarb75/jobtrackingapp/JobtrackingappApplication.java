package com.bbarb75.jobtrackingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.bbarb75.jobtrackingapp.controllers"})
public class JobtrackingappApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobtrackingappApplication.class, args);
    }

}
