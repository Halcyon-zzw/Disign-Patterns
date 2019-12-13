package entityInterface.entityImpl;

import entityInterface.Shape;

public class Circle implements Shape {
    @Override
    public void drow() {
        System.out.println("画圆");
    }
}