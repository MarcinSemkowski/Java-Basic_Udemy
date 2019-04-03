package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.Code_Exercises.Point;

public class Point {

private int x;
private int y;

 public Point(){

 }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
     return Math.sqrt((x -0.0 ) * (x - 0.0) +(y - 0)*(y -0));
    }

    public double distance(int x,int y){
        return Math.sqrt((this.x - x  ) * (this.x - x) +(this.y - y)*(this.y - y));
    }
    public double distance(Point point){
        return Math.sqrt((this.x - point.getX()  ) * (this.x - point.getX()) +
                (this.y - point.getY())*(this.y - point.getY()));
    }

}
