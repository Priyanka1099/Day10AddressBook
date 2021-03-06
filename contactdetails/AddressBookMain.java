package contactdetails;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class AddressBookMain {
	ArrayList<Contacts> arrayDetails = new ArrayList<Contacts>();;
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, ArrayList<Contacts>> hashmap = new HashMap<>();
	static AddressBookMain Details = new AddressBookMain();

	/**
	 * Purpose - Used "Add-Method" to add details of Person
	 */

	public void addDetails() {
		Scanner sc = new Scanner(System.in);
		Contacts details = new Contacts();
		System.out.println("Enter the first name");
		details.setFirstName(sc.nextLine());
		System.out.println("Enter the last name");
		details.setLastName(sc.nextLine());
		System.out.println("Enter the address");
		details.setAddress(sc.nextLine());
		System.out.println("Enter the city");
		details.setCity(sc.nextLine());
		System.out.println("Enter the state");
		details.setState(sc.nextLine());
		System.out.println("Enter the email");
		details.setEmail(sc.nextLine());
		System.out.println("Enter the zip code");
		details.setZip(sc.nextLong());
		System.out.println("Enter the phone number");
		details.setPhoneNumber(sc.nextLong());
		arrayDetails.add(details);
		System.out.println(arrayDetails);
	}

	/*
	 * Purpose - Used "Edit-Method" to edit the contacts in the array list
	 */

	public void editDetails() {
		System.out.println("Confirm your first name to edit details: ");
		String Name = sc.next();

		for (int i = 0; i < arrayDetails.size(); i++) {
			if (arrayDetails.get(i).getFirstName().equals(Name)) {
				System.out.println("Select form below to change: ");
				System.out.println(
						"\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Mobile number\n8.Email");
				int edit = sc.nextInt();

				switch (edit) {
				case 1:
					System.out.println("Enter first name");
					arrayDetails.get(i).setFirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter Last name");
					arrayDetails.get(i).setLastName(sc.next());
					break;
				case 3:
					System.out.println("Enter Address");
					arrayDetails.get(i).setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter City");
					arrayDetails.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter State");
					arrayDetails.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("Enter Zip");
					arrayDetails.get(i).setZip(sc.nextLong());
					break;
				case 7:
					System.out.println("Enter Mobile number");
					arrayDetails.get(i).setPhoneNumber(sc.nextLong());
					break;
				}
			} else
				System.out.println("Enter a valid First name");
		}
	}

	/*
	 * Purpose - Used "Delete-Details" method to delete the contact details
	 */
	public void deleteDetails() {
		System.out.println("Confirm the first name of the person to delete contact");
		String confirmName = sc.next();
		for (int i = 0; i < arrayDetails.size(); i++) {

			if (arrayDetails.get(i).getFirstName().equals(confirmName)) {

				arrayDetails.remove(i);
			} else {
				System.out.println("Enter valid first name");
			}
		}
	}

	public void createAddressBook() {

		while (true) {
			System.out.println("Choose what you want to do: ");
			System.out.println(
					"1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.exit");
			int choose = sc.nextInt();

			if (choose == 4) {
				System.out.println("Exited");
				break;
			}

			switch (choose) {
			case 1:
				System.out.println("Enter the name of address book: ");
				String address_name = sc.next();

				// condition to check for uniqueness of address book.
				if (hashmap.containsKey(address_name)) {
					System.out.println("Adress book name exits, enter different name");
					break;
				}

				ArrayList<Contacts> new_address_book = new ArrayList<>();
				arrayDetails = new_address_book;
				while (true) {
					System.out.println("Choose what you want to do: ");
					System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
					int choose1 = sc.nextInt();
					if (choose1 == 4) {
						System.out.println("Exited");
						break;
					}
					switch (choose1) {
					case 1:
						Details.addDetails();
						break;
					case 2:
						Details.addDetails();
						break;
					case 3:
						Details.addDetails();
						break;
					default:
						System.out.println("Choose valid option");
						break;
					}
					hashmap.put(address_name, arrayDetails);
					System.out.println(hashmap);
				}
				break;

			case 2:
				System.out.println("Enter the name of address book: ");
				String address_name_old = sc.next();

				// condition to check whether address book exists or no.
				if (hashmap.containsKey(address_name_old)) {

					ArrayList<Contacts> old_address_book = new ArrayList<>();
					arrayDetails = old_address_book;
					arrayDetails = hashmap.get(address_name_old);
					while (true) {
						System.out.println("Choose what you want to do: ");
						System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
						int choose1 = sc.nextInt();
						if (choose1 == 4) {
							System.out.println("Exited");
							break;
						}
						switch (choose1) {
						case 1:
							Details.addDetails();
							break;
						case 2:
							Details.addDetails();
							break;
						case 3:
							Details.addDetails();
							break;
						default:
							System.out.println("Choose valid option");
							break;
						}
						hashmap.put(address_name_old, arrayDetails);
						System.out.println(hashmap);
					}
				} else {
					System.out.println("Enter valid address book name");
				}
				break;

			case 3:
				System.out.println(hashmap);
				break;

			default:
				System.out.println("Enter valid option");

			}
		}
	}
public static void main(String[] args) {
		System.out.println("Welcome to Address Book program ");
		Details.createAddressBook();
}

}
