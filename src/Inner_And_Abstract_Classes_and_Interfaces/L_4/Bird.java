package Inner_And_Abstract_Classes_and_Interfaces.L_4;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in,Breathe out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() + "is flapping its wing ");
    }
}
