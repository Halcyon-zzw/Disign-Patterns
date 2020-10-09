package fast_food.food;

import fast_food.Item;
import fast_food.Packing;
import fast_food.packing.Wrapper;

/**
 * 汉堡
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
