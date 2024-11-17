package com.devsuperior.deslist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"entities"})
public class DeslistApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeslistApplication.class, args);
    }

}
