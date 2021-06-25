package com.zhuzw.demo1.gclib_proxy;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2020-12-15 17:19
 * @Version: 1.0
 */
public class Person {
    public void walk() {
        System.out.println("人类走路...");
    }

    /**
     * final修饰的方法不会被生成的自类覆盖
     * @return
     */
    public final String speek() {
        return "随便说说";
    }

    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
