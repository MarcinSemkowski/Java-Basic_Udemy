package ControlFlowStatments.CodingExercises;

public class sumFirstAndLastDignit {

   public static int sumFirstAndLastDigit(int number){
       int sum =0;
       if(number < 0){
           return  -1;
       }else{
          int tempNumber = number;
          int lastDignit = tempNumber % 10;
          int firstDignit = 0;
          while(tempNumber != 0){
            firstDignit = tempNumber % 10;
              tempNumber = tempNumber / 10;
          }
          sum = firstDignit + lastDignit;
       }


      return sum;
   }


}
