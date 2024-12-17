package com.contact;

import java.util.Scanner;

public class Contact{

	private String name;
	private String lastName;
	private long mobileNo;
	private String emailId;
		private String newName;
		private String newLastName;
		private long newMobileNo;
		private String newEmailId;

	public Contact(String name, String lastName, long mobileNo, String emailId,String newName,String newLastName, long newMobileNo,
			String newEmailId) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.newName = newName;
		this.newLastName = newLastName;
		this.newMobileNo = newMobileNo;
		this.newEmailId = newEmailId;
	}

	public Contact() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	
	public String getNewLastName() {
		return newLastName;
	}

	
	public void setNewLastName(String newLastName) {
		this.newLastName = newLastName;
	}

	
	public long getNewMobileNo() {
		return newMobileNo;
	}

	
	public void setNewMobileNo(long newMobileNo) {
		this.newMobileNo = newMobileNo;
	}

	
	public String getNewEmailId() {
		return newEmailId;
	}

	
	public void setNewEmailId(String newEmailId) {
		this.newEmailId = newEmailId;
	}


	// Create an object of Scanner class to take input from user
	Scanner sc = new Scanner(System.in);

	// method to Display contact Info

	public void showContact() {
		System.out.println("Enter your Contact name:");
		this.name = sc.nextLine();
		System.out.println("Enter your contact lastName:");
		this.lastName = sc.nextLine();
		System.out.println("Enter your MobileNumber:");
		this.mobileNo = sc.nextLong();
		System.out.println("Enter your emailId:");
		this.emailId = sc.next();
	}

	public void editContact() {
		System.out.println("To edit the ContactName:");

		System.out.println("To edit the LastName:");

		System.out.println("To edit the MobileNumber:");

		System.out.println("To edit the EmailId:");

	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", lastName=" + lastName + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", newName=" + newName + ", newLastName=" + newLastName + ", newMobileNo=" + newMobileNo
				+ ", newEmailId=" + newEmailId + "]";
	}


	
}
