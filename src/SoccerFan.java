// Stevie K Halprin
public class SoccerFan extends Person{
    // Instance variables
    private String favoriteTeam;

    // Constructor
    public SoccerFan (String firstName, String lastName, String phoneNumber, String team){
        // Creates new superclass (Person) object
        super(firstName, lastName, phoneNumber);
        // Initializes favorite team
        favoriteTeam = team;
    }

    // Getters and Setters

    // Returns favorite team
    public String getFavoriteTeam(){
        return favoriteTeam;
    }

    // Overrides superclass toString() Method, returns same information and favorite team
    @Override
    public String toString(){
        return super.toString() + " Favorite Team: " + favoriteTeam;
    }
}
