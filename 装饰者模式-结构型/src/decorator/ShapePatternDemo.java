package decorator;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;

/**
 * 装饰模式演示类
 */
public class ShapePatternDemo {


    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        Shape redCircle1 = new RedShapeDecorator(new Circle());
        Shape redRectangle1 = new RedShapeDecorator(new Rectangle());

        circle.drow();
        System.out.println();

        redCircle.drow();
        System.out.println();

        redRectangle.drow();
        System.out.println();

        redCircle1.drow();
        System.out.println();

        redRectangle.drow();
        System.out.println();
    }

}
