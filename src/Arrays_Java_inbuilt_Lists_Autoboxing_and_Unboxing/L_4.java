package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing;

import java.util.Scanner;

public class L_4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count: ");
        int count= scanner.nextInt();
        scanner.nextLine();

        System.out.println("min = " + findMin(readIntigers(count)));

    }


    public static int[] readIntigers(int count){
      int[] array = new int[count];

      for(int i =0; i < array.length; i++){
          System.out.println("Enter a number ");
          array[i] = scanner.nextInt();
      }
        return array;
    }


    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i =0; i < array.length -1; i++){

           if(array[i] < array[i + 1]){
              min = array[i];
           }
        }
       return min;
    }


}
