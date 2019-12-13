package observer;


/**
 * 八进制观察者
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("update->Octal String :" + Integer.toOctalString(subject.getState()));
    }

    @Override
    public void unsubscribe() {
        subject.unsubscribe(this);
    }
}
