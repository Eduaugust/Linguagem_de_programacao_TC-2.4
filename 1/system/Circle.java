import util.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        setRadius(radius);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return super.toString() + "Radius: " + Double.toString(radius);
    }
}