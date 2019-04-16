package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L_3 {


    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue =  myIntValue;
        System.out.println("myIntValue = " + myIntValue );
        System.out.println("anotherIntValue = " + anotherIntValue);

        myIntValue = 20;

        System.out.println("myIntValue = " + myIntValue );
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("AnotherArray = " + Arrays.toString(anotherArray));
            anotherArray[0] = 1;

        System.out.println(" after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println(" after change AnotherArray = " + Arrays.toString(anotherArray));

         modifyArray(myIntArray);

        System.out.println(" after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println(" after modify AnotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
         array[0] = 2;
         array = new int[]{1,2,4,5,6};

    }

}
