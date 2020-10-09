public class Rectangle extends Shape {
    public Rectangle() {
        type = "rectangle";
    }

    @Override
    void drow() {
        System.out.println("drow a rectangle!");
    }
}
