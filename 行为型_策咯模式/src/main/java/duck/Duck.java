package duck;

import stragety.FlayingStragety;

/**
 * 鸭子类
 * @Author: zhuzw
 * @Date: 2019/8/6 15:01
 * @Version: 1.0
 */
public abstract class Duck {

    private FlayingStragety flayingStragety;

    /**
     * 鸭子叫
     */
    public void call() {
        System.out.println("嘎嘎嘎");
    }

    /**
     * 展示鸭子
     */
    public abstract void display();

    /**
     * 新增飞行能力
     */
    /**
     * 方案一：继承
     *      在父类中提供实现方法， 子类通过继承获得父类中的飞行行为
     *      public void fly() {
     *          Sysout.out.println("用翅膀飞行");
     *      }
     * 优点：
     *      简单易用（粗暴丑陋），已有应用可以快速添加飞行的能力
     * 缺点：
     *      不具有灵活性，变更呢给支持差。如一些不能飞行的鸭子（大黄呀、橡胶鸭）或其他飞行方式的鸭子。
     *      通过腹泻fly()方法可以提供新的飞行行为，但很容易造成错误（粗心的程序员忘记复写）
     *
     *
     * 方案二：
     *      在服了中提供抽象方法，强迫子类实现自己的飞行行为
     *      public abstract void fly();
     * 优点：
     *      足够灵活，不会忘记复写
     * 缺点：
     *      代码重复，复用性差。每一个子类都要实现一遍代码。即使相同的也不例外。
     *      出现bug后维护性差。
     *
     *
     * 方案三：组合（favor composition over inheritance, 组合优先于继承）
     *      在类中添加一个私有域，引用另一个类的实例，从而获得新的功能，=》 组合（复合）
     * 优点：足够灵活，扩展性好，可提供任何一种飞行方式
     *      复用代码，更易于维护。（多种鸭子飞行方式一致）
     * 缺点：客户代码需要了解每个策咯实现的细节
     *      增加了对象的数目
     *
     */

    public void fly() {
        flayingStragety.fly();
    }

    public void setFlayingStragety(FlayingStragety flayingStragety) {
        this.flayingStragety = flayingStragety;
    }
}
