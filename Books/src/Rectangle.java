public class Rectangle extends Shape {
    private final double width;
    private final double height;

    private String name;

    public Rectangle(double width, double height, String name){
        this.width = width;
        this.height = height;
        this.name = name;

    }
    @Override
    public String name() {
        return name;
    }
    @Override
    public double area() {
        return width * height;
    }
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
