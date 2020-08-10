package OpenClosedPrincipleExample;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

public class CylinderTest {

    Cylinder cylinder = new Cylinder();


    @Test
    public void getHeight() {
        cylinder.getHeight();
    }

    @Test
    public void setHeight() {
        cylinder.setHeight(12.2);
    }

    @Test
    public void getRadius() {
        cylinder.setRadius(2.3);
    }

    @Test
    public void setRadius() {
        cylinder.getRadius();
    }

    public void DisplayCylinder() {
        cylinder.calculateArea();
        System.out.println(cylinder.getHeight());
    }


}