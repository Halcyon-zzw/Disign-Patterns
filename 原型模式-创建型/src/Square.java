/**
 * 正方形
 */
public class Square extends Shape {
    public Square() {
        type = "square";
    }

    @Override
    void drow() {
        System.out.println("drow a square!");
    }
}
