// Stevie K Halprin, 1/13/2024
// This code creates a contact list that can hold People, students and soccer fans

import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    // Instance variables
    private ArrayList<Person> contacts;

    public ContactList(){
        // Initializes contacts as a new ArrayList of type Person
        contacts = new ArrayList<Person>();
    }

    public static void main(String[] args){
        // Creates new contact list object and runs the code to prompt the user for input
        ContactList s = new ContactList();
        s.run();
    }

    public ArrayList<Person> getContacts(){
        // Returns the contacts in contact list
        return contacts;
    }

    public void addContact(Person newContact){
        contacts.add(newContact);
    }

    public void printContacts(){
        // Loops through every person in contacts and prints each object
        for (Person p : contacts){
            // If Person p is a Student, print their grade as well
            if (p instanceof Student){
                System.out.println((Student)p);
            }
            // If Person p is a Soccer Fan, print their favorite soccer team as well
            else if (p instanceof SoccerFan){
                System.out.println((SoccerFan)p);
            }
            // Otherwise, just print their regular information
            else {
                System.out.println(p);
            }
        }
    }

    // Sorts contacts depending on the input of the user
    public void sort(int sortBy){
        // If sortBy is equal to 0, sort contacts alphabetically by the first name of the contacts
        if (sortBy == 0){
            // Uses bubble sort to compare the first names of every contact
            for (int i = 0; i < contacts.size() - 1; i++){
                for (int j = 0; j < contacts.size() - 1 - i; j++) {
                    String first = contacts.get(j).getFirstName();
                    String second = contacts.get(j + 1).getFirstName();
                    Person p = new Person();
                    // If the 1st first name comes before the 2nd first name, swap their order
                    if (first.compareTo(second) > 0){
                        p = contacts.get(j + 1);
                        contacts.set(j + 1, contacts.get(j));
                        contacts.set(j, p);
                    }
                }
            }
        }
        // If sortBy is equal to 1, sort contacts alphabetically by the last name of the contacts
        else if (sortBy == 1){
            // Uses bubble sort to compare the last names of every contact
            for (int i = 0; i < contacts.size() - 1; i++){
                for (int j = 0; j < contacts.size() - 1 - i; j++) {
                    String first = contacts.get(j).getLastName();
                    String second = contacts.get(j + 1).getLastName();
                    Person p = new Person();
                    // If the 1st last name comes before the 2nd last name, swap their order
                    if (first.compareTo(second) > 0){
                        p = contacts.get(j + 1);
                        contacts.set(j + 1, contacts.get(j));
                        contacts.set(j, p);
                    }
                }
            }
        }
        // If sortBy is equal to 2, sort contacts by the phone number of the contacts
        else if (sortBy == 2){
            // Uses bubble sort to compare the phone number of every contact
            for (int i = 0; i < contacts.size() - 1; i++){
                for (int j = 0; j < contacts.size() - 1 - i; j++) {
                    String first = contacts.get(j).getPhoneNumber();
                    String second = contacts.get(j + 1).getPhoneNumber();
                    Person p = new Person();
                    // If the 1st number comes before the 2nd number, swap their order
                    if (first.compareTo(second) > 0){
                        p = contacts.get(j + 1);
                        contacts.set(j + 1, contacts.get(j));
                        contacts.set(j, p);
                    }
                }
            }
        }
    }

    // Searches contacts by first name, returns the searched for contact if it's in the list
    public Person searchByFirstName(String firstName){
        // Goes through contacts, checking if the searched for value is in the list
        for (Person p : contacts){
            if (p.getFirstName().equals(firstName)){
                if (p instanceof Student){
                    return ((Student)p);
                }
                else if (p instanceof SoccerFan){
                    return ((SoccerFan)p);
                }
                else {
                    return p;
                }
            }
        }
        // Returns null if the name isn't in the list
        return null;
    }

    // Searches contacts by last name, returns the searched for contact if it's in the list
    public Person searchByLastName(String lastName) {
        // Goes through contacts, checking if the searched for value is in the list
        for (Person p : contacts) {
            if (p.getLastName().equals(lastName)) {
                if (p instanceof Student) {
                    return ((Student) p);
                }
                else if (p instanceof SoccerFan) {
                    return ((SoccerFan) p);
                }
                else {
                    return p;
                }
            }
        }
        // Returns null if the name isn't in the list
        return null;
    }

    // Searches contacts by phone number, returns the searched for contact if it's in the list
    public Person searchByPhoneNumber(String phoneNumber){
        // Goes through contacts, checking if the searched for value is in the list
        for (Person p : contacts){
            if (p.getPhoneNumber().equals(phoneNumber)){
                if (p instanceof Student){
                    return ((Student)p);
                }
                else if (p instanceof SoccerFan){
                    return ((SoccerFan)p);
                }
                else {
                    return p;
                }
            }
        }
        // Returns null if the number isn't in the list
        return null;
    }

    // Prints all the people who are Students in contacts
    public void listStudents(){
        // Loops through contacts, if the person is a student then print their information
        for (Person p : contacts){
            if (p instanceof Student){
                System.out.println((Student)p);
            }
        }
    }

    public void run(){
        // Prints the menu of the user's input options
        printMenu();
        // Creates a new Scanner
        Scanner s = new Scanner(System.in);
        int input = -1;
        // Prompts the user for input until they input 0
        while (input != 0){
            // Gets user input
            input = s.nextInt();
            // If the user types 1, get a new contact
            if (input == 1){
                getNewContact();
            }
            // If the user types 2, 3, or 4, sort by first name, last name, or phone number
            // and print contacts
            else if (input == 2 || input == 3 || input == 4){
                sort(input - 2);
                printContacts();
            }
            // If the user types 5, list all the students in contacts
            else if (input == 5){
                listStudents();
            }
            // If the user types 6, 7, or 8, search through contacts for the given first name,
            // last name, or phone number
            else if (input == 6 || input == 7 || input == 8){
                String nameOrNum;
                if (input == 8){
                    System.out.println("Enter a phone number:");
                }
                else {
                    System.out.println("Enter a name:");
                }
                s.nextLine();
                nameOrNum = s.nextLine();
                // If the user types 6, search for the given first name in contacts
                if (input == 6){
                    if (searchByFirstName(nameOrNum) != null){
                        System.out.print(searchByFirstName(nameOrNum) + "\n");
                    }
                    else {
                        System.out.println(nameOrNum + " is not in the list.\n");
                    }

                }
                // If the user types 7, search for the given last name in contacts
                else if (input == 7){
                    if (searchByLastName(nameOrNum) != null){
                        System.out.print(searchByLastName(nameOrNum) + "\n");
                    }
                    else {
                        System.out.println(nameOrNum + " is not in the list.\n");
                    }

                }
                // Otherwise, if the user types 8, search for the given number in contacts
                else {
                    if (searchByPhoneNumber(nameOrNum) != null){
                        System.out.print(searchByPhoneNumber(nameOrNum) + "\n");
                    }
                    else {
                        System.out.println(nameOrNum + " is not in the list.\n");
                    }

                }
            }
        }
    }

    public void printMenu(){
        // Prints the input menu of the user's input options
        System.out.println("Menu:\n" +
                "1. Add Contact\n" +
                "2. List All Contacts By First Name\n" +
                "3. List All Contacts By Last Name\n" +
                "4. List All Contacts By Phone Number\n" +
                "5. List All Students\n" +
                "6. Search By First Name\n" +
                "7. Search By Last Name\n" +
                "8. Search By Phone Number\n" +
                "0. Exit\n");
    }

    // Prompts the user for the information for a new contact
    public void getNewContact(){
        // Creates a new Scanner
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first name:");
        s.nextLine();
        String nameFirst = s.nextLine();
        System.out.println("Enter last name:");
        String nameLast = s.nextLine();
        System.out.println("Enter phone number:");
        String number = s.nextLine();

        // Gets the type of the contact from the user
        System.out.println("Enter contact type:\n" +
                "1. Regular Person\n" +
                "2. Student\n" +
                "3. Soccer Fan");
        int type = 0;
        type = s.nextInt();
        s.nextLine();
        while (type != 1 && type != 2 && type != 3){
            type = s.nextInt();
        }

        if (type == 1){
            Person guy = new Person(nameFirst, nameLast, number);
            // Adds the new contact to the list
            contacts.add(guy);
            System.out.println("New contact added to list:\n" + guy);
        }
        else if (type == 2){
            // Prompts the user for the contact's grade
            System.out.println("Enter grade:");
            int grade = s.nextInt();
            Student stud = new Student(nameFirst, nameLast, number, grade);
            // Adds the new contact to the list
            contacts.add(stud);
            System.out.println("New contact added to list:\n" + stud);
        }
        else {
            // Prompts the user for the contact's favorite soccer team
            System.out.println("Enter favorite soccer team:");
            String team = s.nextLine();
            SoccerFan fan = new SoccerFan(nameFirst, nameLast, number, team);
            // Adds the new contact to the list
            contacts.add(fan);
            System.out.println("New contact added to list:\n" + fan);
        }
    }
}
