package fast_food.food.drink;

import fast_food.food.drink.Drink;

public class Milk extends Drink {
    @Override
    public String name() {
        return "milk";
    }

    @Override
    public float price() {
        return 6f;
    }
}
