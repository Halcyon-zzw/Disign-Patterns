import java.util.HashMap;

/**
 * 图形工厂类
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getShape(String color) {

        Circle circle = (Circle) circleMap.get(color);
        if(null == circle) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("=>create a new circle, color " + color);
        }
        return  circle;
    }
}
