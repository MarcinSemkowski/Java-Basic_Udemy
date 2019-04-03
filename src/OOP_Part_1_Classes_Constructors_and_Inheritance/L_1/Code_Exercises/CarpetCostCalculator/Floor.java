package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.Code_Exercises.CarpetCostCalculator;

public class Floor {

private double width;
private double length;


    public Floor(double width, double length) {

        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;

    }

    public double getArea(){
        return width*length;
    }

}
