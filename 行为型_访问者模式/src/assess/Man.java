package assess;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 16:09
 * @Version: 1.0
 */
public class Man extends Person {

    public Man(String type) {
        super(type);
    }

    @Override
    public void accept(Assess assess) {
        assess.getRestult(this);
    }
}
