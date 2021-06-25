import java.util.HashMap;
import java.util.Map;

/**
 * 单例注册表实现单例
 *
 * @Author: zhuzw
 * @Date: 2021-05-25 9:15
 * @Version: 1.0
 */
public class SingletonByReg {
    private static Map registry = new HashMap<>();
    static {
        SingletonByReg sr = new SingletonByReg();
        registry.put(sr.getClass().getName(), sr);
    }

    protected SingletonByReg() {

    }

    public static SingletonByReg getInstance(String className) {
        if (className == null) {
            className = "SingletonByReg";
        }
        if (registry.get(className) == null) {
            try {
                registry.put(className, Class.forName(className).newInstance());
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        return (SingletonByReg) registry.get(className);
    }

    public static void main(String[] args) {
        SingletonByReg instance1 = SingletonByReg.getInstance(null);
        SingletonByReg instance2 = SingletonByReg.getInstance(null);
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
