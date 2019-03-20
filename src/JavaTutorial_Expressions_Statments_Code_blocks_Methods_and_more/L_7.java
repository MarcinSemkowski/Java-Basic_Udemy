package JavaTutorial_Expressions_Statments_Code_blocks_Methods_and_more;

public class L_7 {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

     System.out.println(getDurationString(65,45));
    }


    private  static String getDurationString(long minutes, long second){

       if((minutes <0) || (second < 0) || (second > 59)){
          return INVALID_VALUE_MESSAGE;
       }

       long hours = minutes / 60;
      long remainingMinutes = minutes % 60;
      String hoursString = hours + "h";
      if(hours < 10){
         hoursString = "0" + hoursString;
      }

        String minutesString = hours + "h";
        if(hours < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = hours + "h";
        if(hours < 10){
            secondsString = "0" + secondsString;
        }
      return hoursString + " " + minutesString + "  " + secondsString + "";
    }


    private static String getDurationString(long second){

       if(second < 0){
          return INVALID_VALUE_MESSAGE;
       }

       long minutes = second / 60;
       long  remainingSecond = second % 60;

       String x =  getDurationString(minutes,remainingSecond);
       return x;
    }


}
