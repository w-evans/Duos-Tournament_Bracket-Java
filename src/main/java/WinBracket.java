import java.util.ArrayList;
/**
 * Created by 10a16 on 5/13/14.
 */
public class WinBracket {

    public static void roundOne(ArrayList teamList) {

        if(teamList.size() == 8) {

            System.out.println("Winner's Bracket Round 1 Starting:");

            //match W1
            //team 1/team 2
            //seeds 1 & 2
            System.out.println("Match W1");
            MatchUp.doBattle(Bracket.teamList.get(0), Bracket.teamList.get(1));
            Bracket.teamList.get(0).setSeed(1); //sets winner seed to 1
            Bracket.loserList.get(0).setSeed(1); //sets loser seed to 1

            //match W2
            //team 3/team 4
            //seeds 3 & 4
            System.out.println("Match W2");
            MatchUp.doBattle(Bracket.teamList.get(1), Bracket.teamList.get(2));
            Bracket.teamList.get(1).setSeed(2); //sets winner seed to 2
            Bracket.loserList.get(1).setSeed(2); //sets loser seed to 2

            //match W3
            //team 5/team 6
            //seeds 5 & 6
            System.out.println("Match W3");
            MatchUp.doBattle(Bracket.teamList.get(2), Bracket.teamList.get(3));
            Bracket.teamList.get(2).setSeed(3); //sets winner seed to 3
            Bracket.loserList.get(2).setSeed(3); //sets loser seed to 3

            //match W4
            //team7/team8
            //seeds 7 & 8
            System.out.println("Match W4");
            MatchUp.doBattle(Bracket.teamList.get(3), Bracket.teamList.get(4));
            Bracket.teamList.get(3).setSeed(4); //sets winner seed to 4
            Bracket.loserList.get(3).setSeed(4); //sets loser seed to 4


        }
    }

    public static void roundTwo(ArrayList teamList) {

        System.out.println("Winner's Bracket: Round 2 Starting:");

        if(teamList.size() == 4) {

            //match W5
            //winner of w1 + w2
            //seeds 1 & 2
            System.out.println("Match W5");
            MatchUp.doBattle(Bracket.teamList.get(0), Bracket.teamList.get(1));
            Bracket.teamList.get(0).setSeed(1); //winner gets seed of 1
            Bracket.loserList.get(2).setSeed(2); //loser gets seed of 2

            //match W6
            //winner of W3 + W4
            //seeds 3 & 4
            System.out.println("Match W6");
            MatchUp.doBattle(Bracket.teamList.get(1), Bracket.teamList.get(2));
            Bracket.teamList.get(1).setSeed(2); //winner gets seed of 2

            //System.out.println("Winners:");
            //System.out.println(Bracket.teamList);
            //System.out.println("Losers:");
            //System.out.println(Bracket.loserList);
        }
    }

    public static void roundThree(ArrayList teamList) {

        if(teamList.size() == 2) {

            //match W7
            //winner of W5 & W6
            //seeds 1 & 2
            MatchUp.doBattle(Bracket.teamList.get(0), Bracket.teamList.get(1));
            Bracket.teamList.get(0).setSeed(1); //winner gets seed of 1
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
