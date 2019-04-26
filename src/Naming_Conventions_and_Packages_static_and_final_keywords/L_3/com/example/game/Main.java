package Naming_Conventions_and_Packages_static_and_final_keywords.L_3.com.example.game;

import Inner_And_Abstract_Classes_and_Interfaces.L_2.ISaveable;
import Inner_And_Abstract_Classes_and_Interfaces.L_2.Monster;
import Inner_And_Abstract_Classes_and_Interfaces.L_2.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Player tim = new Player("Tim",10,15);
        System.out.println(tim.toString());
        saveObject(tim);
        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
     //   loadObject(tim);
        System.out.println(tim);

        ISaveable warewolf = new Monster("Warewolf",20,40);
        System.out.println(((Monster) warewolf).getStrenght());
        System.out.println(warewolf);
        saveObject(warewolf);
    }


    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 - to enter a String\n" +
                "0 - to quit ");

        while(!quit){
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index ++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
             for(int i =0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + "to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
     ArrayList<String> values = readValues();
     objectToLoad.read(values);
    }
}
