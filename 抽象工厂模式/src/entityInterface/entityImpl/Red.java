package entityInterface.entityImpl;

import entityInterface.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("填充红色");
    }
}
