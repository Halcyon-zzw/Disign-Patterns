package fast_food.food.burger;

import fast_food.food.Item;
import fast_food.packing.Packing;
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
