package decorator;

import shape.Shape;

/**
 * 具体装饰的类
 * 红色图形装饰类
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratoredShape) {
        super(decoratoredShape);
    }

//    @Override
//    public void drow() {
//        decoratoredShape.drow();
//        setRedBorder(decoratoredShape);
//    }

    @Override
    public void setRedBorder(Shape decoratoredShape) {
        System.out.println("border color: red");
    }
}
