package fast_food;

import fast_food.Meal;
import fast_food.food.ChickenBurger;
import fast_food.food.Coke;
import fast_food.food.Milk;
import fast_food.food.VegBurger;

public class MealBuilder {

    private Meal meal;


    public MealBuilder() {

    }
    public MealBuilder(Meal meal) {
        this.meal = meal;
    }

    /**
     * 准备素食套餐
     * @return
     */
    public MealBuilder prepareVegMeal() {
        if(null == meal) {
            meal = new Meal();
        }
        meal.addItem(new VegBurger());
        meal.addItem(new Milk());

        return this;
    }

    /**
     * 准备非素食套餐
     * @return
     */
    public MealBuilder prepareNonVegMeal() {
        if(null == meal) {
            meal = new Meal();
        }

        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return this;
    }

    /**
     * 自由搭配食物
     * @param item 食物
     * @return meal
     */
    public MealBuilder perpare(Item item) {
        if(null == meal) {
            meal = new Meal();
        }
        meal.addItem(item);

        return this;
    }


    /**
     * 完成订单
     * @return
     */
    public Meal build() {
        return meal;
    }

    /**
     * 待完善，商品多数量。
     */
}
