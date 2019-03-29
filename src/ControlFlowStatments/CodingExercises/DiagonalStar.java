package ControlFlowStatments.CodingExercises;

public class DiagonalStar {

 public static void printSquareStar(int number){
       if(number < 5){
           System.out.println("Invalid Value");
       }else {
           for (int i = 1; i <= number; i++) {
               for (int j = 1; j <= number; j++) {

                   if ((i == 1) || (i == number) || (j == 1) || (j == number) || (i == number - j + 1) || (j == i)) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }

               }
               System.out.println();
           }
       }
 }


}
