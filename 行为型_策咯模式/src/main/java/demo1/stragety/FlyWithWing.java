package demo1.stragety;

/**
 * 用翅膀飞
 *
 * 多种鸭子（绿脖鸭、红头鸭）实现该类，体现了代码的复用
 *
 * @Author: zhuzw
 * @Date: 2019/8/6 16:42
 * @Version: 1.0
 */
public class FlyWithWing implements FlayingStragety {
    public void fly() {
        System.out.println("用翅膀飞行");
    }
}
