package decorator;


import shape.Shape;

/**
 * 装饰类
 */
public abstract class ShapeDecorator implements Shape {

    /**
     * 被修饰的图形对象
     */
    protected Shape decoratoredShape;

    public ShapeDecorator(Shape decoratoredShape) {
        this.decoratoredShape = decoratoredShape;
    }

    @Override
    public void drow() {
        decoratoredShape.drow();
        setRedBorder(decoratoredShape);
    }

    protected abstract void setRedBorder(Shape decoratoredShape);
}
