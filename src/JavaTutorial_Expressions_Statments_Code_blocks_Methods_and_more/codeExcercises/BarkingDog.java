package JavaTutorial_Expressions_Statments_Code_blocks_Methods_and_more.codeExcercises;

public class BarkingDog {


    public static boolean shouldWakeUp(boolean barking,int hourOfDay){

        if(barking == true && hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22 && hourOfDay <=23){
            return true;
        }
        else{

           return false;

        }



    }





}
