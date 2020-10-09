package factory;

import entityInterface.Color;
import entityInterface.Shape;
import entityInterface.entityImpl.Blue;
import entityInterface.entityImpl.Green;
import entityInterface.entityImpl.Red;

public class ColorFacroty extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
