package stragety;

/**
 * 不会飞
 *
 * 橡胶鸭实现，体现了扩展性
 *
 * @Author: zhuzw
 * @Date: 2019/8/6 16:53
 * @Version: 1.0
 */
public class FlyNoWay implements FlayingStragety{

    public void fly() {
        System.out.println("我不会飞");
    }
}
