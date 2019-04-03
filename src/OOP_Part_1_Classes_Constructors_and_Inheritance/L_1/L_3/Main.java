package OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.L_3;

import OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.L_1.Car;
import OOP_Part_1_Classes_Constructors_and_Inheritance.L_1.L_2.BankAccount;

public class Main {


        public static void main(String[] args) {
            VipCusstomer person1 = new VipCusstomer();
            System.out.println(person1.getName());

            VipCusstomer person2 = new VipCusstomer("Bob",25000.00);
            System.out.println(person2.getName());

            VipCusstomer person3 = new VipCusstomer("Bob",25000.00);
            System.out.println(person3.getName());
            System.out.println(person3.getEmail());
        }

        }
