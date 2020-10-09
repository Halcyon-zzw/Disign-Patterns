import duck.Duck;
import duck.GreenNeckDuck;
import duck.RedHeadDuck;
import duck.RubberDuck;

/**
 * 策略模式演示类
 *
 * 策略模式的实现
 *      (1) 通过分离变化得出策略接口Strategy
 *      (2) 提供Strategy的实现类
 *      (3) 客户程序中有一个Strategy
 *      (4) 在客户程序中组装正确的Strategy实现类
 *
 * 适用场景：
 *      (1) 多数类仅仅是行为差异
 *      (2) 运行时选取不同的算法变体
 *      (3) 通过多个分支选取一个行为
 *
 *
 * @Author: zhuzw
 * @Date: 2019/8/6 16:48
 * @Version: 1.0
 */
public class StragetyPattenDemo {
    public static void main(String[] args) {
        Duck greenNeckDuck = new GreenNeckDuck();
        greenNeckDuck.display();
        greenNeckDuck.call();
        greenNeckDuck.fly();
        System.out.println("=============");

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.call();
        redHeadDuck.fly();
        System.out.println("=============");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.call();
        rubberDuck.fly();
        System.out.println("=============");



    }
}
