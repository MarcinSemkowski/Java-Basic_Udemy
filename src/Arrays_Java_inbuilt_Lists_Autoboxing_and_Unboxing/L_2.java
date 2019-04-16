package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing;

import java.util.Arrays;
import java.util.Scanner;

public class L_2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntigers = getIntigers(5);
        int[] sorted = sortIntigers(myIntigers);
        printArray(sorted);


    }

   public static int[] getIntigers(int capacity){
        int[] array = new int[capacity];
       System.out.println("Enter " + capacity + "integer values: \r");
       for(int i =0; i < array.length; i++){
          array[i] = scanner.nextInt();
       }
      return array;
    }



    public static void printArray(int[] array){
        for(int i =0; i < array.length; i++){
            System.out.println("Element " + i + " contains " + array[i]);

        }
    }

    public  static int[] sortIntigers(int[] array){
        int[] sortedArray = new int[array.length];
        /*
      for(int i =0; i < array.length; i++){
          sortedArray[i] = array[i];
      }
    */
      sortedArray = Arrays.copyOf(array, array.length);
      boolean flag = true;
      int temp;

      while(flag){
         flag = false;
         for(int i =0; i < sortedArray.length - 1 ; i++){
            if(sortedArray[i] < sortedArray[i +1]){
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i + 1];
                sortedArray[i + 1] =  temp;
                flag = true;

            }
         }
      }
      return sortedArray;
    }

}
