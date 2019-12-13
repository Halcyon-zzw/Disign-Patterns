package com.zhuzw.designpattern.observerpattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/observer")
public class ObserverPatternApplication {

    @Autowired
    private Subject subject;

    public static void main(String[] args) {
        SpringApplication.run(ObserverPatternApplication.class, args);

    }


    @RequestMapping("/demo")
    public void observerDemo() {
        System.out.println("First state change: 10");
        subject.setState(10);

        System.out.println("Second state change: 20");
        subject.setState(20);
    }

}
