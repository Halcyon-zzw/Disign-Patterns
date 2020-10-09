import java.util.ArrayList;
import java.util.List;

/**
 * 操作管理
 * 负责保存/恢复Originator对象的状态
 *
 * @Author: zhuzw
 * @Date: 2019/8/26 20:10
 * @Version: 1.0
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    /**
     * 存档
     * @param memento
     */
    public void add(Memento memento) {
        mementoList.add(memento);
    }

    /**
     * 读档
     * 通过保存的memento恢复Originator对象的状态
     *
     * @param index 需要读取的位置
     * @return 记录对象
     */
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
