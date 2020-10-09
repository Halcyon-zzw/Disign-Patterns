import entityInterface.Shape;
import factory.ShapeFactory;

/**
 * 测试实现
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.drow();

        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.drow();

        Shape square = ShapeFactory.getShape("square");
        square.drow();
    }

}
