package ControlFlowStatments.CodingExercises;

import java.util.Scanner;

public class MinimunAndMaxiumumChallenge {

 public static void min_max(){


     Scanner scanner = new Scanner(System.in);
       int min =0;
       int max =0;
       boolean first = true;

    while(true){

        System.out.println("Enter a number");
        boolean isNextInt = scanner.hasNextInt();
        if(isNextInt){

            int number = scanner.nextInt();

            if(first){
               first = false;
                min = number;
               max = number;
            }
            if(number > max)
                max = number;
            if(number < min){
               min = number;
            }
        }else{
           break;
        }
        scanner.nextLine();
    }
    scanner.close();
 }



}
