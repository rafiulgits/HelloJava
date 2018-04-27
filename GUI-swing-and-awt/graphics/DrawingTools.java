
package com.basic.drawing;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Container;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rafiul
 * @see Only Graphics2D has the public void setPaint(Paint) method 
 */
class ToolsPanel extends JPanel{

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        /** 
         * calling example methods
        **/
        gradientExample(g);
        textureExample(g);
        transparentExample(g);
        
    }
    
    private void gradientExample(Graphics graph){
        Graphics2D graph2d = (Graphics2D)graph.create();
        
        Point p1 = new Point(12, 12);
        Point p2 = new Point(132, 127);
        
        GradientPaint gp1 = new GradientPaint(p1, Color.GREEN, p2, Color.RED);
        graph2d.setPaint(gp1);
        graph2d.fillRect(10, 10, 300, 120);
        
        
        Point p3 = new Point(152, 162);
        Point p4 = new Point(282, 167);
        
        GradientPaint gp2 = new GradientPaint(p3, Color.ORANGE, p4, Color.BLUE);
        graph2d.setPaint(gp2);
        graph2d.fillRect(10, 150, 300, 120);  
        
        graph2d.dispose();
    }
    private void textureExample(Graphics graph){
        Graphics2D graph2d = (Graphics2D)graph.create();
        
        /* for texture color shape */
        Rectangle rect = new Rectangle(0, 0, 100, 60);
        try{
            BufferedImage img = ImageIO.read(new File("res/images/green_leaf.jpg"));
            TexturePaint txPaint = new TexturePaint(img, rect);
        
            graph2d.setPaint(txPaint);

            graph2d.fillRect(520, 50, 300, 180);
        } catch(IOException ex){}
        
        
        graph2d.dispose();
        
    }
    private void transparentExample(Graphics graph){
        Graphics2D graph2d =(Graphics2D)graph.create();
        graph2d.setPaint(Color.RED);
        
        /* ARGB:: Alpha RGB: alpha = (0.0 - 1.0) */
        AlphaComposite alpha;
        float a = 0.1f;
        for(int i=1, j=10; i<10; i++,j+=50){
            alpha = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, a);
            graph2d.setComposite(alpha);
            graph2d.fillOval(j, 350, 50, 50);
            a += 0.1;
        }
    }
    
    
}
public class DrawingTools {
    
    public JFrame frame;
    public Container pane;

    public DrawingTools() {
        frame = new JFrame("Tools Window");
        pane = frame.getContentPane();
        
        pane.setLayout(null);
        pane.setBackground(Color.DARK_GRAY);
        
        frame.setBounds(10, 10, 1100, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        ToolsPanel panel = new ToolsPanel();
        panel.setBounds(30, 30, 1000, 500);
        panel.setBackground(Color.WHITE);
        pane.add(panel);
        pane.repaint();
    }
    
    
    public static void main(String[] args) {
        new DrawingTools();
    }
}
