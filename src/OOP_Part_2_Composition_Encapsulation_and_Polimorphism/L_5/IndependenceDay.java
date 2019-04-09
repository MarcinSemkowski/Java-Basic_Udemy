package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_5;

public class IndependenceDay extends Movie {

    public IndependenceDay(){
       super("Independence day");
    }


    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}
