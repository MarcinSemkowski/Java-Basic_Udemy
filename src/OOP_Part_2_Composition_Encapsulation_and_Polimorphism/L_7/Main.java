package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_7;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","white","Sausage",3.56);
        double price = hamburger.itemizeHamburger();
         hamburger.addHamburegerAddition1("Tomato",0.27);
         hamburger.addHamburegerAddition2("Lettuce",0.75);
         hamburger.addHamburegerAddition3("Cheese",1.13);
        System.out.println("Total hamburger price is " + hamburger.itemizeHamburger());

       HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
       healthyBurger.addHamburegerAddition1("Egg",5.43);
       healthyBurger.addHealtyAddition1("Lentils",3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();



    }


}
