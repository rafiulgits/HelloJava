/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author hp
 */
public class MouseMotionTracker {

    public MouseMotionTracker() {
        
        /* Frame functionality */
        JFrame frame = new JFrame("Mouse Motion");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100,100,800,450);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setBackground(Color.darkGray);
        pane.setLayout(null);
        
        /* Component functionality */
        JTextField field = new JTextField();
        field.setBounds(200,50,200,50);
        field.setFont(new Font("Arial", Font.BOLD, 20));
        field.setBackground(Color.lightGray);
        
        /* set motion listener in frame */
        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                field.setText("Dragged: "+e.getX()+" "+e.getY()); 
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                field.setText(e.getX()+" "+e.getY()); 
            }
        });
        
        /* add components in frame pane */
        pane.add(field);
        pane.repaint();
    }
    
    public static void main(String[] args) {
        new MouseMotionTracker();
    }
}
