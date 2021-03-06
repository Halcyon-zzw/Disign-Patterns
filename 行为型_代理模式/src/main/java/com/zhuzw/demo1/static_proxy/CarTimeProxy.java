package com.zhuzw.demo1.static_proxy;

import com.zhuzw.demo1.Car;
import com.zhuzw.demo1.Moveable;

/**
 * 静态时间代理
 *
 * @Author: zhuzw
 * @Date: 2019/8/9 14:11
 * @Version: 1.0
 */
public class CarTimeProxy implements Moveable {
    private Car car;

    public CarTimeProxy(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        car.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶。");
        System.out.println("汽车行驶时间：" + (endTime - startTime));
    }
}
