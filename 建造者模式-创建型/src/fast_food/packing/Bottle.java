package fast_food.packing;

import fast_food.Packing;

/**
 * 瓶子
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
