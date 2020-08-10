package DependencyInjectionExample;

public class Client {
    private Service myService;
    // injects via a constructor
    public Client(Service service){
        this.myService = service;
    }
    public void DoSomething(){
        myService.write("This is a message");
    }

    public void setService(Service service){
        this.myService = service;
    }

}
