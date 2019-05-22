package Naming_Conventions_and_Packages_static_and_final_keywords.L_9;

public class SomeClass {
    private static int classCounter =0;
    private final int  instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + "created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
