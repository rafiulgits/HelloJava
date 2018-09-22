package layout;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author rafiul islam
 */
public class TheFlowLayout {

    /**
     * Flow Layout provide the view of automatically rearranged of components.
     * Flow window will rearrange every component position with their
     * preferred size on frame after resize the frame.It will also allow
     * to set horizontal and vertical gap between components.
     * 
     * @see java.awt.FlowLayout
     */
    public TheFlowLayout() {
        JFrame frame = new JFrame("Border Layout");// create a frame window
        frame.setPreferredSize(new Dimension(600, 340));// set dimension instead of position on screen
        frame.setResizable(true);// set resize of the window frame true
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set stop the program for close the frame
        
        Container pane = frame.getContentPane();// get the content panel of the frame
        pane.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));// set the panel layout 
        
        Dimension d = new Dimension(80, 30);// size for every jlabel
        
        JLabel lb1 = new JLabel("One",SwingConstants.CENTER);//create a jlabel and set the text on center
        lb1.setBackground(Color.red); //set the jabel background color
        lb1.setOpaque(true);// set background color visible
        lb1.setPreferredSize(d);// set the label size
        
        JLabel lb2 = new JLabel("Two",SwingConstants.CENTER);
        lb2.setBackground(Color.LIGHT_GRAY);
        lb2.setOpaque(true);
        lb2.setPreferredSize(d);
        
        JLabel lb3 = new JLabel("Three",SwingConstants.CENTER);
        lb3.setBackground(Color.ORANGE);
        lb3.setOpaque(true);
        lb3.setPreferredSize(d);
        
        JLabel lb4 = new JLabel("Four",SwingConstants.CENTER);
        lb4.setBackground(Color.GREEN);
        lb4.setOpaque(true);
        lb4.setPreferredSize(d);
        
        JLabel lb5 = new JLabel("Five",SwingConstants.CENTER);
        lb5.setBackground(Color.PINK);
        lb5.setOpaque(true);
        lb5.setPreferredSize(d);
        
        pane.add(lb1);// add componets on the frame panel with index(start from 0)
        pane.add(lb4); 
        pane.add(lb3); 
        pane.add(lb2,1); 
        pane.add(lb5, 0); 
        
        frame.pack(); // pack everything on the frame and ready to display
        frame.setVisible(true); // set frame visible
    }
    
    // driver function
    public static void main(String[] args) {
        new TheFlowLayout(); // invoke the frame to display
    }
}
