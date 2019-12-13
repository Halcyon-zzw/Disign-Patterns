package duck;

import stragety.FlyNoWay;


/**
 * 橡胶鸭子
 *
 * @Author: zhuzw
 * @Date: 2019/8/6 16:53
 * @Version: 1.0
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        super();
        //提供飞行能力，不能飞行
        super.setFlayingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("橡胶鸭：全身黄色，嘴巴红");
    }
}
