package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.Code_Exercises.WallArea;

public class Wall {

    private double height;
    private double width;

    public Wall(){

    }

    public Wall(double width, double height) {
        this.width = (width < 0 )
                ? 0
                : width;
        this.height = (height < 0 )
                ? 0
                : height;

    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        this.width = (width < 0 )
                ? 0
                : width;
    }

    public void setHeight(double height) {
        this.height = (height < 0 )
                ? 0
                : height;
    }

    public double getArea(){
        return this.width * this.height;
    }
}
