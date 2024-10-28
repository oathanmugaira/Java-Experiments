// Aim: Create a simple Java application to manage a contact list using the
// Vector class. The application should allow users to perform the
// following operations:
// 1. Add a Contact: Add a new contact with a name and phone
// number.
// 2. Remove a Contact: Remove a contact by name.
// 3. Display All Contacts: Show all contacts in the list.
// 4. Search for a Contact: Search for a contact by name.
// Name: Pathan Mugaira
// UIN: 231P084
import java.util.Scanner;
import java.util.Vector;
class Contact {
String name;
String phoneNumber;
public Contact(String name, String phoneNumber) {
this.name = name;
this.phoneNumber = phoneNumber;
}
@Override
public String toString() {
return "Name: " + name + ", Phone: " + phoneNumber;
}
}
public class ContactListApp {
private Vector<Contact> contacts = new Vector<>();
public void addContact(String name, String phoneNumber) {
contacts.add(new Contact(name, phoneNumber));
System.out.println("Contact added successfully.");
}
public void removeContact(String name) {
for (Contact contact : contacts) {
if (contact.name.equalsIgnoreCase(name)) {
contacts.remove(contact);
System.out.println("Contact removed successfully.");
return;
}
}
System.out.println("Contact not found.");
}
public void displayContacts() {
if (contacts.isEmpty()) {
System.out.println("No contacts found.");
} else {
System.out.println("Contact List:");
for (Contact contact : contacts) {
System.out.println(contact);
}
}
}
public void searchContact(String name) {
for (Contact contact : contacts) {
if (contact.name.equalsIgnoreCase(name)) {
System.out.println("Contact found: " + contact);
return;
}
}
System.out.println("Contact not found.");
}
public static void main(String[] args) {
ContactListApp app = new ContactListApp();
Scanner scanner = new Scanner(System.in);
int choice;
do {
System.out.println("\nContact List Menu:");
System.out.println("1. Add Contact");
System.out.println("2. Remove Contact");
System.out.println("3. Display All Contacts");
System.out.println("4. Search Contact");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
choice = scanner.nextInt();
scanner.nextLine();
switch (choice) {
case 1:
System.out.print("Enter name: ");
String name = scanner.nextLine();
System.out.print("Enter phone number: ");
String phoneNumber = scanner.nextLine();
app.addContact(name, phoneNumber);
break;
case 2:
System.out.print("Enter the name of the contact to remove: ");
String removeName = scanner.nextLine();
app.removeContact(removeName);
break;
case 3:
app.displayContacts();
break;
case 4:
System.out.print("Enter the name of the contact to search: ");
String searchName = scanner.nextLine();
app.searchContact(searchName);
break;
case 5:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice. Please try again.");
}
} while (choice != 5);
scanner.close();
}
}