// Stevie K Halprin
public class Person {
    // Instance variables
    private String firstName;
    private String lastName;
    private String phoneNumber;

    // Constructor
    public Person(String theFirstName, String theLastName, String number){
        // Initializes first name, last name, and phone number
        firstName = theFirstName;
        lastName = theLastName;
        phoneNumber = number;
    }

    // Default constructor, sets all values to 0/empty
    public Person(){
        firstName = "";
        lastName = "";
        phoneNumber = "";
    }

    // Getters and Setters

    // Returns first name
    public String getFirstName(){
        return firstName;
    }

    // Retuns last name
    public String getLastName(){
        return lastName;
    }

    // Returns phone number
    public String getPhoneNumber(){
        return phoneNumber;
    }

    // Returns information
    public String toString(){
        return firstName + " " + lastName + " - #" + phoneNumber;
    }

}
