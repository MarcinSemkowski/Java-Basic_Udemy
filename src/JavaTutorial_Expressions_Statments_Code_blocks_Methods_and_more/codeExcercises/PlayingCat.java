package JavaTutorial_Expressions_Statments_Code_blocks_Methods_and_more.codeExcercises;

    public class PlayingCat {


      public  static boolean isCatPlaying(boolean summer, int temperature){
        boolean isPlaying = (summer) ?
                ((temperature  >= 25) && (temperature <= 45 ) ) ?
                        true :
                        false   :
                ((temperature >= 25) && (temperature <= 35 )) ?
                true : false;
        return  isPlaying;
      }



    }
