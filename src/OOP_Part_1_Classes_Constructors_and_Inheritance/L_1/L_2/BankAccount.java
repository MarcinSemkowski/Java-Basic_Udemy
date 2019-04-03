package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.L_2;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private  String customerPhoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }


    public BankAccount(String customerName,String customerEmail,String customerPhoneNumber){
       this("454545",100.55,customerName,customerEmail,customerPhoneNumber);

    }
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void withdrawal(double withdrawalAmount){
       if(balance - withdrawalAmount <= 0)
           System.out.println("Only " + this.balance+ "available.Withdraw not processed");
       else {
           this.balance -= withdrawalAmount;
           System.out.println("Withdraw of " + withdrawalAmount + "processed Remaining balance = " + balance );
       }
    }
    public void deposit(double depositAmount){
      this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "made. New Balance is "+ this.balance);
    }

}
