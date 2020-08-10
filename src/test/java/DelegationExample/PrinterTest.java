package DelegationExample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {


    @Test
    public void print() {
        // To the outside world it looks like the printer actually prints.
        Printer printer = new Printer();
        printer.print();
    }
}