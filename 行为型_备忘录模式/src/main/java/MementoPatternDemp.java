/**
 * 备忘录模式演示类
 *
 * @Author: zhuzw
 * @Date: 2019/8/28 14:26
 * @Version: 1.0
 */
public class MementoPatternDemp {
    public static void main(String[] args) {
        Orginator orginator = new Orginator();
        CareTaker careTaker = new CareTaker();

        orginator.setState("State：1");
        orginator.setState("State：2");
        Memento memento = orginator.createMemento();
        careTaker.add(memento);
        orginator.setState("State: 3");
        memento = orginator.createMemento();
        careTaker.add(memento);
        orginator.setState("State: 4");

        System.out.println("Current State: " + orginator.getState());
        //读档
        orginator.setMemento(careTaker.get(0));
        System.out.println("first state: " + orginator.getState());
    }
}
