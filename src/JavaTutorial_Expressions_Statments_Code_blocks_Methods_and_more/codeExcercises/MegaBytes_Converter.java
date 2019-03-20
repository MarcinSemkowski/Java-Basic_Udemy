package JavaTutorial_Expressions_Statments_Code_blocks_Methods_and_more.codeExcercises;

public class MegaBytes_Converter {

  public void printMegaBytesAndKiloBytes(int kiloBytes){

      if(kiloBytes < 0){
         System.out.println("Invalid Value");
      }

      int megabytes = Math.round(kiloBytes / 1024);

      int remainingkilobytes =  kiloBytes % 1024;

      System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingkilobytes + " KB " );

  }


}
