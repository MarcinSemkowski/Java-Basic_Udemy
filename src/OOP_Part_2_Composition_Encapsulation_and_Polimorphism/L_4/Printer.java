package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_4;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex) {
        if(tonerLevel >-1 && tonerLevel  <= 100){
            this.tonerLevel = tonerLevel;
        } else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addTuner(int tonerAmount){
      if(tonerLevel > 0 && tonerAmount <=100){
        if(tonerLevel + tonerAmount >100)
           return -1;
        this.tonerLevel +=tonerLevel;
        return this.tonerLevel;

      }else{
          return -1;
      }
    }
    public int printPages(int pages){
      int pagesToPrint = pages;
      if(this.duplex){
          pagesToPrint /= 2;
          System.out.println("Printing in duplex mode");
      }
      this.pagesPrinted /=2;
      return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
