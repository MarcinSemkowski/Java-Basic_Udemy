package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.Code_Exercises.CarpetCostCalculator;

public class Main {

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);
        Calculator calculator = new Calculator(carpet,floor);
        System.out.println("Total = "+ calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4,4.5);
        calculator = new Calculator(carpet,floor);
        System.out.println("Total = "+ calculator.getTotalCost());
    }


}
