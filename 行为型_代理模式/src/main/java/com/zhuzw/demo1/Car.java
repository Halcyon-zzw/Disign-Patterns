package com.zhuzw.demo1;

import java.util.Random;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/8/9 14:01
 * @Version: 1.0
 */
public class Car implements Moveable {
    @Override
    public void move() {
        try {
            System.out.println("汽车行驶中...");
            Thread.sleep(new Random().nextInt(1000));
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
