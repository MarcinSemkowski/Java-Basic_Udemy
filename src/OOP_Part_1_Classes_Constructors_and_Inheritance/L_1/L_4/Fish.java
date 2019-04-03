package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.L_4;

public class Fish extends Animal {

private int gills;
private int eyes;
private int fins;


    public Fish(String name, int size, int weight,int gills,int eyes,int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    public void  moveMuscles(){

    }

    public void moveBackFin(){

    }

    private void swim(int speed){
       moveMuscles();
       moveBackFin();
       super.move(speed);


    }
}
