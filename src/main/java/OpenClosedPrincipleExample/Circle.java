package OpenClosedPrincipleExample;

import org.w3c.dom.ls.LSOutput;

public class Circle implements Shape {
    private double radius;

    public double calculateArea() {
        return (22/7)*radius*radius;
    }
    
}
