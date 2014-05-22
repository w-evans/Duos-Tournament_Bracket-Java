
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

        WinBracket.roundOne(Bracket.teamList);  //winners bracket round 1

        System.out.println();
        System.out.println("Current Loser's Bracket teams:");
        System.out.print(Bracket.loserList); //prints newly updated loser list
        System.out.println();
        System.out.println();
        System.out.println("Current Winner's Bracket:");
        System.out.println(Bracket.teamList);

        LoserBracket.roundOne(Bracket.loserList); //losers bracket round 1

        System.out.println();
        System.out.println("Current Loser's Bracket teams:");
        System.out.print(Bracket.loserList); //prints newly updated loser list
        System.out.println();
        System.out.println();
        System.out.println("Current Winner's Bracket:");
        System.out.println(Bracket.teamList);

        WinBracket.roundTwo(Bracket.teamList); //winners bracket round 2

        System.out.println();
        System.out.println("Current Loser's Bracket teams:");
        System.out.print(Bracket.loserList); //prints newly updated loser list
        System.out.println();
        System.out.println();
        System.out.println("Current Winner's Bracket:");
        System.out.println(Bracket.teamList);

        LoserBracket.roundTwo(Bracket.loserList); //losers bracket round 2

        System.out.println();
        System.out.println("Current Loser's Bracket teams:");
        System.out.print(Bracket.loserList); //prints newly updated loser list
        System.out.println();
        System.out.println();
        System.out.println("Current Winner's Bracket:");
        System.out.println(Bracket.teamList);

        LoserBracket.roundThree(Bracket.loserList); //losers round 3 should be before round 3 winners

        System.out.println();
        System.out.println("Current Loser's Bracket teams:");
        System.out.print(Bracket.loserList); //prints newly updated loser list
        System.out.println();
        System.out.println();
        System.out.println("Current Winner's Bracket:");
        System.out.println(Bracket.teamList);

        WinBracket.roundThree(Bracket.teamList);

        System.out.println();
        System.out.println("Current Loser's Bracket teams:");
        System.out.print(Bracket.loserList); //prints newly updated loser list
        System.out.println();
        System.out.println();
        System.out.println("Current Winner's Bracket:");
        System.out.println(Bracket.teamList);

        LoserBracket.roundFour(Bracket.loserList);

        System.out.println();
        System.out.println("Current Loser's Bracket teams:");
        System.out.print(Bracket.loserList); //prints newly updated loser list
        System.out.println();
        System.out.println();
        System.out.println("Current Winner's Bracket:");
        System.out.println(Bracket.teamList);

    }
}