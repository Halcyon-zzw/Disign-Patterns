public class Circle implements Shape{

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void drow() {
        System.out.println("Drow Circle, color: " + color);
    }
}
