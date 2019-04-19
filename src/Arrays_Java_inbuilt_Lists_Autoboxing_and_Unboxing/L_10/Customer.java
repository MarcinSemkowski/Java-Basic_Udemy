package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing.L_10;

import java.util.ArrayList;

public class Customer {

private String name;
private ArrayList<Double> transations;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transations = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void  addTransaction(double amount){
        this.transations.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransations() {
        return transations;
    }
}
