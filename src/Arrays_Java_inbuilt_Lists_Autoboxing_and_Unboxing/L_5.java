package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L_5 {

    public static void main(String[] args) {

        int[] array= {1,5,3,7,11,9,15};

        System.out.println("Your array = " + Arrays.toString(array) );
        reverse(array);
        System.out.println("Your array = " + Arrays.toString(array) );
    }

    public static void reverse(int[] array){

         int maxIndex = array.length - 1;
         int halfIndex = array.length / 2 ;

        for(int i =0; i < halfIndex; i++) {

          int temp = array[i];
          array[i] = array[maxIndex - i];
          array[maxIndex -i] = temp;
        }

    }



}
