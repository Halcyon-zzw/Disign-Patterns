package demo2;

import demo2.context.Context;
import demo2.stragety.AddOperation;
import demo2.stragety.MultiplyOperaion;

/**
 * 策略模式演示类
 *
 * @Author: zhuzw
 * @Date: 2020-12-15 15:00
 * @Version: 1.0
 */
public class StrategyDemo {
    public static void main(String[] args) {

        int num1 = 10, num2 = 20;
        Context context = new Context(new MultiplyOperaion());
        System.out.println(num1 + " * " + num2 + " = " + context.executeStrategy(num1, num2));

        context.setStrategy(new AddOperation());
        System.out.println(num1 + " + " + num2 + " = "  + context.executeStrategy(num1, num2));
    }
}
