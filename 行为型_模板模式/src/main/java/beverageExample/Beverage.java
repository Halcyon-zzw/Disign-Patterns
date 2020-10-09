package beverageExample;

/**
 * 抽象基类，未所有子类提供一个算法框架
 *
 * 提神饮料
 *
 * @Author: zhuzw
 * @Date: 2019/8/6 10:32
 * @Version: 1.0
 */
public abstract class Beverage {
    /**
     * 制备饮料的模板方法
     * 封装了所有子类共同遵循的算法框架
     * 声明为final，不能被复写
     */
    public final void prepareBeverageTemplate() {
        //步骤一：将水煮沸
        boilWater();
        //步骤二：泡制饮料
        brew();
        //步骤三：导入杯中
        pourInCup();
        //步骤四：加入调喂料
        if (isAddCondiments()) {
            addCondiments();
        }
        
    }

    /**
     * Hook,钩子函数。提供一个默认（或空）的实现
     * 具体的子类可以选择性的挂钩以及如何挂钩
     *
     * 询问用户是否加入调料
     * @return 默认返回true
     */
    protected boolean isAddCondiments() {
        return true;
    }

    /**
     * 基本方法，将水煮沸
     */
    private void boilWater() {
        System.out.println("将水煮沸");
    }

    /**
     * 泡制饮料
     */
    protected abstract void brew();


    /**
     * 基本方法，将水导入杯中
     */
    private void pourInCup() {
        System.out.println("导入杯中");
    }

    /**
     * 加入调味料
     */
    protected abstract void addCondiments();
}
