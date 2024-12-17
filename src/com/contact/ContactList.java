package com.contact;

import java.util.ArrayList;

public class ContactList {

	static ArrayList<Contact> contList = new ArrayList<>();
	public static int count;

	public ContactList() {

	}

	// a method to return the number of contactList in the ContactAPK
	public int countContacts() {
		return contList.size();
	}

	/*
	 * A method to add contact to the contactAPK, returns true if add successfully ,
	 * otherwise false
	 */
	public void addContact(Contact contact) {
		contList.add(contact);
	}

	/*
	 * A method to searching a contact Info with a given mobileNumber and return it
	 * index , or -1 if not found
	 */

	public long searchingInfo(long mobileNo) {
		for (int i = 0; i < contList.size(); i++) {
			if (contList.size() > 0) {

				if (contList.get(i).getMobileNo() == mobileNo) {
					return i;
				}
			}

		}

		return -1;
	}

	// A method to get a Contact at a specific index, returns null if out of bound
	public Contact getContact(long index) {

		return contList.get((int) index);

	}
	public boolean deleteContact(Contact cont) {
		long index = 0;
		index = searchingInfo(cont.getMobileNo());
		if (index == -1) {
			return false;
		}

		contList.remove(index);

		return true;
	}


	// A method to display the Main Contacts of the ContactAPK

	public void displayMainContact() {
		System.out.println("*** Welcome to Contact APK ***");
		System.out.println("1: Add to  Contact:");
		System.out.println("2: search a contact information:"); // show the contact Information
		System.out.println("3: Edit a Contact Details:");
		System.out.println("4: Delete the Contact:");

	}

}
