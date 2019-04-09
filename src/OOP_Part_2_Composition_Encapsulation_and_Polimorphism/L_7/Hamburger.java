package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_7;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String additional_1_Name;
    private double additional_1_Price;

    private String additional_2_Name;
    private double additional_2_Price;

    private String additional_3_Name;
    private double additional_3_Price;

    private String additional_4_Name;
    private double additional_4_Price;


    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;

    }

    public void addHamburegerAddition1(String name, double price){
        this.additional_1_Name = name;
        this.additional_1_Price = price;
    }

    public void addHamburegerAddition2(String name,double price){
        this.additional_2_Name = name;
        this.additional_2_Price = price;
    }

    public void addHamburegerAddition3(String name,double price){
        this.additional_3_Name = name;
        this.additional_3_Price = price;
    }

    public void addHamburegerAddition4(String name,double price){
        this.additional_4_Name = name;
        this.additional_4_Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger" + " on a "+ this.breadRollType + " roll " + "and meat "
                + this.meat + "price is " + this.price);
        if(additional_1_Name != null){
           hamburgerPrice += additional_1_Price;
            System.out.println("Added " + this.additional_1_Name + "for a extra " + this.additional_1_Price);
        }
        if(additional_2_Name != null){
           hamburgerPrice += additional_2_Price;
            System.out.println("Added " + this.additional_2_Name + "fo a extra " + this.additional_2_Price);
        }
         if(additional_3_Name != null){
            hamburgerPrice += additional_3_Price;
            System.out.println("Added " + this.additional_3_Name + "fo a extra " + this.additional_3_Price);
        }
          if(additional_4_Name != null){
            hamburgerPrice += additional_4_Price;
            System.out.println("Added " + this.additional_4_Name + "fo a extra " + this.additional_4_Price);
        }
          return hamburgerPrice;
    }










}




