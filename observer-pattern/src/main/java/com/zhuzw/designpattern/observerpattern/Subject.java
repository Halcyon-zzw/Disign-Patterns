package com.zhuzw.designpattern.observerpattern;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class Subject {
    private int state;

    private List<Observer> observerList = new ArrayList<>();


    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

}
