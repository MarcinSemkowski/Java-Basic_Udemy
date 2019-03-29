package ControlFlowStatments;

public class L_6 {


    public static void main(String[] args) {

        System.out.println("Sum of dignits in number 125 = " + sumDignits_M(125)+ " ," + sumDignits_C(125));
    }


  // my solution
  public static int sumDignits_M(int number){

      if(number < 10){
         return -1;
      }

      String stringNumber =  Integer.toString(number);

      int numbersSize = stringNumber.length();
     int sum =0;



      for(int i = 0; i < numbersSize; i++){
          sum += Character.getNumericValue(stringNumber.charAt(i));
      }

      return sum;
  }


    public static int sumDignits_C(int number){

        if(number < 10){
            return -1;
        }

        int sum =0;

        //125-> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
       while(number > 0){
          int dignit = number % 10;
          sum += dignit;
        // drop the lest-significant digit
           number /= 10;
       }
       return sum;
    }



}
