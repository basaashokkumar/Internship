package com.company;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ContactApplication mobilePhone = new ContactApplication("9458621512");

    public static void main(String[] args) {

        boolean quite = false;
        startPhone();
        contactMenu();
        while(!quite) {
            System.out.println("Enter values from 1 to 6 ");
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 0:
                    System.out.println("\n Shuting down .. ");
                    quite = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
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
                    queryContact();
                    break;
                case 6:
                    contactMenu();
                    break;


            }



        }

    }
    private static void addNewContact() {
        System.out.println("Enter new Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone Number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New Contact Added: name = "+ name + " , phone" + phone );
        }else {
            System.out.println("Can't add, " + name +" already on file");
        }
    }


    private static void updateContact() {
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();
        Contacts extContact = mobilePhone.queryContact(name);
        if(extContact == null)
        {
            System.out.println("Cannot found contact");
            return;
        }

        System.out.println("Enter new Conatct Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Phone Number: ");
        String newNumber = scanner.nextLine();

        Contacts newContact = Contacts.createContact(newName, newNumber);
        if(mobilePhone.updateContact(extContact, newContact))
        {
            System.out.println("Successfully updated");
        }else {
            System.out.println("Error Updating Contact");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();
        Contacts extContact = mobilePhone.queryContact(name);
        if(extContact == null)
        {
            System.out.println("Cannot found contact");
            return;
        }

        if(mobilePhone.removeContact(extContact)) {
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error Deleting Contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();
        Contacts extContact = mobilePhone.queryContact(name);
        if(extContact == null)
        {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name : " + extContact.getName() +
                " Phone Number is: " + extContact.getPhoneNumber());
    }


    private static void startPhone() {
        System.out.println("Starting Phone . . .");
    }

    private static void contactMenu() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutDown\n" +
                "1 - to display contacts\n"+
                "2 - to add a new contact into the Arraylist\n"+
                "3 - to update an existing contact \n"+
                "4 - to remove the existing contact from the list\n"+
                "5 - query for searching an existing contact\n"+
                "6 - to print a list of available actions.");
        System.out.println("Choose Your Option: ");
    }

}