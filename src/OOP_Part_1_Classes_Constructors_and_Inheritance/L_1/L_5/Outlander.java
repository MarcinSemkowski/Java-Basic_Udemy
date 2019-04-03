package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.L_5;

public class Outlander extends  Car {

private int roadServiceMonths;


    public Outlander( int roadServiceMonths){
        super("OutLander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void  accelerate(int rate){
       int newVelocity = getCurrentVelocity() + rate;
       if(newVelocity==0){
           stop();
           changeGear(1);
       }
       else if(newVelocity>0 && newVelocity <= 10){
         changeGear(1);
       }
       else if(newVelocity > 10 && newVelocity <=20){
           changeGear(2);
       }
       else if(newVelocity > 20 && newVelocity <=30){
           changeGear(3);
       }
       else{
           changeGear(4);
       }

       if(newVelocity > 0 ){
         changeVelocity(newVelocity,getCurrentDirection());
       }
    }
}
