package com.zhuzw.designpattern.observerpattern;

import org.springframework.stereotype.Component;

/**
 * 二进制观察者
 */
@Component
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String : " + Integer.toBinaryString(subject.getState()));
    }
}
