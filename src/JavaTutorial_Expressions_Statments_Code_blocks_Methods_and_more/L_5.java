package JavaTutorial_Expressions_Statments_Code_blocks_Methods_and_more;

public class L_5 {


    public static void main(String[] args) {

       printConvertion(toMilesPerHour(10.5));


    }




public  static long toMilesPerHour(double kilometersPerHour){

     if(kilometersPerHour < 0){

        return -1;

     }



     return   Math.round(kilometersPerHour / 1.609) ;




}







    public static void printConvertion(double kilometerPerHour){

        if(kilometerPerHour <0){

             System.out.println("Invalid Value");

        }
        else{

           long milesPerHour = toMilesPerHour(kilometerPerHour);

           System.out.println(kilometerPerHour +
                   "km/h = " + milesPerHour +
                   "mi/h");

        }



    }



}
