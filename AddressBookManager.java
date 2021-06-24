package com.bridgelabz;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class AddressBookManager {
	Map<String, LinkedList> addressbook = new HashMap<String, LinkedList>();
    Scanner scanner = new Scanner(System.in);


    public void createAddressBook() {
        System.out.println("Enter the name of a AddressBook: ");
        String addressBookName = scanner.next();
        if (addressbook.containsKey(addressBookName))
            System.out.println("AddressBook is already present");
        else
            addressbook.put(addressBookName, new LinkedList<ContactPerson>());
        System.out.println(addressbook.keySet());
    }


	public void editContact(String addressBookName, ContactPerson i) {
		// TODO Auto-generated method stub
		
	}


	public void addContact(String addressBookName, ContactPerson person) {
		// TODO Auto-generated method stub
		
	}


	public void getContactByAddressBook(String addressBookName) {
		// TODO Auto-generated method stub
		
	}

	
	}

