package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing;

import Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing.L_6.GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

public class L_7 {
    private static Scanner scanner = new Scanner(System.in);

    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
      boolean quit = false;
      int choice =0;
      printInstructions();
      while (!quit){
          System.out.println("Enter your choice: ");
          choice = scanner.nextInt();
          scanner.nextLine();
          switch (choice){
              case 0:
                  printInstructions();
                  break;
              case 1:
                  groceryList.printGroceryList();
                  break;
                  case 2:
                      addItem();
                      break;
              case 3:
                  modifyItem();
                  break;
              case 4:
                  removeItem();
                  break;
              case 5:
                  searchItem();
                  break;

              case 6:
                  processArrayList();
                  break;

                  case 7:
                      quit = true;
                      break;



          }
      }
    }


    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the grocery items.");
        System.out.println("\t 2 - To add item on the list.");
        System.out.println("\t 3 - To modify an item in the list .");
        System.out.println("\t 4 - To remove an item  from the list .");
        System.out.println("\t 5 To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter current Item name:");
        String currentItem = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter new item name: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem,newItem);

    }

    public static void removeItem(){
        System.out.print("Enter item number:");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found "+ searchItem + " in your grocery list ");
        }
        else{
            System.out.println(searchItem + " is not in the shopping list ");
        }
    }

    private static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }



}
