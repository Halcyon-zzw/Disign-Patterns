import observer.BinaryObserver;
import observer.OctalObserver;
import observer.Subject;

/**
 * 观察者演示程序,
 * 该模式定义了对象之间的一对多依赖关系;Subject是一，Object是多
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        new OctalObserver(subject);

        subject.setState(10);

        subject.setState(20);

        //binaryObserver取消订阅
        binaryObserver.unsubscribe();
        subject.setState(30);

    }
}
