package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.Code_Exercises.CarpetCostCalculator;

public class Carpet {

private double cost;


    public Carpet(double cost) {
        this.cost = (cost <0)? 0 : cost;
    }

    public double getCost() {
        return cost;
    }

}
