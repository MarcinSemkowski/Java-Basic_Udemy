package ControlFlowStatments.CodingExercises;

public class NumberToWords {

    public static void numberToWords(int number) {
        int zeroToAdd =  getDigitCount(number) - getDigitCount(reverse(number));
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverseNumber = reverse(number);
            if(number ==0)
                System.out.print("Zero ");
            while (reverseNumber != 0) {

                int remainder =  reverseNumber % 10;

                switch (remainder) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;


                }
              reverseNumber /= 10;
            }

            for(int i =0; i < zeroToAdd; i++){
                System.out.print("Zero");
            }
        }


    }

    public static int reverse(int number) {
        int r;
        int sum = 0;
        while (number != 0) {
            r = number % 10;
            sum = (sum * 10) + r;
            number = number / 10;
        }

        return sum;
    }

    public static int getDigitCount(int number){
       if(number < 0 )
        return -1;
       int dignitCount = 0;
       if(number == 0){
         return 1;
       }

       while(number != 0){
         number /= 10;
         dignitCount++;
       }
      return dignitCount;
    }

}
