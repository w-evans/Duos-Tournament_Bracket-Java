import java.util.*;
import java.util.Collections;

/**
 * Created by wevans on 5/6/14.
 */
public class Team {

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
    public String toString() { // prints out more pretty like when calling an instance object of Team
        return "{ " + p1 + ", " + p2 + ", " + seed + ", " + bracket + " }";
    }

    public void setSeed(int seed) { //change seed int of current instance of object team
        this.seed = seed;
    }

    public static ArrayList makeTeams(ArrayList playerList) {
        Team t;
        int count = 1;

        for (int i = 1; i < playerList.size(); i += 2) {
            BlindDraw.teamList.add(t = new Team(playerList.get(i - 1).toString(), playerList.get(i).toString(), 0, 'W'));

            t.setSeed(count);
            count = count + 1;
        }
        return BlindDraw.teamList;
    }
}

