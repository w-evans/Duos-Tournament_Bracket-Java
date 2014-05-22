import java.util.ArrayList;
/**
 * Created by 10a16 on 5/13/14.
 */
public class LoserBracket {

    public static void roundOne(ArrayList loserList) {

        System.out.println("Loser's Bracket: Round 1 Starting:");

        //4 teams in winners, 4 in losers
        if(Bracket.teamList.size() == 4 && Bracket.loserList.size() == 4) {

        //match L1
        //loser of match W1/loser of match W2
        //seeds 1 & 2
        System.out.println("Match L1");
        MatchUp.doBattleLBracket(Bracket.loserList.get(0), Bracket.loserList.get(1));
         Bracket.loserList.get(0).setSeed(1); //winner gets seed of 1
         //loser eliminated

        //match L2
        //loser of match W3/loser of match W4
        //seeds 3 & 4
        System.out.println("Match L2");
        MatchUp.doBattleLBracket(Bracket.loserList.get(1), Bracket.loserList.get(2));
        //winner gets seed of 3
        Bracket.loserList.get(1).setSeed(3);
        //loser eliminated


            Team.bubbleSort(Bracket.teamList);
            Team.bubbleSortL(Bracket.loserList);
        }
    }

    public static void roundTwo(ArrayList loserList) {

        System.out.println("Loser's Bracket: Round 2 Starting:");

        if(Bracket.teamList.size() == 2 && Bracket.loserList.size() == 4) { //2 teams eliminated, 2 in winners, 4 in losers

            //match L3
            //loser match W5/winner match L1
            //seeds 1 & 2
            System.out.println("Match L3");
            MatchUp.doBattleLBracket(Bracket.loserList.get(0), Bracket.loserList.get(1));
            Bracket.loserList.get(0).setSeed(1); //winner gets seed of 1

            //match L4
            //loser match w6/winner match L2
            //seeds 3 & 4
            System.out.println("Match L4");
            MatchUp.doBattleLBracket(Bracket.loserList.get(1), Bracket.loserList.get(2));
            Bracket.loserList.get(1).setSeed(2); //winner gets seed of 2

            Team.bubbleSort(Bracket.teamList);
            Team.bubbleSortL(Bracket.loserList);
        }

    }

    public static void roundThree(ArrayList loserList) {

        System.out.println("Loser's Bracket: Round 3 Starting:");

        if(Bracket.loserList.size() == 2 && Bracket.teamList.size() == 2) { // 4 teams eliminated, 2 in winners, 2 in losers

            //match L5
            //winner of L3 and winner L4
            //seeds 1 & 2
            MatchUp.doBattleLBracket(Bracket.loserList.get(0), Bracket.loserList.get(1));
            Bracket.loserList.get(0).setSeed(1);//winner gets seed of 1
        }

    }

    public static void roundFour(ArrayList loserList) {

        System.out.println("Loser's Bracket: Round 4 Starting:");

        if(Bracket.loserList.size() == 2 && Bracket.teamList.size() == 1) { // 5 teams eliminated, 2 in losers, 1 in winners

            //match L6
            //loser W7/winner L5
            //seeds 1 & 2
            MatchUp.doBattleLBracket(Bracket.loserList.get(0), Bracket.loserList.get(1));
            Bracket.loserList.get(0).setSeed(2); //winner goes to final match with seed of 2
        }
    }
}
