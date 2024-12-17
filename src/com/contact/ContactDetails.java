package com.contact;
import com.contact.exception.MobileNoNotFoundException;
import java.util.Scanner;

public class ContactDetails {

	public static void main(String args[]) throws MobileNoNotFoundException {

		// Create a new contactList object

		ContactList cont = new ContactList();

		do {

			// Display the mainContact

			cont.displayMainContact();

			// Get the user's choice contact

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Choice:");

			int choice = sc.nextInt();

			// Add Contact to the contact list
			if (choice == 1) {

				// Create new Contact object
				Contact contact = new Contact();

				// Display the show contact and get the contact details from the user
				contact.showContact();

				// Add to contact in the contactList
				cont.addContact(contact);

			} else if (choice == 2) {
				// Ask the use for the Mobile Number of the contactList they want to Search
				System.out.println("Enter the Contact mobile Number that you want to Search:");
				long userChoice = sc.nextLong();

				// Search for the ContactInfo in the ContactList and get its index
				long indexUser = cont.searchingInfo(userChoice);

				// print the Information of the contactList with the given Mobile number
				System.out.println("The Contact Information with the given Mobile Number is: "
						+ cont.getContact(cont.searchingInfo(userChoice)));

				// Edit the contact in the ContactList 
			}else if(choice == 3) {
				// Ask the user for the Mobile Number of the Contact they want to Edits Info
				
				System.out.println("Enter the  contact Mobile Number that you want to Edit Info:");
				long userChoice = sc.nextLong();
				// Get the Contact object from the contactList using its Mobile number
				Contact contList = cont.getContact(cont.searchingInfo(userChoice));
				
				// Display the Edit contact for the Contact and get the user's Edits choice
				contList.editContact();
				
				System.out.println("What do you want to Edit Info: ");			
				
				int editUserChoice = sc.nextInt();
				// Update the Contacts name (ContactName)
				if(editUserChoice == 1) {
					System.out.println("Enter the new ContactName of Contacts:");
					String newContact = sc.next();
					contList.setName(newContact);
					
					// Update the Contacts LastName
				}else if(editUserChoice == 2) {
					System.out.println("Enter the new LastName:");
					String newLastName = sc.next();
					contList.setLastName(newLastName);
				
					// Update the new Mobile Number
				}else if(editUserChoice == 3) {
					System.out.println("Enter the new Mobile Number of the Contact:");
					int newMobileNo = sc.nextInt();
					contList.setMobileNo(newMobileNo);
					
					// Update the new email
				}else if(editUserChoice == 4) {
					System.out.println("Ente the new Email:");
					String newEmailId = sc.next();
					contList.setNewEmailId(newEmailId);
					
				
				// Print the Edit contacts  Info
				System.out.println("The updated contact is: " + cont.getContact(userChoice));
				}
				
			}else if(choice == 4) {
				// Ask the user for the mobile number of the Contact they want to delete
				System.out.println("Enter the  mobile number that you want to Delete:");
				long userChoice = sc.nextLong();
				// Get the Contact object form the ContactList using its mobile number
				try {
					Contact contact = cont.getContact(cont.searchingInfo(userChoice));
					// Remove the contact Info from the contactList 
					System.out.println("Your Given  contact information is delete:"+ cont.deleteContact(contact));
				}catch (Exception e)  {
					
					throw new MobileNoNotFoundException("Sorry this  contact is not found");
					
				
				}
			}
				
			

		} while (true);

	}
}
