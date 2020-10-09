package entityInterface.entityImpl;

import entityInterface.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("填充蓝色");
    }
}
