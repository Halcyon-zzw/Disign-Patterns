package factory;

import entityInterface.Color;
import entityInterface.Shape;
import entityInterface.entityImpl.Circle;
import entityInterface.entityImpl.Rectangle;
import entityInterface.entityImpl.Square;

public class ShapeFactory extends AbstractFactory{
//    public Shape getShape();
    @Override
    public Shape getShape(String shapeType){
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

    @Override
    public Color getColor(String color) {
        return null;
    }

}
