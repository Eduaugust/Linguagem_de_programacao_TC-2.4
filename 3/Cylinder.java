public class Cylinder extends Shape {

    public double radius;
    public double height;

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Cylinder(double height, double radius) {
        super();
        setShapeName("Cylinder");
        setHeight(height);
        setRadius(radius);
    }

    @Override
    public double area() {
        return 2 * Math.PI * Math.pow(getRadius(), 2) + 2 * Math.PI * getRadius() * getHeight();
    }

    public String toString() {
        return super.toString()  + "Altura: " + Double.toString(getHeight()) + "\nRaio: " + Double.toString(getRadius()) + "\n" ;
    }
}