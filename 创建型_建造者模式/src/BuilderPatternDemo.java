import fast_food.Meal;
import fast_food.MealBuilder;
import fast_food.food.burger.ChickenBurger;
import fast_food.food.drink.Milk;
import fast_food.food.burger.VegBurger;

/**
 * 建造者模式（生成器）演示类
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        fastFood();
    }

    public static void fastFood() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal().build();
        vegMeal.showItems();
        System.out.println("==>toal cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal().build();
        nonVegMeal.showItems();
        System.out.println("==>toal cost: " + nonVegMeal.getCost());

        Meal personalityMeal = mealBuilder
                .prepareVegMeal()
                .perpare(new ChickenBurger())
                .perpare(new VegBurger())
                .perpare(new Milk())
                .build();
        personalityMeal.showItems();
        System.out.println("==>toal cost: " + personalityMeal.getCost());

    }
}
