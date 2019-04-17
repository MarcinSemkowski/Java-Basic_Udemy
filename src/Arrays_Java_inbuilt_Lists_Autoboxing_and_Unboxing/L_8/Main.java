package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing.L_8;

import java.net.ConnectException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {

      boolean quit = false;
      startPhone();
      printActions();
      while(!quit){
          System.out.println("\n Enter action: (6 to show available  actions )");
        int action = scanner.nextInt();
        scanner.nextLine();

        switch (action){
            case  0:
                System.out.println( "Shutting down...");
                quit = true;
                break;
            case  1:
                printContacts();
                break;
            case  2:
                addNewContact();
                break;
            case  3:
                updateContact();
                break;
            case  4:
                removeContact();
                break;
            case  5:
                queryContact();
                break;
                case  6:
                printActions();
                break;


        }
      }
    }

    private static void printContacts(){
         mobilePhone.printContacts();

     }


     private static void  addNewContact(){
         System.out.println("Enter new Contact name: ");
         String name = scanner.nextLine();
         System.out.println("Enter phone number: ");
         String phone  = scanner.nextLine();
         Contact  contact = Contact.createContact(name,phone);
         if(mobilePhone.addNewContact(contact)){
             System.out.println("New contact added: " + name + ", phone = " + phone);
         }
         else{
             System.out.println("Cannot added , " + name + " already on file  ");
         }
     }

     private static void updateContact(){
         System.out.println("Enter existing contact name:");
         String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
         System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
         System.out.println("Enter new phone number ");
         String newNumber = scanner.nextLine();
         Contact contact =  new Contact(newName,newNumber);
         if(mobilePhone.updateContact(existingContactRecord,contact)){
             System.out.println("Successfully updated record  ");
         }
         else{
             System.out.println("error updating record");
         }

    }

    private static void removeContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
       if( mobilePhone.removeContact(existingContactRecord)){
           System.out.println("Successfully  deleted");
       }
       else{
           System.out.println("Error deleting connect");
       }

    }




    private static void queryContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() +
                "phone number is " +
                existingContactRecord.getPhoneNumber() );

    }


    private static void startPhone(){
        System.out.println("Starting Phone...");

    }

    private static  void printActions(){
        System.out.println("\n Available actions: \npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contact\n" +
                "2 - to add a new contact\n" +
                "3 - to update existing contact\n "+
                "4 -to remove  existing contact \n" +
                "5 - query if an existing contact exist " +
                "6 - to print a list of available actions.  "
                );
        System.out.println("Choose your action: ");
    }

}
