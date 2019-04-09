package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_3;

public class Player {
public   String name;
public int health;
public String weapon;


public void loseHealth(int damage){
   this.health -= damage;
   if(this.health <=0){
       System.out.println("Player knocked out");
       //Reduce number of lives remaining for the player
   }
}

public int healthRemaning(){
    return  this.health;
}


}
