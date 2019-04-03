package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.Code_Exercises.PoolArea;

public class Cuboid extends  Rectangle {

private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea() * height;
    }

}
