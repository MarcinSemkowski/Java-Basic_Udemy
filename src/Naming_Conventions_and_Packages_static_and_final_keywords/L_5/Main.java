package Naming_Conventions_and_Packages_static_and_final_keywords.L_5;

public class Main {
    public static void main(String[] args) {
        String varFour = "this is private to Main() ";
        ScopeCheck scopeInstance = new ScopeCheck();
         scopeInstance.useInner();
         ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("varThree is not accessible here " );

        /*
        System.out.println("scopeInstants varOne is "+ scopeInstance.getVarOne());
        System.out.println(varFour);
        scopeInstance.timesTwo();
        System.out.println("**********************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
      */
    }

}
