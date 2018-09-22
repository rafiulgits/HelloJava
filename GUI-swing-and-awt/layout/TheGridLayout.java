package layout;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author rafiul islam
 */
public class TheGridLayout {
    /**
    * Grid Layout arrange component in row and col index.
    * 
    * @see java.awt.GridLayout
    */
    public TheGridLayout(){
        JFrame frame = new JFrame("Grid Layout");//create a jframe window
        frame.setPreferredSize(new Dimension(600, 350));//set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set close to exit
        frame.setResizable(true);//set frame resizable
        
        Container pane = frame.getContentPane();//get the panel of frame window
        pane.setLayout(new GridLayout(2, 3, 15, 10));//set panel layout:ROW,COL, HGAP, VGAP
        
        Dimension d = new Dimension(100, 60);//dimension for components size
        
        JLabel lb1 = new JLabel("One",SwingConstants.CENTER);//create a label component
        lb1.setBackground(Color.cyan);//set label background color
        lb1.setOpaque(true);//set background color to visible
        lb1.setPreferredSize(d);//set size
        
        JLabel lb2 = new JLabel("Two",SwingConstants.CENTER);//create a label component
        lb2.setBackground(Color.red);//set label background color
        lb2.setOpaque(true);//set background color to visible
        lb2.setPreferredSize(d);//set size
        
        JLabel lb3 = new JLabel("Three",SwingConstants.CENTER);//create a label component
        lb3.setBackground(Color.green);//set label background color
        lb3.setOpaque(true);//set background color to visible
        lb3.setPreferredSize(d);//set size
        
        JLabel lb4 = new JLabel("Four",SwingConstants.CENTER);//create a label component
        lb4.setBackground(Color.yellow);//set label background color
        lb4.setOpaque(true);//set background color to visible
        lb4.setPreferredSize(d);//set size
        
        pane.add(lb1);
        pane.add(lb4);
        pane.add(lb3);
        pane.add(lb2, 0); //add the component with index
        
        frame.pack();//ready all component to view
        frame.setVisible(true); //set frame window visible 
    }
    
    //driver function 
    public static void main(String[] args) {
        new TheGridLayout();
    }
}