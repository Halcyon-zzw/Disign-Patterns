package assess;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构体，用于结合
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 16:17
 * @Version: 1.0
 */
public class ObjectStructure {
    private List<Person> personList = new ArrayList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    /**
     * 移除
     * @param person
     */
    public void detach(Person person) {
        personList.remove(person);
    }

    /**
     * 展示，该类评价为一样
     * @param assess
     */
    public void display(Assess assess) {
        for (Person person : personList) {
            person.accept(assess);
        }
    }

}
