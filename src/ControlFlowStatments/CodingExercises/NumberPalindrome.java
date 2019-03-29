package ControlFlowStatments.CodingExercises;

public class NumberPalindrome {

 public static boolean isPalindrome(int number){

     int r= 0;
     int sum=0;
     int temp;

     temp = number;
     while(number != 0){
         r= number%10;
         sum =(sum * 10) + r;
         number = number/10;
     }
     if(temp==sum){
         return true;
     }
     else{
         return false;
     }

 }



}
