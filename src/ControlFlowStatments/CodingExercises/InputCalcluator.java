package ControlFlowStatments.CodingExercises;

import java.util.Scanner;

public class InputCalcluator {

     public static void inputThenPrintSumAndAverage(){

         Scanner scan = new Scanner(System.in);
         int numbersCounter =0;
         int numbersSum = 0;
         long avg;
         while(true){
             boolean isNextInt = scan.hasNextInt();
             if(isNextInt){
                 int number =  scan.nextInt();

                 numbersSum += number;
             }else{
                 break;
             }

             numbersCounter++;

         }
         if(numbersSum !=0){
            avg = (long)Math.round((double)numbersSum / numbersCounter);
         }else{
             avg =0;
         }
         System.out.println("SUM = " + numbersSum + " AVG = " + avg );

         scan.close();

     }



}
