public class SoccerFan extends Person{
    private String favoriteTeam;

    public SoccerFan (String firstName, String lastName, String phoneNumber, String team){
        super(firstName, lastName, phoneNumber);
        favoriteTeam = team;
    }

    public String getFavoriteTeam(){
        return favoriteTeam;
    }

    @Override
    public String toString(){
        return super.toString() + " Favorite Team: " + favoriteTeam;
    }
}
