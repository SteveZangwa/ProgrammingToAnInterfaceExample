package OpenClosedPrincipleExample;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public double calculateArea() {
        return length*width;
    }
}
