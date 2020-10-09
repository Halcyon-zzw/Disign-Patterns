package assess;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 16:14
 * @Version: 1.0
 */
public class Woman extends Person {

    public Woman(String type) {
        super(type);
    }

    @Override
    public void accept(Assess assess) {
        assess.getRestult(this);
    }
}
