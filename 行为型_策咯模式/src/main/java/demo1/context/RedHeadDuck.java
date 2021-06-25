package demo1.context;

import demo1.stragety.FlyWithWing;

/**
 * 红头鸭
 *
 * @Author: zhuzw
 * @Date: 2019/8/6 16:46
 * @Version: 1.0
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        super();
        //提供飞行能力，用翅膀飞行
        super.setFlayingStragety(new FlyWithWing());
    }

    @Override
    public void display() {

        System.out.println("红头鸭：我的头是红色的");
    }
}
