package Naming_Conventions_and_Packages_static_and_final_keywords.L_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter Number: ");
        X x  = new X(scanner.nextInt());
        x.x();
    }
}

