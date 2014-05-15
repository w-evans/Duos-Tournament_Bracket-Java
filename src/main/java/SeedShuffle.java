import java.util.ArrayList;
import static java.util.Collections.*;

/**
 * Created by 10a16 on 5/13/14.
 */
public class SeedShuffle {

    public static ArrayList playerToTeams(ArrayList playerList) {

        Bracket.playerList.add("Will"); //add players
        Bracket.playerList.add("Mark");
        Bracket.playerList.add("Ben");
        Bracket.playerList.add("Dennis");
        Bracket.playerList.add("Dave");
        Bracket.playerList.add("Bryan");
        Bracket.playerList.add("John");
        Bracket.playerList.add("Chris");

        shuffle(playerList); // shuffle initial playerlist

        return playerList;
    }
    public static ArrayList makeTeams(ArrayList playerList) {

        Team t;
        int count = 1; //for setting seeds
        for (int i = 1; i < playerList.size(); i += 2) {
            //creates new instance of team and passes to new array + adding players from player list array
            Bracket.teamList.add(t = new Team(playerList.get(i - 1).toString(), playerList.get(i).toString(), 0, 'W'));

            t.setSeed(count); //sets seed of current instance of team
            count = count + 1; //increments count by 1 every time an instance of team is created
        }
        return Bracket.teamList;
    }
}
