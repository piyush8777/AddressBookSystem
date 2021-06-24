package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookManager {
	static Scanner sc = new Scanner(System.in);
    AddressBook addressBook = new AddressBook();
    static Map<String,AddressBook> addressBookListMap = new HashMap<>();

   public void addAddressBook(String book){
       AddressBookManager addressBookManager= new AddressBookManager();
       boolean flag = true;

       while(flag) {

           System.out.println("1.Add Contact");
           System.out.println("2.Edit Contact");
           System.out.println("3.Delete");
           System.out.println("4.Exit");
           System.out.println("Enter Choice: ");

           int option = sc.nextInt();

           switch (option)
           {
               case 1:
                   addressBook.addContactDetails();
                   addressBook.display();
                   break;

               case 2:
                   System.out.println("Enter the Person First name to edit details: ");
                   String personName = sc.next();

                   boolean listEdited = addressBook.editContactDetails(personName);
                   if (listEdited) {
                       System.out.println("List Edited Successfully");
                   } else {
                       System.out.println("List Cannot be Edited");
                   }
                   addressBook.display();
                   break;

               case 3:
                   System.out.println("Enter the Contact to be deleted:");
                   String firstName = sc.next();
                   boolean listDeleted = addressBook.deleteContact(firstName);
                   if (listDeleted) {
                       System.out.println("Deleted Contact from the List");
                   } else {
                       System.out.println("List Cannot be Deleted");
                   }
                   addressBook.display();
                   break;

               case 4:
                   flag =false;
                   break;

           }
       }
   }
   public  void main() {
       System.out.println("Welcome to the Address Book Management System ");
       AddressBookManager addressBookManager = new AddressBookManager ();
       boolean flag =true;
       while(flag)
       {
           System.out.println("1.Add New Address Book");
           System.out.println("2.Exit");
           System.out.println("Enter choice: ");
           int option = sc.nextInt();
           switch (option){
               case 1: {
                   System.out.println("Enter the Name of Address Book: ");
                   String addressBookName = sc.next();
                   if(addressBookListMap.containsKey(addressBookName)){
                       System.out.println("The Address book Already Exists");
                       System.out.println(addressBookListMap.keySet());
                   }else {
                       addressBookManager.addAddressBook(addressBookName);
                       addressBookListMap.put(addressBookName,new AddressBook());

                   }
                   break;
               }
               case 2:{
                   flag = false;
                   break;
               }
           }
       }


   }
}
