import java.util.ArrayList;
/**
 * Created by 10a16 on 5/13/14.
 */
public class WinBracket {

    public static void roundOne(ArrayList teamList) {

        if(teamList.size() == 8) {
            //first round:

            //winners bracket

            //match W1
            //team 1/team 2
            MatchUp.doBattle(Bracket.teamList.get(0), Bracket.teamList.get(1));

            //match W2
            //team 3/team 4                                                                                                //merge
            MatchUp.doBattle(Bracket.teamList.get(2), Bracket.teamList.get(3));                                            //match W7                      //match W8
                                                                                       //winner of W5/winner W6            //winner of L6/winner W7
            //match W3
            //team 5/team 6
            MatchUp.doBattle(Bracket.teamList.get(4), Bracket.teamList.get(5));

            //match W4
            //team7/team8
            MatchUp.doBattle(Bracket.teamList.get(6), Bracket.teamList.get(7));


            //round 2

            //match W5
            //winner of t1/t2 + t3/4
            MatchUp.doBattle(Bracket.teamList.get(0), Bracket.teamList.get(1));

            //match W6
            //winner of W3 + W4


        }
    }
}
