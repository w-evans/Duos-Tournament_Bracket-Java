import java.util.*;
import static java.util.Collections.*;

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
        playerList.add("John");
        playerList.add("Chris");
        playerList.add("Jordan");
        playerList.add("Mike");

        SeedShuffle.makeTeams(playerList); // bread and butter method, puts players into teams and assigns them seeds

        //testing purposes
        System.out.println("Initial Player List after shuffle:");
        System.out.println(playerList); //prints out player list
        System.out.println();
        System.out.println("Prints teams after seeding:");
        System.out.println(teamList); //prints out the team array with seeds
    }
}