import java.util.Scanner;
/**
 * Created by wevans on 5/8/14.
 */
public class MatchUp {
    //initial variables
    Team t1;
    Team t2;

    public MatchUp() { //object constructor with defaults
        this.t1 = null;
        this.t2 = null;
    }

    public MatchUp(Team t1, Team t2) { //object constructor
        this.t1 = t1;
        this.t2 = t2;
    }

    public static Team doBattle(Team t1, Team t2) {
        Scanner keyboard = new Scanner(System.in); //scanner for next int
        System.out.println(t1 + " , and " + t2 + " do battle!, Enter the seed that won: ");

        Team winner = null;
        int result = keyboard.nextInt();
        int first = t1.getSeed();
        int second = t2.getSeed();

        if(result == first) { //adds loser to loser bracket array list
            Bracket.loserList.add(t2);
            Bracket.teamList.remove(t2);
            System.out.println(t1 + " wins!");
            System.out.println(t2 + " moved to loser's bracket!");
            t2.setBracket('L'); // sets bracket indicator to 'L'
            System.out.println();
            winner = t1;
        }
        else if(result == second) {
            Bracket.loserList.add(t1);
            Bracket.teamList.remove(t1);
            System.out.println(t2 + " wins!");
            t2.setSeed(t1.getSeed()); // changes team seed +1 because they beat a higher seeded team
            System.out.println(t1 + " moved to loser's bracket!");
            t1.setBracket('L'); //sets bracket indicator to 'L'
            System.out.println();
            winner = t2;
        }
        return winner;
    }
    public static Team doBattleLBracket(Team t1, Team t2) {
        Scanner keyboard = new Scanner(System.in); //scanner for next int
        System.out.println(t1 + " , and " + t2 + " do battle!, Enter the seed that won: ");

        Team winner = null;
        int result = keyboard.nextInt();
        int first = t1.getSeed();
        int second = t2.getSeed();

        if(result == first) { //adds loser to loser bracket array list
            System.out.println(t1 + " wins!");
            System.out.println(t2 + " has been eliminated");
            Bracket.loserList.remove(t2);
            System.out.println();
            winner = t1;
        }
        else if(result == second) {
            System.out.println(t2 + " wins!");
            t2.setSeed(t1.getSeed()); // changes team seed +1 because they beat a higher seeded team
            System.out.println(t1 + " has been eliminated");
            Bracket.loserList.remove(t1);
            System.out.println();
            winner = t2;
        }
        return winner;
    }
    public static Team doBattleFinal(Team t1, Team t2) {
        Scanner keyboard = new Scanner(System.in); //scanner for next int
        t2.setSeed(2);
        System.out.println(t1 + " , and " + t2 + " do battle!, FINAL ROUND!");

        Team winner = null;
        int result = keyboard.nextInt();
        int first = t1.getSeed();
        int second = t2.getSeed();

        if(result == first) { //adds loser to loser bracket array list
            System.out.println(t1 + " wins! and takes First place!");
            System.out.println(t2 + " has been eliminated, but will take second place!");
            Bracket.loserList.remove(t2);
            System.out.println();
            winner = t1;
        }
        else if(result == second) {
            System.out.println(t2 + " wins!");
            System.out.println(t1 + " has been moved to the Loser's Bracket!");
            Bracket.loserList.add(t1);

            System.out.println("SUDDEN DEATH, enter the seed that won:");
            Scanner keyboard1 = new Scanner(System.in);
            int result1 = keyboard.nextInt();
            if(result1 == 1) {
                System.out.println(t2 + " has been eliminated!");
                System.out.println(t1 + " has taken first place!");
            }
            else if (result1 == 2) {
                System.out.println(t1 + " has been eliminated!");
                System.out.println(t2 + " has taken first place!");
            }


        }
        return winner;
    }

}
