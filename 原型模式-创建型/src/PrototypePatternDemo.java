/**
 * 原型模式-创建型 演示
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cacheShape =  ShapeCache.getShape("1");
        System.out.println("shape: " + cacheShape.getType());

        cacheShape =  ShapeCache.getShape("2");
        System.out.println("shape: " + cacheShape.getType());

        cacheShape =  ShapeCache.getShape("3");
        System.out.println("shape: " + cacheShape.getType());
    }
}
