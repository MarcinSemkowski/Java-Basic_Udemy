package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing;

import java.util.Scanner;

public class L_1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }



    public static int[] getIntigers(int numbers) {
        System.out.println("Enter " + numbers + "integer values.\r");
        int[] values =  new int[numbers];
        for(int i =0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
      return values;
    }

    public static double getAvarge(int[] array){
        int sum =0;
        for(int i =0; i < array.length; i++ ){
           sum += array[i];
        }

        return (double) sum / (double)array.length;
    }

}
