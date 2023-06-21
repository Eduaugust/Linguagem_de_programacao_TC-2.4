public class Sphere extends Shape {
    private double radius;

    public Sphere(String color, boolean filled, double radius) {
        super();
        setRadius(radius);
        setShapeName("Sphere");
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return super.toString() + "Radius: " + Double.toString(radius) + "\n";
    }
}