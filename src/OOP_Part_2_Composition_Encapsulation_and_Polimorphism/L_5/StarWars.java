package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_5;

public class StarWars extends Movie {

public StarWars(){
   super("StarWars");
}


    @Override
    public String plot() {
        return"Imperial forces try to take over the universe";
    }
}
