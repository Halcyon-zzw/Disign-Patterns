package observer;

import observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class Subject {

    /**
     * 观察者列表
     */
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 状态值
     */
    private int state;


    /**
     * 添加观察者
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    /**
     * 取消订阅
     * @param observer 待取消的订阅者
     */
    public void unsubscribe(Observer observer) {
        //使用Iterator + hasNext()删除
        Iterator<Observer> observerIterator = observerList.iterator();
        while (observerIterator.hasNext()) {
            Observer tempObserver = observerIterator.next();
            if(tempObserver.equals(observer)) {
                observerIterator.remove();
            }
        }
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //改变了通知所有观察者
        notifyAllObserver();
    }
}
