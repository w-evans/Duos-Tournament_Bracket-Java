import java.util.ArrayList;

/**
 * Created by 10a16 on 5/13/14.
 */
public class Bracket {
    public static ArrayList<String> playerList = new ArrayList<String>(); //initial list of players
    public static ArrayList<Team> loserList = new ArrayList<Team>(); //stores instances of team objects
    public static ArrayList<Team> teamList = new ArrayList<Team>(); //stores instances of team objects

    public static void eightTeamTournament() {

        SeedShuffle.playerToTeams(playerList); // adds players & shuffles playerList
        SeedShuffle.makeTeams(playerList); // bread and butter method, puts players into teams and assigns them seeds

        WinBracket.roundOne(teamList);  //winners bracket round 1
        LoserBracket.roundOne(loserList); //losers bracket round 1
        WinBracket.roundTwo(teamList); //winners bracket round 2
        LoserBracket.roundTwo(loserList); //losers bracket round 2
        LoserBracket.roundThree(loserList); //losers round 3 should be before round 3 winners
        WinBracket.roundThree(teamList); //winners bracket round 3
        LoserBracket.roundFour(loserList); //losers bracket round 4
        //final round here
    }
}
