import java.util.ArrayList;
/**
 * Created by 10a16 on 5/13/14.
 */
public class LoserBracket {

    public static void RoundOne(ArrayList loserList) {

        //4 teams in winners, 4 in losers
        if(Bracket.teamList.size() == 4 && Bracket.loserList.size() == 4) {

        //match L1
        //loser of match W1/loser of match W2
        MatchUp.doBattle(Bracket.loserList.get(0), Bracket.loserList.get(1));
         //winner gets seed of 1
         //loser eliminated

        //match L2
        //loser of match W3/loser of match W4
        MatchUp.doBattle(Bracket.loserList.get(2), Bracket.loserList.get(3));
        //winner gets seed of 3
        //loser eliminated

        }
    }

    public static void RoundTwo(ArrayList loserList) {

        if(Bracket.teamList.size() == 2 && Bracket.loserList.size() == 4) { //2 teams eliminated, 2 in winners, 4 in losers

            //match L3
            //loser match W5/winner match L1
            //seeds 1 & 2
            MatchUp.doBattle(Bracket.loserList.get(0), Bracket.loserList.get(1));
            //winner gets seed of 1


            //match L4
            //loser match w6/winner match L2
            //seeds 3 & 4
            MatchUp.doBattle(Bracket.loserList.get(2), Bracket.loserList.get(3));
            //winner gets seed of 2

        }

    }

    public static void RoundThree(ArrayList loserList) {
        if(Bracket.loserList.size() == 2 && Bracket.teamList.size() == 1) { // 4 teams eliminated, 1 in winners, 2 in losers

            //match L5
            //winner of L3 and winner L4
            //seeds 1 & 2
            MatchUp.doBattle(Bracket.loserList.get(0), Bracket.loserList.get(1));
            //winner gets seed of 1
        }

    }

    public static void RoundFour(ArrayList loserList) {
        if(Bracket.loserList.size() == 2 && Bracket.teamList.size() == 1) { // 5 teams eliminated, 2 in losers, 1 in winners

            //match L6
            //loser W7/winner L5
            //seeds 1 & 2
            MatchUp.doBattle(Bracket.loserList.get(0), Bracket.loserList.get(0));
            //winner goes to final match
        }
    }
}
