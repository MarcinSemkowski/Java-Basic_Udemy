package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.L_2;

public class Main {

    public static void main(String[] args) {
        BankAccount bobAccount = new BankAccount("12345",
                0.00,
                "Bob Brown",
                "myemail@bob.com",
                "(087)123-4567");
        bobAccount.deposit(100);
        BankAccount timsAcoount = new BankAccount("Tim","Tim@email.com","12345");
        System.out.println();
    }

}
