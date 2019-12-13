package com.zhuzw.demo1;

import com.zhuzw.demo1.dynamic.TimeHander;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/8/9 14:07
 * @Version: 1.0
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
//        tesTimeAndLogProxy();
        testTimeProxyDynamic();
    }

    public static void tesTimeProxy() {
        CarTimeProxt proxyCarStatic = new CarTimeProxt(new Car());
        proxyCarStatic.move();
    }

    public static void tesTimeAndLogProxy() {
        Car car = new Car();
        CarTimeProxt carTimeProxt = new CarTimeProxt(car);
        CarLogProxt carLogProxt = new CarLogProxt(carTimeProxt);

        carLogProxt.move();
    }


    /**
     * 动态代理实现步骤
     *
     * 1、创建实现IncocationHandle的类，在invoke中实现代理逻辑
     * 2、创建被代理的类（Car）以及接口（Moveable）
     * 3、调用Proxy的静态方法（newProxyInstance），创建一个代理类
     * 4、通过代理调用方法
     */
    public static void testTimeProxyDynamic() {
        Car car = new Car();

        InvocationHandler invocationHandler = new TimeHander(car);
        Class<?> clazz = car.getClass();
        /**
         * loader: 类加载器
         * interfaces: 实现的接口
         * hander: 处理器
         */
        Moveable moveable = (Moveable) Proxy.newProxyInstance(clazz.getClassLoader(),
                clazz.getInterfaces(),
                invocationHandler);
        moveable.move();


    }
}
