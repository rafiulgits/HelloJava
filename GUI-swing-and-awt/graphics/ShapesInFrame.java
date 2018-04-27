
package com.basic.drawing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rafiul
 */
class ShapesPanel extends JPanel{
    
    /** Hierarchy of graphical method
     *  ----------------------------------------
     *  public void paintComponent(Graphics g){}
     *  public void paintBorder(Graphics g){}
     *  public void paintChildren(Graphics g){}
     *  public void paint(Graphics g){}
     *  
     *  public void paint(Graphics g){} is the parent 
     *  method of Graphical method
     */
    
    public void paintComponent(Graphics graph){
        super.paintComponent(graph);
        
        /**
         * Here we got the graphics object 
         * Now we can use it for as our need
         * 
         * here I create a method for drawing some 
         * shapes on this Panel that already a 
         * JPanel extended 
         */
        shapes(graph);
    }
    
    private void shapes(Graphics graph){
        /**
         * draw some shapes using graphical power
         **/
        
        graph.setColor(Color.RED);
        graph.drawOval(5, 5, 50, 50);
        
        graph.setColor(Color.GREEN);
        graph.drawRect(5, 60, 80, 40);
        
        graph.setColor(Color.BLACK);
        graph.draw3DRect(5, 120, 80, 50, true);
        
        graph.setColor(Color.MAGENTA);
        graph.drawLine(5, 180, 80, 180);
        
        graph.setColor(Color.ORANGE);
        graph.fillOval(100, 10, 50, 50);

        ImageIcon imgIcon = new ImageIcon("res/images/happy.png");
        graph.drawImage(imgIcon.getImage(), 200, 5, 100, 100, this);
        
        try{
            File imgSrc = new File("res/images/happy.png");
            Image img = new BufferedImage(10, 10,BufferedImage.TYPE_INT_RGB);
            img = ImageIO.read(imgSrc);
            graph.drawImage(img,400,10,100,100, this);
        } catch(IOException e){System.err.println(e);}
        
    }
}
public class ShapesInFrame{
    
    protected JFrame frame;
    protected Container pane;

    public ShapesInFrame() {
        frame = new JFrame("Shapes Window");
        pane = frame.getContentPane();
        
        pane.setLayout(null);
        pane.setBackground(Color.gray);
        
        frame.setBounds(10, 10, 1100, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        /** 
         * Creating an object of ShapesPanel and add it on Frame
         */
        ShapesPanel panel = new ShapesPanel();
        panel.setBackground(Color.white);
        panel.setBounds(10, 10, 800, 400);
        
        pane.add(panel);
        panel.repaint();   
    }
    
    /* Main Thread */
    public static void main(String[] args) {
        new ShapesInFrame();
    }
}