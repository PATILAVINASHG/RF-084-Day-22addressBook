package com.addressbook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	static AdreessBookList ob1;
	static LinkedList<Contact> addressBook;
	static HashMap<String, LinkedList<Contact>> newaddressBook;

	public static void main(String[] args) {
		ob1 = new AdreessBookList();
		addressBook = new LinkedList<Contact>();
		newaddressBook = new HashMap<String, LinkedList<Contact>>();
		Scanner scanner = new Scanner(System.in);
		boolean isExit = false;
		while (!isExit) {

			System.out.println("Welcome to the Address book, Manage your contacts " + "with the Address book");

			System.out.println("Select the option from below");

			if (addressBook.isEmpty()) {
				System.out.println("1. Add Contact\n5. addnewAddressBook" +"\n6. Exit");
			} else {
				System.out.println("1. Add Contact" + "\n2. Display Contact\n3. Edit Contact"
						+ "\n4. Delete Contact\n5. addnewAddressBook" + "\n6.Exit ");

			}
			String option = scanner.nextLine();

			switch (option) {
			case "1":
				addContact(scanner);
				break;

			case "2":
				showContacts();
				break;

			case "3":
				editContact(scanner);
				break;

			case "4":
				deleteContact(scanner);
				break;

			case "5":
				ob1.addNewAddressbook(scanner);

				break;
			case "6":
				isExit = true;
				showContacts();
				break;

			default:
				System.out.println("Invalid option choosed.");
				break;
			}

		}
	}

	public static void deleteContact(Scanner scanner) {
		System.out.println("Which contact you want to Delete? (Enter the First name)");
		String firstName = scanner.nextLine();
		Contact deleteContact = null;
		for (int i = 0; i < addressBook.size(); i++) {

			if (firstName.equals(addressBook.get(i).getFirstName())) {

				deleteContact = addressBook.remove(i);
				if (deleteContact == null) {
					System.out.println("No contact found with name " + firstName + ".");
				} else {
					System.out.println(
							deleteContact.getFirstName() + "'s contact has been removed from your Address Book.");
				}
			}
		}
	}

	public static void editContact(Scanner scanner) {

		System.out.println("Which contact you want to Edit? (Enter the First name)");
		String firstName = scanner.nextLine();

		Contact editContact = null;
		for (int i = 0; i < addressBook.size(); i++) {
			if (firstName.equals(addressBook.get(i).getFirstName())) {
				editContact = addressBook.get(i);

				if (editContact == null) {
					System.out.println("No contact found with name " + firstName + ".");
				} else {
					editContactDetails(editContact, scanner);
				}
			}
		}
	}

	public static void editContactDetails(Contact editContact, Scanner scanner) {

		System.out.println("Enter First Name: ");
		String firstName = scanner.nextLine();
		editContact.setFirstName(firstName);
		System.out.println("Enter last Name: ");
		String lastName = scanner.nextLine();
		editContact.setLastName(lastName);

		System.out.println("Enter EmailID: ");
		String email = scanner.nextLine();
		editContact.setEmail(email);

		System.out.println("Enter the Mobile Number: ");
		String number = scanner.nextLine();
		editContact.setPhoneNumber(number);

		System.out.println("Enter  the State : ");
		String state = scanner.nextLine();
		editContact.setState(state);

		System.out.println("Enter  the City : ");
		String city = scanner.nextLine();
		editContact.setCity(city);

		System.out.println("Enter  the PinCode : ");
		String pincode = scanner.nextLine();
		editContact.setPincode(pincode);

		System.out.println("Enter  the address : ");
		String address = scanner.nextLine();
		editContact.setAddress(address);
		addressBook.add(editContact);
		System.out.println("Contact has been edited.");

	}

	public static void showContacts() {
		if (addressBook.isEmpty()) {
			System.out.println("Address book is empty.");
		} else {
			for (Contact contact : addressBook) {
				System.out.println(contact);
			}
		}
	}

	public static void addContact(Scanner scanner) {
		Contact contact = new Contact();

		System.out.println("Enter First Name: ");
		String firstName = scanner.nextLine();
		contact.setFirstName(firstName);

		System.out.println("Enter last Name: ");
		String lastName = scanner.nextLine();
		contact.setLastName(lastName);

		System.out.println("Enter EmailID: ");
		String email = scanner.nextLine();
		contact.setEmail(email);

		System.out.println("Enter the Mobile Number: ");
		String number = scanner.nextLine();
		contact.setPhoneNumber(number);

		System.out.println("Enter  the State : ");
		String state = scanner.nextLine();
		contact.setState(state);

		System.out.println("Enter  the City : ");
		String city = scanner.nextLine();
		contact.setCity(city);

		System.out.println("Enter  the PinCode : ");
		String pincode = scanner.nextLine();
		contact.setPincode(pincode);

		System.out.println("Enter  the address : ");
		String address = scanner.nextLine();
		contact.setAddress(address);
		addressBook.add(contact);
		System.out.println("Contact has been saved.");
	}
	

	
}