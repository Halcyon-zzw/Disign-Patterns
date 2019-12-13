//抽象类或者接口实现java.lang.Cloneable 接口
public abstract class Shape implements Cloneable {

    protected String type;
    private String id;

    abstract void drow();


    //实现 复制现有实例 来生成新实例方法
    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
