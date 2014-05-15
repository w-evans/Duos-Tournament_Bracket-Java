import java.util.*;

/**
 * Created by wevans on 5/6/14.
 */
public class Team {
    //initial variables for class
    String p1 = "";
    String p2 = "";
    int seed = 0;
    char bracket = 'W';

    public Team() { //object constructor
        this.p1 = "";
        this.p2 = "";
        this.seed = 0;
        this.bracket = 'W';
    }

    public Team(String p1, String p2, int seed, char bracket) { //object constructor
        this.p1 = p1;
        this.p2 = p2;
        this.seed = seed;
        this.bracket = bracket;
    }

    @Override
    public String toString() { // prints out nicely when calling an instance object of Team
        return "{ " + p1 + ", " + p2 + ", " + seed + ", " + bracket + " }";
    }

    public void setSeed(int seed) { //change seed int of current instance of object team
        this.seed = seed;
    }

    public int getSeed() {
        return seed;
    }
}
