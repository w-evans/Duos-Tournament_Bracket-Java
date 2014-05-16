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
                                    //match W5
                                    //winner of t1/t2 + t3/4
            //match W2
            //team 3/team 4                                                                             //merge
                                                                    //match W7                          //match W8
                                                                    //winner of W5/winner W6            //winner of L6/winner W7
            //match W3
            //team 5/team 6
                                   //match W6
                                   //winner of t5/t6 + t7/t8
            //match W4
            //team7/team8


            //losers bracket

            //match L1
            //loser of match W1/loser of match W2
                                                    //match L3
                                                    //loser match W5/winner match L1
                                                                                                //match L5
                                                                                                //winner of L3/winner L4
                                                                                                                            //match L6
                                                                                                                            // loser W7/winner L5     //merge bracket
            //match L2
                //loser of match W3/loser of match W4
                                                    //match L4
                                                    //loser match W6/winner match L2

        }
        if(teamList.size() == 9) {
            //team 1 plays team 2
            //team 3 plays team 4
            //team 5 plays team 6
            //team 7 plays team 8

            //team 9 has a bye to second round, plays winner of team1/team2
        }
        if(teamList.size() == 10) {}
        if(teamList.size() == 11) {}
        if(teamList.size() == 12) {}
        if(teamList.size() == 13) {}
        if(teamList.size() == 14) {}
        if(teamList.size() == 15) {}
        if(teamList.size() == 16) {}
        if(teamList.size() == 17) {}
        if(teamList.size() == 18) {}
        if(teamList.size() == 19) {}
        if(teamList.size() == 20) {}

    }
}
