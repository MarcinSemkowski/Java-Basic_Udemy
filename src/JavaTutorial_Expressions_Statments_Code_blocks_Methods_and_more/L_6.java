package JavaTutorial_Expressions_Statments_Code_blocks_Methods_and_more;

    public class L_6 {

        public static void main(String[] args) {
            int newScore = calculateScore("Tim",500);
          System.out.println("New Score = " + newScore );
          calculateScore(75);
          calculateScore();
          calcFeetAndInchesToCentimeters(6,0);
          double centimeters = calcFeetAndInchesToCentimeters(6,0);
          if(centimeters <0.0){
              System.out.println("Invalid centimeter parameters");
          }
        }

        public static int  calculateScore(String playerName,int score){

           System.out.println("Player" + playerName + "scored " + score + "points " );
            return score * 1000;
        }

        public static int calculateScore(int score){
           System.out.println("Player scored " + score + " points " );
          return score * 1000;
        }

        public static int calculateScore(){
            System.out.println("No player name no player Score" );
            return 0;
        }


        public static double calcFeetAndInchesToCentimeters(double feet, double inches){

            if( (feet < 0) || ( (inches < 0 ) && (inches > 12 ) )){
            System.out.println("Invalid feet or inches parameters");
             return  -1;
            }
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + "feet, " + inches + "inches = " + centimeters + " cm" );
            return centimeters;
         }

        public static double calcFeetAndInchesToCentimeters(double inches){

            if(inches < 0) {
               return -1;
            }
          double feet = (int) inches / 12;
          double remainingInches = (int) inches % 12;
          System.out.println(inches + "inches is qual to " + feet + "feet and " + remainingInches + " inches ");
          return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }





    }
