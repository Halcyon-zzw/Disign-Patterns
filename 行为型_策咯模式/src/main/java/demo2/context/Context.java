package demo2.context;

import demo2.stragety.Strategy;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2020-12-15 14:59
 * @Version: 1.0
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

    /**
     * 动态设置具体策略
     * @param strategy
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
