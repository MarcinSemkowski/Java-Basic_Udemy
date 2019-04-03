package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.L_3;

public class VipCusstomer {

    private  String name;
    private double creditLimit;
    private String email;

    public VipCusstomer(){
      this("Default name",50000.00,"unkown@email.com");
    }

    public VipCusstomer(String name, double creditLimit) {
        this(name,creditLimit,"example@email.com");

    }

    public VipCusstomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}