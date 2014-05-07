import java.util.*;

/**
 * Created by wevans on 5/6/14.
 */
public class Team {

    //initialize our variables for the class
    String p1 = "";
    String p2 = "";
    int seed = 0;
    char bracket = 'W';

    //creates array to hold our objects (teams)
    public static ArrayList<Team> list = new ArrayList<Team>();

    public Team() {
        this.p1 = "";
        this.p2 = "";
        this.seed = 0;
        this.bracket = 'W';
    }

    public Team(String p1, String p2, int seed, char bracket) {
        this.p1 = p1;
        this.p2 = p2;
        this.seed = seed;
        this.bracket = bracket;
    }

    @Override
    public String toString() {
        return "{ " + p1 + ", " + p2 + ", " + seed + ", " + bracket + " }";
    }

    public static void makeTeam(String p1, String p2) {
        list.add(new Team(p1, p2, 0, 'W')); //adds a team to the arraylist
    }

}

