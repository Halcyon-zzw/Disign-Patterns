import entityInterface.Color;
import entityInterface.Shape;
import factory.AbstractFactory;
import factory.FactoryProducer;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        /**
         * 圆-红色
         */
        //获取形状工厂(大工厂)
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //获取形状circle的对象（小工厂）
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.drow();

        /**
         * 矩形
         */
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.drow();


        //获取颜色的工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        //获取颜色red的对象
        Color red = colorFactory.getColor("RED");
        red.fill();

        Color green = colorFactory.getColor("GREEN");
        green.fill();

    }
}
