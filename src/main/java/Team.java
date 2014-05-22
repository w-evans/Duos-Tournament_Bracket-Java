import java.util.*;

/**
 * Created by wevans on 5/6/14.
 */
public class Team {
    //initial variables for class
    String p1 = "";
    String p2 = "";
    int seed = 0;
    char bracket = 'W';

    public Team() { //object constructor
        this.p1 = "";
        this.p2 = "";
        this.seed = 0;
        this.bracket = 'W';
    }

    public Team(String p1, String p2, int seed, char bracket) { //object constructor
        this.p1 = p1;
        this.p2 = p2;
        this.seed = seed;
        this.bracket = bracket;
    }

    @Override
    public String toString() { // prints out nicely when calling an instance object of Team
        return "{ " + p1 + ", " + p2 + ", " + seed + ", " + bracket + " }";
    }

    public void setSeed(int seed) { //change seed int of current instance of object team
        this.seed = seed;
    }

    public int getSeed() {
        return seed;
    }

    public char getBracket() {
        return bracket;
    }

    public void setBracket(char bracket) {
        this.bracket = bracket;
    }

    public int compareSeed(Team t1) {
        if(this.getSeed() > t1.getSeed()) return 1;
        if(this.getSeed() < t1.getSeed()) return -1;

        return 0;
    }
    public static ArrayList bubbleSort(ArrayList teamList) {

        for(int i = 0; i < Bracket.teamList.size() - 1; i++){
            for(int j=0; j < Bracket.teamList.size() - i - 1; j++){
                if(Bracket.teamList.get(j).compareSeed(Bracket.teamList.get(j+1)) > 0){
                Team temp = Bracket.teamList.get(j);
                Bracket.teamList.set(j, Bracket.teamList.get(j + 1));
                Bracket.teamList.set(j + 1, temp);
            }
        }
    }
        return Bracket.teamList;
    }
}