package com.addressbook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class AdreessBookList extends AddressBook {

	public void addNewAddressbook(Scanner scanner) {
		 HashMap<String, LinkedList<Contact>> newaddressBook = new HashMap<String, LinkedList<Contact>>();
		boolean isAreadyExist = false;
		while (!isAreadyExist) {
			System.out.println("Choose what you want to do: ");
			System.out.println(
					"1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.exit");
			String choose = scanner.nextLine();

			switch (choose) {
			case "1":
				System.out.println("Enter the name of the new address book: ");
				String adressBookName = scanner.nextLine();
				boolean isExist = false;
				while (!isExist) {
					System.out.println("Select the option from below");
					if (addressBook.isEmpty()) {
						System.out.println("1. Add Contact" + "\n5. Exit");
					} else {
						System.out.println("1. Add Contact" + "\n2. Display Contact\n3. Edit Contact"
								+ "\n4. Delete Contact\n5. Exit");

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
						isExist = true;
						showContacts();
						break;

					default:
						System.out.println("Invalid option choosed.");
						break;
					}
					newaddressBook.put(adressBookName, addressBook);

				}
			case "3":
				System.out.println(newaddressBook);

			}

		}
	}
}
