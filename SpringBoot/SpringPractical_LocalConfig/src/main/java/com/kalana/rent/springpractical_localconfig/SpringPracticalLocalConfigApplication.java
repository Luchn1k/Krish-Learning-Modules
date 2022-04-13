package com.kalana.rent.springpractical_localconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringPracticalLocalConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPracticalLocalConfigApplication.class, args);
    }

}
