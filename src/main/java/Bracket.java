import java.util.ArrayList;

/**
 * Created by 10a16 on 5/13/14.
 */
public class Bracket {
    public static ArrayList<String> playerList = new ArrayList<String>(); //initial list of players
    public static ArrayList<Team> loserList = new ArrayList<Team>(); //stores instances of team objects
    public static ArrayList<Team> teamList = new ArrayList<Team>(); //stores instances of team objects
    public static ArrayList<MatchUp> matchList = new ArrayList<MatchUp>(); //stores matches
    public static int roundCount = 1;

        public static void RoundWB() { //creates matchUps based on size of teamList for round 1
            System.out.println("Round " + roundCount + " Starting");
            for(int i = 1; i < teamList.size(); i += 2) {
                MatchUp.doBattle(teamList.get(i - 1), teamList.get(i));
                i--;
            }
            for (int i = 0; i < teamList.size(); i++) { //changes seeds after round for winners bracket
                teamList.get(i).setSeed(i + 1);
            }
            for (int i = 0; i < loserList.size(); i++) { //changes seeds after round for losers bracket
                loserList.get(i).setSeed(i + 1);
            }
            if(teamList.size() == 1 && loserList.size() == 1) { //starts final match
                System.out.println("Final Match starting: ");
                loserList.get(0).setSeed(2);
                MatchUp.doBattle(teamList.get(0), loserList.get(0));
            }
            if(teamList.size() == 1 && loserList.size() == 0) {
                System.out.println(teamList.get(0) + " wins!");
            }

        }
    public static void RoundLB() {
        System.out.println("Losers Bracket: Round " + roundCount + " Starting");
        roundCount++;

        for(int i = 1; i < loserList.size(); i += 2) {
            MatchUp.doBattleLBracket(loserList.get(i - 1), loserList.get(i));
            i--;
        }
        for (int i = 0; i < loserList.size(); i++) { //changes seeds after round for losers bracket
            loserList.get(i).setSeed(i + 1);
        }

        if(teamList.size() == 1 && loserList.size() == 1) {
            System.out.println("Final Match starting: ");
            MatchUp.doBattleFinal(teamList.get(0), loserList.get(0));
        }
    }
}
