package Naming_Conventions_and_Packages_static_and_final_keywords.L_7;

import java.util.ArrayList;

public class Account {
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transations;


    public Account(String accountName) {
        this.accountName = accountName;
        this.transations = new ArrayList<>();
    }

    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        if(amount > 0){
            transations.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now  " + this.balance);
        }else{
            System.out.println("Cannot deposit negative  sums");
        }
    }

    public void withdraw(int amount){
        int  withdraw = -amount;
        if(withdraw < 0){
            this.transations.add(withdraw);
            this.balance += withdraw;
            System.out.println(amount + " withdraw.Balance is now ");
        }
    }
}
