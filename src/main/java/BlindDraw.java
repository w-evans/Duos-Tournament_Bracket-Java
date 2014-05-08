import java.util.*;

public class BlindDraw {

    public static ArrayList<String> playerList = new ArrayList<String>(); //initial list of players
    public static ArrayList<Team> teamList = new ArrayList<Team>(); //stores instances of team objects


    public static void main(String[] args) {

        playerList.add("Will"); //add players
        playerList.add("Mark");
        playerList.add("Ben");
        playerList.add("Dennis");
        playerList.add("Dave");
        playerList.add("Bryan");

        Collections.shuffle(playerList); // shuffler initial playerlist
        Team.makeTeams(playerList); // puts players into teams and assigns them seeds

        System.out.println(teamList); //prints out the team array with seeds

    }
}