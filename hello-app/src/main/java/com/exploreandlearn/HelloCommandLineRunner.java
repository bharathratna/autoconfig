package com.exploreandlearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloCommandLineRunner implements CommandLineRunner {

    private final  HelloService helloService;

    public HelloCommandLineRunner(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public void run(String... args) throws Exception {
        helloService.hello("vignesh");
    }
}
