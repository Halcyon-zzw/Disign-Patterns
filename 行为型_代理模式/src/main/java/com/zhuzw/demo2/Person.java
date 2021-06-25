package com.zhuzw.demo2;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2020-12-15 16:47
 * @Version: 1.0
 */
public class Person implements HumanBehavior {
    @Override
    public void walk() {
        System.out.println("人类走路...");
    }

    @Override
    public String speek() {
        return "随便说说";
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
