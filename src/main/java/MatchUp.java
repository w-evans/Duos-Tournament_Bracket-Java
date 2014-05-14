/**
 * Created by wevans on 5/8/14.
 */
public class MatchUp {
    //initial variables
    Object t1;
    Object t2;

    public MatchUp() { //object constructor with defaults
        this.t1 = BlindDraw.teamList.get(0);
        this.t2 = BlindDraw.teamList.get(1);
    }

    public MatchUp(Object t1, Object t2) { //object constructor
        this.t1 = t1;
        this.t2 = t2;
    }

}
