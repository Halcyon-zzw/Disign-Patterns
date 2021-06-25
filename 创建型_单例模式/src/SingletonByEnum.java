/**
 * 枚举类是如何限制实例个数的？
 *  - 成员变量个数只有一个
 * 枚举单例在创建时是否有并发问题？
 *  - 静态成员变量，类加载时完成
 * 枚举单例能否被反射破坏单例？
 *  - 不能
 * 枚举单例能否被反序列化破坏单例？
 *  - 不能,内部已经避免
 *
 * 优点：
 *  - 不会被反射破坏单例
 *  - 不会被反序列化破坏单例
 *
 *
 * @Author: zhuzw
 * @Date: 2020-11-23 12:21
 * @Version: 1.0
 */
public enum SingletonByEnum {
    INSTANCE;

    public void sayHello(String name) {
        System.out.println("hello " + name);
    }


    public static void main(String[] args) {
        SingletonByEnum.INSTANCE.sayHello("zhuzw");
    }
}
