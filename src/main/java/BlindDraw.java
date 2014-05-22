
public class BlindDraw {

    public static void main(String[] args) {

        SeedShuffle.playerToTeams(Bracket.playerList); // adds players & shuffles playerList
        SeedShuffle.makeTeams(Bracket.playerList); // bread and butter method, puts players into teams and assigns them seeds

        //testing purposes
        //System.out.println("Initial Player List after shuffle:");
        //System.out.println(Bracket.playerList); //prints out player list
        //System.out.println();
        System.out.println("Prints teams after seeding:");
        System.out.println(Bracket.teamList); //prints out the team array with seeds
        System.out.println();

        WinBracket.roundOne(Bracket.teamList);

        LoserBracket.roundOne(Bracket.loserList);

        WinBracket.roundTwo(Bracket.teamList);

        Team.bubbleSort(Bracket.teamList);


        Team.bubbleSort(Bracket.loserList);


        LoserBracket.roundTwo(Bracket.loserList);

        System.out.println();
        System.out.println("Current Loser's Bracket teams:");
        System.out.print(Bracket.loserList); //prints newly updated loser list
        System.out.println();
        System.out.println();
        System.out.println("Current Winner's Bracket:");
        System.out.println(Bracket.teamList);

    }
}