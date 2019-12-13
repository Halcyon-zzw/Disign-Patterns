package observer;


/**
 * 观察者父类
 */
public abstract class Observer {
    protected Subject subject;

    //被观察对象改变后做出相应的变化
    public abstract void update();

    /**
     * 添加取消订阅功能
     */
    public abstract void unsubscribe();
}
