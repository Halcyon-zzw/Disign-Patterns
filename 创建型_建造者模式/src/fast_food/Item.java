package fast_food;

public interface Item {

    /**
     * 商品名
     * @return
     */
    public String name();

    /**
     * 包装
     * @return 包装类
     */
    public Packing packing();

    public float price();
}
