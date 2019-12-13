package factory;

import entityInterface.Shape;
import entityInterface.entityImpl.Circle;
import entityInterface.entityImpl.Rectangle;
import entityInterface.entityImpl.Square;

/**
 * 图形工厂类
 */
public class ShapeFactory {
//    public Shape getShape();
    public static Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
