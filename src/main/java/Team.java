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

    public int getSeed() { //gets seed int of current instance of object team
        return seed;
    }

    public void setSeed(int seed) { //change seed int of current instance of object team
        this.seed = seed;
    }

}

    public static ArrayList makeTeams(ArrayList playerList) {
        Team t;
        for (int i = 0; i < playerList.size() - 1; i++) {

            BlindDraw.teamList.add(t = new Team(playerList.get(i).toString(), playerList.get(i + 1).toString(), 0, 'W'));
            t.setSeed(i + 1);
        }
        return BlindDraw.teamList;
    }
}

