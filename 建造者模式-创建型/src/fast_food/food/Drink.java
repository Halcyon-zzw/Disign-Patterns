package fast_food.food;

import fast_food.packing.Bottle;
import fast_food.Item;
import fast_food.Packing;

/**
 * 冷饮
 */
public abstract class Drink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
