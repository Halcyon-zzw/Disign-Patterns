package com.zhuzw.demo1;

import com.zhuzw.demo1.dynamic.TimeHander;
import com.zhuzw.demo1.static_proxy.CarLogProxy;
import com.zhuzw.demo1.static_proxy.CarTimeProxy;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/8/9 14:07
 * @Version: 1.0
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        tesTimeAndLogStaticProxy();
        testTimeProxyDynamic();
    }

    /**
     * 静态代理
     */
    public static void tesTimeStaticProxy() {
        CarTimeProxy proxyCarStatic = new CarTimeProxy(new Car());
        proxyCarStatic.move();
    }

    /**
     * 静态代理 - 多个代理类
     */
    public static void tesTimeAndLogStaticProxy() {
        Car car = new Car();
        CarTimeProxy carTimeProxy = new CarTimeProxy(car);
        CarLogProxy carLogProxy = new CarLogProxy(carTimeProxy);

        carLogProxy.move();
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
//        InvocationHandler invocationHandler = new TimeHander(car);
        TimeHander timeHander = new TimeHander(car);
        /**
         * loader: 类加载器
         * interfaces: 实现的接口
         * hander: 处理器
         */
        Moveable moveable = (Moveable) timeHander.build();
        moveable.move();


    }
}
