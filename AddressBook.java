package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	 Scanner sc = new Scanner(System.in);
	    List<Contacts> personDetails = new ArrayList<Contacts>();
	    Contacts person = new Contacts();

	    // @add method is used to add contacts entered from the User:
	    public void add() {
	        System.out.println("Enter the number of Contact you want to add in addressbook");
	        int numberOfContacts = sc.nextInt();
	        for (int a = 0; a < numberOfContacts; a++) {
	            Contacts person = new Contacts();
	            System.out.println("Contact :" + a);
	            System.out.println("Enter First Name: ");
	            String firstName = sc.next();
	            person.setFirstName(firstName);
	            System.out.println("Enter Last Name: ");
	            String lastName = sc.next();
	            person.setLastName(lastName);
	            System.out.println("Enter Address: ");
	            String address = sc.next();
	            person.setAddress(address);
	            System.out.println("City: ");
	            String city = sc.next();
	            person.setCity(city);
	            System.out.println("EmailID: ");
	            String email = sc.next();
	            person.setEmail(email);
	            System.out.println("Zip: ");
	            int zip = sc.nextInt();
	            person.setZip(zip);
	            System.out.println("PhoneNumber: ");
	            Long phoneNumber = sc.nextLong();
	            person.setPhoneNumber(phoneNumber);
	            personDetails.add(person);
	            System.out.println(personDetails);
	        }
	    }

	    // @choice it gives choice between add a contact, edit a contact, Delete a contact|
	    public void choice() {
	        System.out.println("Enter your Choice :" + "\n" + "[1] Add a contact" + "\n" + "[2] Edit a contact" + "\n" + "[3] Delete a contact");
	        int choice = sc.nextInt();
	        if (choice == 1) {
	            AddressBook addressBook = new AddressBook();
	            addressBook.add();
	        }
	        // Choice 2: it is for Editing a contact
	        // Switch case is used for giving option to edit the different field

	        if (choice == 2) {
	            System.out.println("Editing a contact");
	            System.out.println("Enter the name of contact you want to edit: ");
	            Scanner input = new Scanner(System.in);
	            String editContact = input.next();
	            for (Contacts i : personDetails) {
	                if (i.getFirstName().equals(editContact)) {
	                    System.out.println("which field you want to edit :" + "\n" + "[1] : Edit firstName" + "\n" + "[2] : Edit LastName" + "\n" + "[3]: Edit Address" + "\n" + "[4] : Edit City " + "\n" + "[5]: Enter zipCode" + "\n" + "[6]: Enter MobileNo" + "\n" + "[7]: Enter EmailId");
	                    switch (input.nextInt()) {
	                        case 1:
	                            System.out.println("Change the First Name: ");
	                            String editfName = input.next();
	                            i.firstName = editfName;
	                            break;
	                        case 2:
	                            System.out.println("Change the Last Name: ");
	                            String editlName = input.next();
	                            i.lastName = editlName;
	                            break;
	                        case 3:
	                            System.out.println("Change the Address: ");
	                            String editAddress = input.next();
	                            i.address = editAddress;
	                            break;
	                        case 4:
	                            System.out.println("Change the City: ");
	                            String editCity = input.next();
	                            i.city = editCity;
	                            break;
	                        case 5:
	                            System.out.println("Change the zip Code: ");
	                            int editZipCode = input.nextInt();
	                            i.zip = editZipCode;
	                            break;
	                        case 6:
	                            System.out.println("Change the Phone Number: ");
	                            Long editPhoneNum = input.nextLong();
	                            i.phoneNumber = editPhoneNum;
	                            break;
	                        case 7:
	                            System.out.println("Change the Email ID: ");
	                            String editEmail = input.next();
	                            i.email = editEmail;
	                            break;
	                    }

	                    System.out.println(personDetails);
	                }
	            }

	        }
	    }
}
