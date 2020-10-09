/**
 * 享元模式演示类
 *
 * 享元模式：尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象
 */
public class FlyweightPatternDemo {

    private static String[] colors = {
            "Red", "Yello", "Green", "Blue", "White", "Black"
    };

    public static void main(String[] args) {

        int createTime = 20;
        for (int i = 0; i < createTime; i++) {
            Circle circle = (Circle) ShapeFactory.getShape(getRandColor());
            circle.drow();
        }
    }

    public static String getRandColor() {
        int randNum = (int)(Math.random() * colors.length);
        return colors[randNum];
    }
}
