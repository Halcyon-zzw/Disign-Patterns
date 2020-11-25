package com.zhuzw.demo1.dynamic;

import com.zhuzw.demo1.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * dynamic proxy 时间处理器
 *
 * @Author: zhuzw
 * @Date: 2019/8/9 14:37
 * @Version: 1.0
 */
public class TimeHander implements InvocationHandler {

    private Object target;

    public TimeHander(Object target) {
        this.target = target;
    }

    public Object build() {
        /**
         * loader: 类加载器
         * interfaces: 实现的接口
         * hander: 处理器
         */
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),
                clazz.getInterfaces(),
                this);
    }

    /**
     *
     * @param proxy 被代理对象
     * @param method 被代理对象方法
     * @param args 方法参数
     * @return 被代理方法返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");

        Object object = method.invoke(target);

        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶。");
        System.out.println("汽车行驶时间：" + (endTime - startTime));
        return object;
    }
}
