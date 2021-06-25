import java.io.Serializable;

/**
 * @author zhuzw
 * @version 1.0
 * @description
 *
 * 1、为什么用final修饰？
 *      - 防止子类中修改父类方法从而破坏单例
 *
 * 2、实现了序列化接口，怎样防止反序列化破坏单例？
 *      - read
 *
 *
 * 4、为什么提供静态方法，而不是将INSTANCE设置为public？
 *      - 用方法提供更好的封装性；
 *      - 可以支持后续对懒惰单例方式的实现；
 *      - 对泛型的支持
 *
 * @createDate 2020/11/23 18:52
 */
public final class SingletonByStatic implements Serializable {
    private static SingletonByStatic instance = new SingletonByStatic();
    //
    private SingletonByStatic() {
    }

    public static SingletonByStatic getInstance() {
        return instance;
    }


    /**
     * 防止反序列化破坏单例
     * 当readResovle返回了实例对象后，则使用该结果作为反序列化的结果。而不会使用字节码返回的对象
     *
     * @return
     */
    public Object readResolve() {
        return instance;
    }
}

