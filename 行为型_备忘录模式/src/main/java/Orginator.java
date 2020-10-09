import lombok.Data;

/**
 * 需要保存的对象（原生者）
 *
 * @Author: zhuzw
 * @Date: 2019/8/26 20:04
 * @Version: 1.0
 */
@Data
public class Orginator {
    private String state;

    /**
     * 创建备份
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复备份
     */
    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }
}
