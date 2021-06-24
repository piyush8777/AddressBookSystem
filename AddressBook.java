package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	 Scanner sc = new Scanner(System.in);
	    List<Contacts> personDetails = new ArrayList<Contacts>();

	    // @addContactDetails method is used to add contacts entered from the User:
	    public void addContactDetails() {
	        System.out.println("Enter the number of Contact you want to add in addressbook");
	        int numberOfContacts = sc.nextInt();
	        for (int a = 0; a < numberOfContacts; a++) {
	            System.out.println("Contact :" + a);
	            System.out.println("Enter First Name: ");
	            String firstName = sc.next();
	            System.out.println("Enter Last Name: ");
	            String lastName = sc.next();
	            System.out.println("Enter Address: ");
	            String address = sc.next();
	            System.out.println("City: ");
	            String city = sc.next();
	            System.out.println("EmailID: ");
	            String email = sc.next();
	            System.out.println("state :");
	            String state = sc.next();
	            System.out.println("Zip: ");
	            int zip = sc.nextInt();
	            System.out.println("PhoneNumber: ");
	            Long phoneNumber = sc.nextLong();
	            Contacts contacts = new Contacts(firstName, lastName, address, city, email, state, zip, phoneNumber);

	            personDetails.add(contacts);
	        }
	        }
	        public boolean editContactDetails(String Name) {
	        int flag = 0;
	        for (Contacts i : personDetails) {
	                if (i.getFirstName().equals(Name)) {
	                    System.out.println("which field you want to edit :" + "\n" + "[1] : Edit firstName" + "\n" + "[2] : Edit LastName" + "\n" + "[3]: Edit Address" + "\n" + "[4] : Edit City " + "\n" + "[5]: Enter zipCode" + "\n" + "[6]: Enter MobileNo" + "\n" + "[7]: Enter EmailId");
	                    switch (sc.nextInt()) {
	                        case 1:
	                            System.out.println("Change the First Name: ");
	                            String editfName = sc.next();
	                            i.setFirstName(editfName);
	                            break;
	                        case 2:
	                            System.out.println("Change the Last Name: ");
	                            String editlName = sc.next();
	                            i.setLastName(editlName);
	                            break;
	                        case 3:
	                            System.out.println("Change the Address: ");
	                            String editAddress = sc.next();
	                            i.setAddress(editAddress);
	                            break;
	                        case 4:
	                            System.out.println("Change the City: ");
	                            String editCity = sc.next();
	                            i.setCity(editCity);
	                            break;
	                        case 5:
	                            System.out.println("Change the zip Code: ");
	                            int editZipCode = sc.nextInt();
	                            i.setZip(editZipCode);
	                            break;
	                        case 6:
	                            System.out.println("Change the Phone Number: ");
	                            Long editPhoneNum = sc.nextLong();
	                            i.setPhoneNumber(editPhoneNum);
	                            break;
	                        case 7:
	                            System.out.println("Change the Email ID: ");
	                            String editEmail = sc.next();
	                            i.setEmail(editEmail);
	                            break;

	                    }
	                    flag = 1;
	                    System.out.println(personDetails);
	                }
	            }
	            return flag == 1;
	    }

	        public boolean deleteContact(String name) {
	        int flag = 0;
	            System.out.println("Deleting a contact");
	            for (Contacts i : personDetails) {

	                if (i.getFirstName().equals(name)) {
	                    personDetails.remove(i);
	                    System.out.println("contacts left are :" + personDetails.size());
	                }
	            }
	            return  flag ==1;
	        }
	    public void display() {
	        for (Contacts person : personDetails)				//Display method
	            System.out.println(person);
	    }
}
