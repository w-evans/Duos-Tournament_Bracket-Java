import java.util.ArrayList;
/**
 * Created by 10a16 on 5/13/14.
 */
public class WinBracket {

    public static void roundOne(ArrayList teamList) {

        if(teamList.size() == 8) {
            //round 1 ------------------------------------------------------------

            //match W1
            //team 1/team 2
            MatchUp.doBattle(Bracket.teamList.get(0), Bracket.teamList.get(1));

            //match W2
            //team 3/team 4
            MatchUp.doBattle(Bracket.teamList.get(2), Bracket.teamList.get(3));

            //match W3
            //team 5/team 6
            MatchUp.doBattle(Bracket.teamList.get(4), Bracket.teamList.get(5));

            //match W4
            //team7/team8
            MatchUp.doBattle(Bracket.teamList.get(6), Bracket.teamList.get(7));
        }
    }

    public static void roundTwo(ArrayList teamList) {

        if(teamList.size() == 4) {

            //match W5
            //winner of w1 + w2
            MatchUp.doBattle(Bracket.teamList.get(0), Bracket.teamList.get(1));

            //match W6
            //winner of W3 + W4
            MatchUp.doBattle(Bracket.teamList.get(2), Bracket.teamList.get(3));
        }
    }

    public static void roundThree(ArrayList teamList) {

        if(teamList.size() == 2) {

            //match W7
            //winner of W5 & W6
            MatchUp.doBattle(Bracket.teamList.get(0), Bracket.teamList.get(1));
        }
    }

    public static void roundFour(ArrayList teamList) {
        if(teamList.size() == 2) {

            //match W8
            //winner of W7 & winner of L6
            MatchUp.doBattle(Bracket.teamList.get(0), Bracket.teamList.get(1));
        }
    }
}
