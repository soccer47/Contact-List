// Stevie K Halprin
public class Student extends Person{
    // Instance variables
    private int grade;

    // Constructor
    public Student (String firstName, String lastName, String phoneNumber, int theGrade){
        // Creates new superclass (Person) object
        super(firstName, lastName, phoneNumber);
        // Initializes grade
        grade = theGrade;
    }

    // Getters and Setters

    // Returns grade
    public int getGrade(){
        return grade;
    }

    // Overrides superclass toString() Method, returns same information and grade
    @Override
    public String toString(){
        return super.toString() + " Grade: " + grade;
    }
}
