package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.Code_Exercises.Cylinder;

public class Cylinder extends Circle {


private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height <0)? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
       return  getArea() * height;
    }
}
