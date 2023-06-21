import util.Shape;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public double getPerimeter() {
        return 2 * getHeight() + 2 * getWidth();
    }

    @Override
    public String toString() {
        return super.toString() + "Widht: " + Double.toString(width) + "\nHeight: " + Double.toString(height);
    }
}