package com.kalana.rent.profileservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import javax.persistence.Entity;

@SpringBootApplication
@EntityScan(basePackages = "com.kalana.rentacar.model")
@EnableResourceServer
public class ProfileServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfileServiceApplication.class, args);
    }

}
