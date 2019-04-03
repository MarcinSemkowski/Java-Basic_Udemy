package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.Code_Exercises.Cylinder;

public class Circle {

private double radius;

    public Circle(double radius) {
        this.radius = (radius <0 )? 0 :radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return  radius * radius *Math.PI;
    }
}
