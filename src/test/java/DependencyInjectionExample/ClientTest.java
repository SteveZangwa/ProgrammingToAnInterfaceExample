package DependencyInjectionExample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void setUp() throws Exception {
        Service service = new ServiceA();// the injector
        Client client = new Client(service);// injects via the constructor
        client.DoSomething();
        client.setService(service);
        client.DoSomething();
    }
}