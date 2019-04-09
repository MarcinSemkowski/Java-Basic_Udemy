package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_7;

public class HealthyBurger extends Hamburger {

private String helthyExtra1Name;
private double healthyExtra1Price;

private String healthyExtra2Name;
private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy", "Brown rye", meat, price);
    }

    public void addHealtyAddition1(String name,double price){
      this.helthyExtra1Name = name;
      this.healthyExtra1Price = price;
    }

    public void addHealtyAddition2(String name,double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.helthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.helthyExtra1Name + "for a extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + "for a extra " + this.healthyExtra2Price);
        }
     return hamburgerPrice;
    }
}
