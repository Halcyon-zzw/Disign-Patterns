package fast_food.food.drink;

import fast_food.food.Item;
import fast_food.packing.Bottle;
import fast_food.packing.Packing;

/**
 * 冷饮
 */
public abstract class Drink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
