package layout;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author rafiul islam
 */
public class NullLayout {
    /**
    * Null Layout simply means fixed position.
    * When a component set on panel with a bound the will not
    * adjust with frame resize.
   */
    public NullLayout(){
        
        JFrame frame = new JFrame("Null Layout"); // create a frame
        frame.setBounds(10, 10, 800, 450); // set position on screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set exit on close
        
        Container pane = frame.getContentPane(); // get the panel on frame
        pane.setLayout(null); // set the panel layout null
        pane.setBackground(Color.BLUE); // set panel or frame background color
         
        JTextArea txtArea = new JTextArea(); // create a text area component
        txtArea.setBounds(0, 0, 700, 400); // set position on frame panel
  
        pane.add(txtArea); // add the text area component on panel
        
        frame.setResizable(true); // set frame resizable true
        frame.setVisible(true); // set frame visible after execution
    }
    
    // driver function  
    public static void main(String[] args) {
        new NullLayout(); // calling the object that will display the swing frame
    }
}
