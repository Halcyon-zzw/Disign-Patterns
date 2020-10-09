import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * 图形工厂类
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

//    public static Shape getShape(String color) {
//
//        Circle circle = (Circle) circleMap.get(color);
//        if(null == circle) {
//            circle = new Circle(color);
//            circleMap.put(color, circle);
//            System.out.println("=>create a new circle, color " + color);
//        }
//        return  circle;
//    }
    public static Shape getShape(String color){
        return ModelFactory.get(color, Circle.class);
    }
}

class ModelFactory {
    private static final HashMap map = new HashMap<>();

    public static <K, T>  T get(K k, Class<T> tClass) {

        T value = (T) map.get(k);
        if(null == value) {
            Constructor constructor = null;
            try {
                constructor = tClass.getConstructor(k.getClass());
                value = (T) constructor.newInstance(k);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            map.put(k, value);
            System.out.println("=>create a new "+ tClass.getName() + ": " + k);
        }
        return  value;
    }
}