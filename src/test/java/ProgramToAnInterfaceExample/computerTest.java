package ProgramToAnInterfaceExample;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class computerTest {

    computer cm = new computer();
    displayModule dm = new monitor();
    displayModule dm1 = new projector();

    @Test
    public void display() {
        dm.display();
        dm1.display();
    }
}
