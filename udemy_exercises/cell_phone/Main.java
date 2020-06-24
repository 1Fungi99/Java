package udemy_exercises.cell_phone;

import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static CellPhone cellPhone = new CellPhone("213 864 5887");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter Action: (6 to show available actions)");
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    break;
                case 1:
                    cellPhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name:");
        String name = s.nextLine();
        System.out.println("Enter Phone #: ");
        String phone = s.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (cellPhone.addNewContact(newContact)) {
            System.out.println("newContact added: " + name + " => " + phone);
        } else {
            System.out.println("Cannot add " + name + ". Reason: Contact already exists");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found...");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = s.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = s.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (cellPhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found...");
            return;
        }
        if (cellPhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted contact");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void searchContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found...");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " Phone #: " + existingContactRecord.getNum());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvaliable actions:\npress\n" + "0 - Shutdown Phone\n" + "1 - Show contacts\n"
                + "2 - Add a new contact\n" + "3 - Update an existing contact\n" + "4 - Remove existing contact\n"
                + "5 - Search for existing contact\n" + "6 - See all contacts");
        System.out.println("Choose your action: ");
    }
}