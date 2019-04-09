package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_6;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return  getClass().getSimpleName() + "-> startEngine";
    }

    @Override
    public String accelerate() {
        return  getClass().getSimpleName() + "-> accelerate";
    }

    @Override
    public String brake() {
        return  getClass().getSimpleName() + "-> brake";
    }
}
