package LiskovSubstitutionPrincipleExample;

import org.junit.Before;

import static org.junit.Assert.*;

public class BusTest {

    @Before
    public void setUp() throws Exception {
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();
        vehicle.getCubicCapacity();
    }
}