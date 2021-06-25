package com.zhuzw.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2020-12-15 16:48
 * @Version: 1.0
 */
public class MyInvocationHandler implements InvocationHandler {
    private Person person;

    public MyInvocationHandler(Person person) {
        this.person = person;
    }

    public HumanBehavior build() {
        Class clazz = person.getClass();
        return (HumanBehavior) Proxy.newProxyInstance(clazz.getClassLoader(),
                clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("walk")) {
            System.out.println("准备调用walk()方法...");
        }else if (method.getName().equals("speek")){
            System.out.println("准备调用speek()方法...");
        }
        Object invoke = method.invoke(person, args);
        System.out.println("调用方法结束。");
        return invoke;
    }
}
