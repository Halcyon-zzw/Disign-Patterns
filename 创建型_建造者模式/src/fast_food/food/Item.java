package fast_food.food;

import fast_food.packing.Packing;

public interface Item {

    /**
     * 商品名
     * @return
     */
    String name();

    /**
     * 包装
     * @return 包装类
     */
    Packing packing();

    float price();
}
