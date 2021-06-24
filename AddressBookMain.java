package com.bridgelabz;

public class AddressBookMain {
	public static void main(String[] args) {
        Contacts person = new Contacts("Piyush","Shaw","Howrah","Howrah","piy@gmail.com",1235,8349000040L);
        System.out.println("WELCOME TO ADDRESS BOOK SYSTEM");
        AddressBook addressBook = new AddressBook();
        addressBook.add();
       // addressBook.choice();
    }
}
