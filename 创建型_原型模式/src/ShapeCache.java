import java.util.HashMap;

public class ShapeCache {
    //维护一个缓存表
    private static HashMap<String, Shape> shapeHashMap = new HashMap<>();

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeHashMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeHashMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeHashMap.put(square.getId(), square);
    }

    /**
     * 提供获取新实例的方法
     * @param id 实例编号
     * @return 新的实例
     */
    public static Shape getShape(String id) {

        //找到正确原型
        Shape shape = shapeHashMap.get(id);
        //委托复制实例的方法生成新实例
        return (Shape) shape.clone();
    }
}
