package InterfaceSegregationExample1;

public class Cube implements ShapeInterface,SolidShapeInterface,ManageShapeInterface {

    public double area() {
        return 1.0;
    }

    public double volume() {
        return 0.4;
    }
    public double calculate() {
        return this.area() + this.volume();
    }
}
