package fast_food.food.drink;

import fast_food.food.drink.Drink;

/**
 * 可口可乐
 */
public class Coke extends Drink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 3f;
    }
}
