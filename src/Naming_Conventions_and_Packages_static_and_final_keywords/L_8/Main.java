package Naming_Conventions_and_Packages_static_and_final_keywords.L_8;

public class Main {
    public static int multiplier = 7;
    public static void main(String[] args) {
       /*
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance  number " +  firstInstance.getNumInstances());

        StaticTest secondInsteance = new StaticTest("2st instance");
        System.out.println(secondInsteance.getName() + " is instance number " + secondInsteance.getNumInstances());

        StaticTest ThirdInsteance = new StaticTest("3st instance");
        System.out.println(ThirdInsteance.getName() + " is instance number " + ThirdInsteance.getNumInstances());
      */
       int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    public static int multiply(int number){
        return number * multiplier;
    }
}
