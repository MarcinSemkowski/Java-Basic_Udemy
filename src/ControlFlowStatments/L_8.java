package ControlFlowStatments;

import java.util.Scanner;

public class L_8 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next character
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;
            if(age >= 0 && age <= 100){
                System.out.println("Your name is:" + name);
                System.out.println("Your age:" + age);
            }else{
                System.out.println(" Invalid Year of birth");
            }

        } else{
            System.out.println("Enable to parse year of birth   ");
        }

        scanner.close();
    }



}
