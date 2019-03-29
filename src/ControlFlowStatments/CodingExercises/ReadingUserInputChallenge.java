package ControlFlowStatments.CodingExercises;

import java.util.Scanner;

public class ReadingUserInputChallenge {


   public static void  readingUserInput(){
       int i =1;
       Scanner scanner = new Scanner(System.in);

       int sum =0;
       while(true){

          System.out.println("Enter number " + i);

           boolean isNextInt = scanner.hasNextInt();
          if(isNextInt){
             i++;
              int number = scanner.nextInt();
              sum += number;
              if(i ==10){
                  break;
              }


          }else{
              System.out.println("Invalid Number");

          }

         scanner.nextLine();
      }
       scanner.close();
       System.out.println(sum);

   }


}
