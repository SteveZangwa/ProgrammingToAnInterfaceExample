package LiskovSubstitutionPrincipleExample;

public class Bus extends Vehicle {
    int getSpeed() {
        return 0;
    }

    int getCubicCapacity() {
        return 0;
    }
    String getEmergencyExit(){
        return null;
    }
}
