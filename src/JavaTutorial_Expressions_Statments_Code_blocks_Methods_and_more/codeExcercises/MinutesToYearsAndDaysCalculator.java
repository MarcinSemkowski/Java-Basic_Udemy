package JavaTutorial_Expressions_Statments_Code_blocks_Methods_and_more.codeExcercises;

    public class MinutesToYearsAndDaysCalculator {


       public static void printYearsAndDays(long minutes){
          long days = minutes / 1440,years = days/ 365;
          days %= 365;
          String display  = (minutes < 0) ? " Invalid Value" : minutes + " min = " + years + " y and " +days + " d";
          System.out.println(display);
       }



    }
