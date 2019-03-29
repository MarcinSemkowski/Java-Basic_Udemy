package ControlFlowStatments;

public class L_5 {


    public static void main(String[] args) {
        int count = 0;
        while(count !=5){
            System.out.println("Count value is " + count);
            count++;
        }

       // for(int i=1;i<7;i++){
       //   System.out.println("Count value is "+ count);
       // }
        for(count =1;count != 6; count++){
          System.out.println("Count value is " + count);
        }



        while(true){
            if(count != 5){
               break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

      /*  do{
            count++;
            System.out.println("Count value is " + count);

        } while(count !=6);
         */
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound =0;

        //Modify the while code above
        //Make it also record the total number of even numbers its has found
        //and break once 5  are found
        // and at the end, display the total number of even  numbers found

        while(number <= finishNumber){
           number++;
            if(!isEvenNumber(number)){
               continue;
            }
               evenNumbersFound++;


                if(evenNumbersFound >= 5) {
                    break;
                }
            System.out.println("Its  even number" + number);

        }
        System.out.println(" Total even numbers found =" + evenNumbersFound );


        }





    //Create a method called isEvenNumber that takes a parameter of type int
    //Its purpose is to determine if the argument passed to the method is
    // an even number or not
    //return true if an  even number , otherwise return false



    public static boolean isEvenNumber(int parameter ){
        if((parameter % 2) == 0){
            return true;
        }
        else {
           return false;
        }

     }

}
