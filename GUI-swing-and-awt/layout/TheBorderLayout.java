package layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author rafiul islam
 */
public class TheBorderLayout {
    /**
     * Border Layout provide a directional based layout.
     * A component can be set after, before, left , right, 
     * top bottom of another.
     * 
     * BorderLayout class provide some static positioning string
     * to set the components on a preferred position
     * 
     * @see java.awt.BorderLayout
     */
    
    public TheBorderLayout(){
        
        JFrame frame = new JFrame("Border Layout");// create a frame window
        frame.setPreferredSize(new Dimension(400, 220));// set dimension instead of position on screen
        frame.setResizable(true);// set resize of the window frame true
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set stop the program for close the frame
        
        Container pane = frame.getContentPane();// get the content panel of the frame
        pane.setLayout(new BorderLayout());// set the panel layout 
        
        JLabel top = new JLabel("I AM FROM TOP",SwingConstants.CENTER);//create a jlabel and set the text on center
        top.setBackground(Color.red); //set the jabel background color
        top.setOpaque(true);// set background color visible
        
        JLabel bottom = new JLabel("I AM FROM BOTTOM",SwingConstants.CENTER);
        bottom.setBackground(Color.LIGHT_GRAY);
        bottom.setOpaque(true);
        
        JLabel right = new JLabel("I AM FROM RIGHT",SwingConstants.CENTER);
        right.setBackground(Color.ORANGE);
        right.setOpaque(true);
        
        JLabel left = new JLabel("I AM FROM LEFT",SwingConstants.CENTER);
        left.setBackground(Color.GREEN);
        left.setOpaque(true);
        
        JLabel center = new JLabel("I AM FROM CENTER",SwingConstants.CENTER);
        center.setBackground(Color.PINK);
        center.setOpaque(true);
        
        pane.add(top, BorderLayout.PAGE_START);// set on the top
        pane.add(left, BorderLayout.WEST); // set on the left
        pane.add(right, BorderLayout.EAST); // set on the right
        pane.add(bottom, BorderLayout.PAGE_END); // set on the bottom
        pane.add(center, BorderLayout.CENTER); // set on the center
        
        frame.pack(); // pack everything on the frame and ready to display
        frame.setVisible(true); // set frame visible
    }
    
    public static class WithRowCol{
        public WithRowCol(){
            JFrame frame = new JFrame("Border Layout With GAP");//create a frame window
            frame.setPreferredSize(new Dimension(400, 220)); //set dimension
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set close to exit
            frame.setResizable(true); // set frame resizable
            
            Container pane = frame.getContentPane(); // get content panel from frame
            pane.setLayout(new BorderLayout(20, 10));// set layout with Horizontal and Vertical Px gap
            
            JLabel top = new JLabel("I AM FROM TOP",SwingConstants.CENTER);//create a jlabel and set the text on center
            top.setBackground(Color.red); //set the jabel background color
            top.setOpaque(true);// set background color visible

            JLabel bottom = new JLabel("I AM FROM BOTTOM",SwingConstants.CENTER);
            bottom.setBackground(Color.LIGHT_GRAY);
            bottom.setOpaque(true);

            JLabel right = new JLabel("I AM FROM RIGHT",SwingConstants.CENTER);
            right.setBackground(Color.ORANGE);
            right.setOpaque(true);

            JLabel left = new JLabel("I AM FROM LEFT",SwingConstants.CENTER);
            left.setBackground(Color.GREEN);
            left.setOpaque(true);

            JLabel center = new JLabel("I AM FROM CENTER",SwingConstants.CENTER);
            center.setBackground(Color.PINK);
            center.setOpaque(true);

            pane.add(top, BorderLayout.PAGE_START);// set on the top
            pane.add(left, BorderLayout.WEST); // set on the left
            pane.add(right, BorderLayout.EAST); // set on the right
            pane.add(bottom, BorderLayout.PAGE_END); // set on the bottom
            pane.add(center, BorderLayout.CENTER); // set on the center
            frame.pack();
            frame.setVisible(true);
        }
    }
    
    // driver function
    public static void main(String[] args) {
        //create a swing thread for run first class
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new TheBorderLayout();
            }
        });
        
        //create another swing thread for run the sub-class
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new TheBorderLayout.WithRowCol();
            }
        });
    }
}
