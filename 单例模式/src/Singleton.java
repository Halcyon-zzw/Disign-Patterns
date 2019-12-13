/**
 *
 * @description 不建议使用方式一、二（懒汉式）
 *              建议使用方式三，饿汉式
 *              只要明确实现lazy loading效果时，才使用方式五（登记方式）
 *              如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式
 *              如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式
 *
 * @author zhuzw
 * @createDate 2019/1/26 14:31
 * @version 1.0
 */
public class Singleton {
    private static Singleton instance;


    private Singleton() {}

    /**
     * 实现一：懒汉式-线程不安全
     *
     * 是否 Lazy 初始化：是
     * 是否多线程安全：否
     * 实现难度：易
     *
     * 缺点：多线程不能正常工作
     * @return 实例对象
     */
    public static Singleton getInstance_1() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 实现二：懒汉式，线程安全
     *
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * 实现难度：易
     *
     * 优点：线程安全
     * 缺点：必须加锁才能实现单例。但加锁影响效率
     *
     * 拓展：如果synchronized加在static方法上，锁的是class类
     *      如果锁的是非static方法，锁的是堆内存中的对象
     * @return 实例对象
     */
    public static synchronized Singleton getInstance_2() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 实现三：饿汉式
     *
     * 是否 Lazy 初始化：否
     * 是否多线程安全：是
     * 实现难度：易
     *
     * 优点：没有加锁，执行效率会提高
     * 缺点：类加载时就初始化，浪费内存
     *
     * 基于 classloader 机制避免了多线程的同步问题
     * @return 实例对象
     */
    //方式三：饿汉式
    //        private static Singleton instance = new Singleton();
    public static Singleton getInstance_3() {
        //上面定义instace处：

        return instance;
    }

    /**
     * 实现四：双检锁/双重校验锁（DCL，double-check locking）
     *
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * 实现难度：较复杂
     *
     * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能
     * @return 实例对象
     */
    static class Singleton4{
        private volatile static Singleton4 instance;
        private Singleton4(){}

        public static Singleton4 getInstance() {
            if(instance == null) {
                //上锁
                synchronized (Singleton4.class) {
                    if (instance == null) {
                        instance = new Singleton4();
                    }
                }
            }
            return instance;
        }
    }

    /**
     * 实现五：登记式/静态内部类
     *
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * 实现难度：一搬
     *
     * 描述：与双校验锁功效一样，且实现更简单。对静态域使用延迟初始化
     *      但只使用与静态域的情况，双校验锁可以在实例域需要延迟初始化时使用。
     *      同样使用classloader机制保证初始化时只有一个线程，但跟实现3不同的是，
     *      方式3在类加载时初始化，而这种方法，类加载时instance不一定初始化，
     *      因为SingletonHolder没有被主动使用，只有通过显示调用getInstance()才会转载类，从而实例化。
     *
     * 缺点：多线程不能正常工作
     * @return 实例对象
     */
    public static Singleton getInstance_5() {


//        public class Singleton{
//            private static class SingletonHolder {
//                private static final Singleton INSTANCE = new Singleton();
//            }
//
//            private Singleton(){}
//
//            public static final Singleton getInstance() {
//                //调用静态类
//                return SingletonHolder.INSTANCE;
//            }
//        }



        return null;
    }



    public void sayHello() {
        System.out.println("hello word!");
    }
}
