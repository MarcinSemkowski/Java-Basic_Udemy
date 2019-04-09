package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_1;

public class Car extends Vehicle {

private int doors;

private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
