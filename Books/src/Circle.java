public class Circle extends Shape implements Colour{
    private final double radius;
    private final String name;

    private String colour;

    public Circle(double radius, String name, String colour){
        this.radius = radius;
        this.name = name;
        this.colour = colour;

    }
    @Override
    public String name() {
        return name;
    }
    @Override
    public double area() {
       return Math.PI * (radius * radius);
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI;
    }

    @Override
    public String getColor() {
        return colour;
    }

    @Override
    public void setColor(String newColour) {

        this.colour = newColour;

    }
}
