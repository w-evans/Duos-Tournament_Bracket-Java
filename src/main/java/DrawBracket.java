import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Created by wevans on 5/22/14.
 */
public class DrawBracket {

    public static void draw() {
    JFrame frame = new JFrame("Blind Draw Tournament"); //creates the JFrame window
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits on close
    frame.setSize(350, 350); //sets size of JFrame window
    frame.setLayout(new GridLayout(8, 8));

    //match 1
    frame.add(new JLabel(Bracket.teamList.get(0).toString()));
    frame.add(new JLabel(Bracket.teamList.get(2).toString()));
    //match 2
    frame.setVisible(true); // makes the window visible, put at end of program
    }
}
