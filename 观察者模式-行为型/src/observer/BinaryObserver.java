package observer;

/**
 * 二进制观察者
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        //订阅
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("update->Binary String : " + Integer.toBinaryString(subject.getState()));
    }

    @Override
    public void unsubscribe() {
        subject.unsubscribe(this);
    }
}
