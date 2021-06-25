package com.zhuzw.demo2;

import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2020-12-15 16:40
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(person);
        HumanBehavior humanBehavior = myInvocationHandler.build();
        System.out.println(humanBehavior.speek());
        humanBehavior.walk();
        humanBehavior.sayHello("zhuzw");

        //方式二获取 HumanBehavior
//        Class clazz = Person.class;
//        HumanBehavior humanBehavior2 = (HumanBehavior) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), myInvocationHandler);
//        humanBehavior2.walk();
//        System.out.println(humanBehavior2.speek());
    }
}
