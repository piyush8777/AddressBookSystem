package com.bridgelabz;

import java.util.Scanner;

public class Main {
	static Scanner sc =new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS BOOK SYSTEM.");
        AddressBook addressBook1 = new AddressBook();
        AddressBookManager addressBookManager = new AddressBookManager();
        boolean flag = true;
        while (flag) {
                System.out.println("----------------LIST OF OPERATIONS------------");
                System.out.println("[1] :Add New Address Book");
                System.out.println("[2] :View all the contacts from AddressBook");
                System.out.println("[3] :Search Contact from a city");
                System.out.println("[4] :Search Contact from a State");
                System.out.println("[5] :Exit");
                System.out.println("Enter choice: ");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                            addressBook1.createAddBook();
                            addressBook1.add();
                        boolean flag1 = true;
                        while (flag1) {
                        System.out.println("[1]: add a contact");
                        System.out.println("[2]: edit a contact ");
                        System.out.println("[3]: delete a contact");
                        System.out.println("[4]: Exit");
                        System.out.println("Enter choice:");
                        int c = sc.nextInt();
                        switch (c) {
                                case 1:
                                    addressBook1.add();
                                    break;
                                case 2:
                                    addressBook1.edit();
                                    break;
                                 case 3:
                                     System.out.println("enter name of person whose details you want to delete");
                                     String fname = sc.next();
                                     addressBook1.deleteContact(fname);
                                     System.out.println();
                                case 4:
                                    flag1 = false;
                                    break;
                            }
                        }
                                break;
                    case 2:
                        addressBook1.getContacts();
                    case 3:
                        System.out.println("Enter City of which u want data : ");
                        String CityName = sc.next();
                        addressBook1.getPersonNameByCity(CityName);
                        break;

                    case 4:
                        System.out.println("enter state of which u want data");
                        String state = sc.next();
                        addressBook1.getPersonNameByState(state);
                        break;

                    case 5:
                        flag = false;
                        break;
                }
            }
    }
}