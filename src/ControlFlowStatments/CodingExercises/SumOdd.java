package ControlFlowStatments.CodingExercises;

    public class SumOdd {

      public static boolean isOdd(int number){

          boolean isOddDisplay = (number <0) ? false :
                  (number % 2 != 0) ? true: false;

          return isOddDisplay;
      }


      public static int sumOdd(int start,int end){
          int sum = 0;
          if((end  >= start) &&((start > 0) && (end > 0))){

             for(int i = start; i <= end; i++ ){
                 if(isOdd(i)){
                    sum += i;
                 }
             }
         }else{
          return -1;
         }

       return sum;
      }


    }
