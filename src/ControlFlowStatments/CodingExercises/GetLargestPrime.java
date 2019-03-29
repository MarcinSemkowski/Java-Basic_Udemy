package ControlFlowStatments.CodingExercises;

public class GetLargestPrime {


    public static int getLargestPrime(int number){

        int prime = number;
        int i = 2;
        if(number < 0) {
            return -1;
        }

         else{
            do
            {
                if (prime % i == 0 && prime != i)
                    prime /= i;
                else i++;
            }
            while (i <= Math.sqrt(number));
             return prime;
      }


    }


}
