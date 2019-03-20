package JavaTutorial_Expressions_Statments_Code_blocks_Methods_and_more;

public class L_3 {

    public static void main(String[] args) {
        boolean gameOver =true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;


        //calculateScore(true,800,levelCompleted,bonus);


       //calculateScore(true,10000,8,200);

        /*
        if(score < 5000 && score >1000) {
            System.out.println("Your Score was less than 5000");
        }
        else{

            System.out.println("Got there ");

        }

       */



          int highScorePosition = calculateHighScorePosition(1500);

          displayHighScorePosition("Tim",highScorePosition);

         highScorePosition = calculateHighScorePosition(900);

        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);

        displayHighScorePosition("Percy",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);

        displayHighScorePosition("Gilbert",highScorePosition);






    }

      public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName + "manged to get into position"
        + highScorePosition + "on the high score table");

      }

      public static int calculateHighScorePosition(int playerScore){

        int position =4;

        if(playerScore >= 1000){
            position =1;
        }
        else if(playerScore >= 500 ){
         position = 2;
        }else if (playerScore >= 100 ){
           position = 3;
        }
            return position;


    }



    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){

        if(gameOver){

            int finalScore = score + (levelCompleted * bonus);
             finalScore += 2000;
            System.out.println("Your final score was: " + finalScore);
          return finalScore;
        }

          return -1;


    }



}
