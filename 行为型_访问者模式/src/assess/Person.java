package assess;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 16:08
 * @Version: 1.0
 */
public abstract class Person {
    private String type;

    public Person(String type) {
        this.type = type;
    }

    public abstract void accept(Assess assess);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
