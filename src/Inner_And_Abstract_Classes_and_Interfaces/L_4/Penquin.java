package Inner_And_Abstract_Classes_and_Interfaces.L_4;

public class Penquin extends Bird {
    public Penquin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at that, can i go for a  swim instead ?");
    }
}
