package beverageExample;

/**
 * @Description: 茶的具体实现
 * @Author: zhuzw
 * @Date: 2019/8/6 10:59
 * @Version: 1.0
 */
public class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println("用80度的热水浸泡五分钟...");
    }

    @Override
    protected void addCondiments() {

        System.out.println("加入柠檬...");
    }


    /**
     * 子类选择挂载钩子函数
     * @return
     */
    @Override
    protected boolean isAddCondiments() {
        return false;
    }

}
