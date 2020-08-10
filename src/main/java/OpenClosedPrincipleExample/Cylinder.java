package OpenClosedPrincipleExample;

public class Cylinder implements Shape {
    private double height;
    private double radius;
    public double calculateArea() {
        return 2*(22/7)*radius*height + 2*(22/7)*radius*radius;
    }

    public double getHeight() {
        return height;
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

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}
