import java.util.*;
import static java.util.Collections.*;

public class BlindDraw {

    public static void main(String[] args) {

        SeedShuffle.playerToTeams(SeedShuffle.playerList); // adds players & shuffles playerList
        SeedShuffle.makeTeams(SeedShuffle.playerList); // bread and butter method, puts players into teams and assigns them seeds

        //testing purposes
        System.out.println("Initial Player List after shuffle:");
        System.out.println(SeedShuffle.playerList); //prints out player list
        System.out.println();
        System.out.println("Prints teams after seeding:");
        System.out.println(SeedShuffle.teamList); //prints out the team array with seeds
    }
}