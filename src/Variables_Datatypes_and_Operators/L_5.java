package Variables_Datatypes_and_Operators;

public class L_5 {

    public static void main(String[] args) {

        int result = 1 + 2 ;
        System.out.println("1 + 2 = " + result);
        int previousResult = result ;
        result = result -1;
        System.out.println(previousResult + " - 1 = " + result);
        result = result * 10;
        System.out.println("1 + 2 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println( previousResult + " /5 = " + result);
        previousResult = result;

        result = result %3;
        System.out.println( previousResult + " %5 = " + result);

        previousResult = result;
        result = result +1;
        System.out.println( previousResult + " /5 = " + result);

        previousResult = result;
        result = result +1;
        System.out.println(  " Result is Now " + result);
        result++;
        System.out.println("Result is Now" + result);
        result--;
        System.out.println(  " Result is Now = " + result);
        result += 2;
        System.out.println(  " Result is Now = " + result);
        result *=10;
        System.out.println(  " Result is Now = " + result);
        result -=10;
        System.out.println(  " Result is Now = " + result);
        result +=10;
        System.out.println(  " Result is Now = " + result);

        boolean isAlien = false;
        if(isAlien==false){
            System.out.println(  "It is not an alien!");
        }
        int topScore = 80;

        if(topScore<100)
            System.out.println(  " You got the high score   " );

        int secondScore = 81;

        if(topScore > secondScore && topScore < 100)
            System.out.println(  " Greten than top score and less then 100" );

        if((topScore >90) || (secondScore < 100))
            System.out.println(  " One of these test is true" );

         int newValue = 50;
        if(newValue ==50)
            System.out.println(  " this is true" );

        boolean isCar = false;
        if(isCar == true)
            System.out.println(  " This not supposted to happend" );

        boolean wasCar = isCar ? true: false;
        if(wasCar)
            System.out.println(  "wasCar is True" );
        double myFirstValue = 20d;
        double mySecondValue = 80;
        double myTotal = myFirstValue + mySecondValue * 25;
        double theRemaider = myTotal % 40;


        if(theRemaider <=20)
            System.out.println(  " Total was over the limit :D" );










    }

}
