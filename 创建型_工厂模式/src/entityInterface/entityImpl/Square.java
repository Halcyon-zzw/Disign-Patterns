package entityInterface.entityImpl;

import entityInterface.Shape;

public class Square implements Shape {
    @Override
    public void drow() {
        System.out.println("画正方形");
    }
}
