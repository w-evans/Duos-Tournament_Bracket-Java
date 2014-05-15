import java.util.ArrayList;

/**
 * Created by 10a16 on 5/13/14.
 */
public class Bracket {
    public static ArrayList<String> playerList = new ArrayList<String>(); //initial list of players
    public static ArrayList<Team> loserList = new ArrayList<Team>(); //stores instances of team objects
    public static ArrayList<Team> teamList = new ArrayList<Team>(); //stores instances of team objects
    public static ArrayList<MatchUp> matchList = new ArrayList<MatchUp>(); //stores matches

        //initial variables for class
        MatchUp m1;
        MatchUp m2;
        char bracket = 'W';

        public Bracket() { //object constructor
            this.m1 = null;
            this.m2 = null;
            this.bracket = 'W';
        }

        public Bracket(MatchUp m1, MatchUp m2, char bracket) { //object constructor
            this.m1 = m1;
            this.m2 = m2;
        }

        public static void RoundOne() {

        }
}
