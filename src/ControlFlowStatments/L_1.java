package ControlFlowStatments;

public class L_1 {

    public static void main(String[] args) {
        int Value = 3;

        if (Value == 1) {
            System.out.println("Value was 1 ");
        } else if (Value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2 ");
        }

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a  3 , or a 4 , or 5");
                System.out.println("Acutal it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;


        }

        /*
         * Create a new switch statement using char instead of int
         * create s new char variable
         * create a switch statement
         * create a switch statement testing form
         * A,B,C,D or E
         * display  a message if any of these are found and then break
         * Add a default which displays a message saying not found
         * */

        char variableSwitch = 'C';
        switch (variableSwitch) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(variableSwitch + "was found");
                break;

            default:
                System.out.println("Could not find A,B,C,D or E");
                break;

        }

        String month = "January";

        switch (month.toUpperCase()) {
            case "Jaunary":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;


        }


    }


}
