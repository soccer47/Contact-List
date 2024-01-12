public class Student extends Person{
    private int grade;

    public Student (String firstName, String lastName, String phoneNumber, int theGrade){
        super(firstName, lastName, phoneNumber);
        grade = theGrade;
    }

    public int getGrade(){
        return grade;
    }

    @Override
    public String toString(){
        return super.toString() + " Grade: " + grade;
    }
}
