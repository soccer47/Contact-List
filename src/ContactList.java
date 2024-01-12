import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<Person> contacts;

    public ContactList(){
        contacts = new ArrayList<Person>();
    }

    public ArrayList<Person> getContacts(){
        return contacts;
    }

    public void addContact(Person newContact){
        contacts.add(newContact);
    }

    public void printContacts(){
        for (Person p : contacts){
            System.out.println(p);
        }
    }

    public void sort(int sortBy){
        if (sortBy == 0){
            for (){
                String first = contacts.get(i).getFirstName().substring(0, 1);
                String second = contacts.get(0).getFirstName().substring(0, 1);
                if (first.compareTo(second) <= 0){
                    contacts.add(0, contacts.remove(i));
                }
            }
        }
        else if (sortBy == 1){

        }
        else if (sortBy == 2){

        }
    }

    public void searchByFirstName(String firstName){

    }

    public void searchByLastName(String lastName){

    }

    public void searchByPhoneNumber(String phoneNumber){

    }

    public void listStudents(){
        for (Person p : contacts){
            if (p instanceof Student){
                System.out.println(p);
            }
        }
    }





}
