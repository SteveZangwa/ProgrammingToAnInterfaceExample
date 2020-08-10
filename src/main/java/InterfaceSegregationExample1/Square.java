package InterfaceSegregationExample1;

public class Square implements ShapeInterface,ManageShapeInterface {

        public double area() {
        return 2.0;
    }
    public double calculate() {
        return 4.0;
    }
}
