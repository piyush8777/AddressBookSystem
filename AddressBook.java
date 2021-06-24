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
}
