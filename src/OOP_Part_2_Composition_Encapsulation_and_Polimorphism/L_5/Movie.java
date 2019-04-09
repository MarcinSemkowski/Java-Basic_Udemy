package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_5;

public class Movie {

private String name;

    public Movie(String name) {
        this.name = name;
    }


    public String plot(){
        return"Not plot here ";
    }

    public String getName() {
        return name;
    }
}
