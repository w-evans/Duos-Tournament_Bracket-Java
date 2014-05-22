import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
/**
 * Created by wevans on 5/22/14.
 */
public class DrawBracket {

    public static void draw() {

    JFrame frame = new JFrame("Blind Draw Tournament"); //creates the JFrame window
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits on close
    frame.setSize(350, 350); //sets size of JFrame window
    frame.setLayout(new GridLayout(8, 8));

     //round 1

    //match 1
    frame.add(new JLabel(Bracket.teamList.get(0).toString()));
    frame.add(new JLabel(Bracket.teamList.get(1).toString()));
    //match 2
    frame.add(new JLabel(Bracket.teamList.get(2).toString()));
    frame.add(new JLabel(Bracket.teamList.get(3).toString()));
    //match 3
    frame.add(new JLabel(Bracket.teamList.get(4).toString()));
    frame.add(new JLabel(Bracket.teamList.get(5).toString()));
    //match 4
    frame.add(new JLabel(Bracket.teamList.get(6).toString()));
    frame.add(new JLabel(Bracket.teamList.get(7).toString()));

    frame.pack();
    frame.setVisible(true); // makes the window visible, put at end of program
    }
}
