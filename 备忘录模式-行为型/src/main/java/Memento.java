import lombok.Data;

/**
 * 用来保存Originator对象的状态
 * 由Orginator创建，用来保存Orginator的内部状态（只负责保存状态）
 *
 * @Author: zhuzw
 * @Date: 2019/8/26 20:07
 * @Version: 1.0
 */
@Data
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

}
