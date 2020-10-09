package entityInterface.entityImpl;

import entityInterface.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("填充绿色");
    }
}
