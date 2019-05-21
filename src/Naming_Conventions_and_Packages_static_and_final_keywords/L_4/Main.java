package Naming_Conventions_and_Packages_static_and_final_keywords.L_4;

import Naming_Conventions_and_Packages_static_and_final_keywords.L_4.pl.semkowski.mylibrary.Series;

public class Main {

    public static void main(String[] args) {

        for(int i =0; i <=10;i++){
            System.out.println(Series.nSum(i));
        }
        System.out.println("**********************");
        for(int i =0; i <=10;i++){
            System.out.println(Series.factorial(i));
        }
        System.out.println("**********************");
        for(int i =0; i <=10;i++){
            System.out.println(Series.fibonacci(i));
        }



    }

}
