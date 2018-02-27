package com.mning.rest;

/**
 * Created by mning on 8/14/2015.
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class MningRestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MningRestApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MningRestApplication.class);
    }
}
