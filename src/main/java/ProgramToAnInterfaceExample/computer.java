package ProgramToAnInterfaceExample;

public class computer {
    displayModule dm;

    public void setDm(displayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }


}
