package fast_food;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> itemList = new ArrayList<>();

    /**
     * 添加商品
     * @param item 商品
     */
    public void addItem(Item item) {
        itemList.add(item);
    }

    /**
     * 计算消费
     * @return 消费总额
     */
    public float getCost() {
        float costToal = 0;
        for (Item item : itemList) {
            costToal += item.price();
        }
        return costToal;
    }
    
    public void showItems() {
        for (Item item : itemList) {
            System.out.print("Item: " + item.name());
            System.out.print("\tPacking: " + item.packing().pack());
            System.out.println("\tPrice: " + item.price());
        }
    }
}
