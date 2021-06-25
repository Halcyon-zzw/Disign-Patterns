//抽象类或者接口实现java.lang.Cloneable 接口
public abstract class Shape implements Cloneable {

    protected String type;
    private String id;

    abstract void drow();


    //实现 复制现有实例 来生成新实例方法
    @Override
    public Shape clone() {
        Shape object = null;
        try {
            object = (Shape) super.clone();
            //如果存在复杂类型（对象），需要分别克隆
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
