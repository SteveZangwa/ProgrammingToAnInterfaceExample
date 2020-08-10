package DelegationExample;

public class Printer {
// the delegator
    RealPrinter p = new RealPrinter();
    void print(){
        p.print();// delegation

    }
}
