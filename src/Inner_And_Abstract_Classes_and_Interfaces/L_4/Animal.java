package Inner_And_Abstract_Classes_and_Interfaces.L_4;

public abstract class Animal {
private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }

}
