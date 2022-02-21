package com.bilgeadam.odevbolumapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OdevBolumAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(OdevBolumAppApplication.class, args);
    }

}
