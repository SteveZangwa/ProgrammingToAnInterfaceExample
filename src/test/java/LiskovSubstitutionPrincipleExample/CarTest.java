package LiskovSubstitutionPrincipleExample;

import org.junit.Before;

import static org.junit.Assert.*;

public class CarTest {

    @Before
    public void setUp() throws Exception {
        Vehicle vehicle = new Car();
        vehicle.getSpeed();
        vehicle.getCubicCapacity();
    }
}