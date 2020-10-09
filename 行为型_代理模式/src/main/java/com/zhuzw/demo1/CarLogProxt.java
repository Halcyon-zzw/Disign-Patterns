package com.zhuzw.demo1;

/**
 * 静态日志代理
 *
 * @Author: zhuzw
 * @Date: 2019/8/9 14:11
 * @Version: 1.0
 */
public class CarLogProxt implements Moveable{
    private Moveable car;

    public CarLogProxt(Moveable car) {
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("日志开始...");
        car.move();
        System.out.println("日志结束。");
    }
}
