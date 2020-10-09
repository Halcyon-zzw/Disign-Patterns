package entityInterface.entityImpl;

import entityInterface.Shape;

public class Rectangle implements Shape {
    @Override
    public void drow() {
        System.out.println("画矩形");
    }
}
