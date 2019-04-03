package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.Code_Exercises.CarpetCostCalculator;

public class Calculator {

private Carpet carpet;
private Floor floor;


    public Calculator(Carpet carpet, Floor floor) {
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost(){
        return carpet.getCost() * floor.getArea();
    }
}
