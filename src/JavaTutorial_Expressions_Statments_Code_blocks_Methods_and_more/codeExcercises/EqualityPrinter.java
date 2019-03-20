package JavaTutorial_Expressions_Statments_Code_blocks_Methods_and_more.codeExcercises;

    public class EqualityPrinter {


       public static void printEqual(int a,int b , int c){

          String display = ((a < 0) || (b < 0) || (c < 0)) ? "Invalid Value" :
                  ((a == b) && (b == c) ) ? "All numbers are equal" :
                          ( (a != b) && (b != c) && (c!=a)) ? "All numbers are different" :
                                "Neither all are equal or different";

           System.out.println(display);

       }



    }
