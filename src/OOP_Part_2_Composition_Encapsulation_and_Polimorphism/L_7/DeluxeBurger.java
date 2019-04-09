package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_7;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Delux","White", "Sausage & Bacon", 14.54);
        super.addHamburegerAddition1("Chips",2.75);
        super.addHamburegerAddition2("Drink",1.81);
    }

    @Override
    public void addHamburegerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to the burger");
    }

    @Override
    public void addHamburegerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to the burger");

    }

    @Override
    public void addHamburegerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to the burger");

    }

    @Override
    public void addHamburegerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to the burger");

    }
}
