package ControlFlowStatments.CodingExercises;

public class LastDigitChecker {

 public static boolean hasSameLastDigit(int num1,int num2,int num3){
      if((isValid(num1)) &&(isValid(num2)) && (isValid(num3)) ){

          int num1LastDigit = num1 % 10;
          int num2LastDigit = num2 % 10;
          int num3LastDigit = num3 % 10;


              boolean isRightMost = ((num1LastDigit == num2LastDigit) || (num1LastDigit == num3LastDigit) ||
                      (num2LastDigit == num3LastDigit)) ? true: false  ;
              return isRightMost;


      }


     return false;
 }


 public static boolean isValid(int param){
   boolean isValid =((param < 10) || (param > 1000)) ?
         false :   true;
   return isValid;

 }



}
