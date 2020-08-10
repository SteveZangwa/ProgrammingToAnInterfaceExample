package LiskovSubstitutionPrincipleExample;

public class Car extends Vehicle {

    int getSpeed() {
        return 0;
    }

    int getCubicCapacity() {
        return 0;
    }
    Boolean sHatchBack(){
        return false;
    }
}
