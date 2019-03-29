package ControlFlowStatments.CodingExercises;

    public class NumbersOfDaysInMouth {

      public static boolean isLeapYear(int year) {

          if(year >= 1 && year <= 9999 ){

              if(year % 4 == 0){

                  if(year % 100 == 0){

                      if(year % 400 == 0){

                          return true;
                      }
                      else{
                          return false;
                      }

                  }
                  else{
                      return true;
                  }

              }
              else{

                  return false;

              }



          }
          else{

              return false;

          }

      }


      public static int getDaysInMonth(int month,int year){

          int dayInMouth = 0;

          if(year < 1 || year > 9999 || (month <1 || month > 12)){
             dayInMouth = -1;
          }
          else{
              switch (month) {
                  case 1:
                      dayInMouth = 31;
                      break;
                  case 2:
                      dayInMouth = isLeapYear(year) ? 29 : 28;
                      break;
                  case 3:
                      dayInMouth = 31;
                      break;
                  case 4:
                      dayInMouth = 30;
                      break;
                  case 5:
                      dayInMouth = 31;
                      break;
                  case 6:
                      dayInMouth = 30;
                      break;
                  case 7:
                      dayInMouth = 31;
                      break;
                  case 8:
                      dayInMouth = 31;
                      break;
                  case 9:
                      dayInMouth = 30;
                      break;
                  case 10:
                      dayInMouth = 31;
                      break;
                  case 11:
                      dayInMouth = 30;
                      break;
                  case 12:
                      dayInMouth = 31;
                      break;
              }
          }


        return dayInMouth;
      }


    }
