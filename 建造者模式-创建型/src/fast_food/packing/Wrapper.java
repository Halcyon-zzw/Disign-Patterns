package fast_food.packing;

import fast_food.Packing;

/**
 * 包装纸
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
