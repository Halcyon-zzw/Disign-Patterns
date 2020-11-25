package com.zhuzw.demo1.static_proxy;

import com.zhuzw.demo1.Moveable;

/**
 * 静态日志代理
 *
 * @Author: zhuzw
 * @Date: 2019/8/9 14:11
 * @Version: 1.0
 */
public class CarLogProxy implements Moveable {
    private Moveable car;

    public CarLogProxy(Moveable car) {
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("日志开始...");
        car.move();
        System.out.println("日志结束。");
    }
}
