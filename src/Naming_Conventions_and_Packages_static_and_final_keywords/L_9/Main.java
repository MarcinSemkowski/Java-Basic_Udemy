package Naming_Conventions_and_Packages_static_and_final_keywords.L_9;

import Naming_Conventions_and_Packages_static_and_final_keywords.L_10.ExtendedPassword;
import Naming_Conventions_and_Packages_static_and_final_keywords.L_10.SIBTest;

public class Main {
    public static void main(String[] args) {
      SomeClass one = new SomeClass("one");
      SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        int pw = 674312;

        Password password = new ExtendedPassword(pw);
        password.storePassword();

        System.out.println("Main method called ");
        SIBTest test = new SIBTest();
         test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}
