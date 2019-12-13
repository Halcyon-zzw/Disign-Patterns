package beverageExample;

/**
 * @Description: 饮料具体子类，提供咖啡的具体实现
 * @Author: zhuzw
 * @Date: 2019/8/6 10:50
 * @Version: 1.0
 */
public class Coffee extends Beverage {

    @Override
    protected void brew() {

        System.out.println("用沸水冲泡咖啡...");
    }

    @Override
    protected void addCondiments() {

        System.out.println("加入糖和牛奶...");
    }
}
