/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.components;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author hp
 */
public class FrameWindow {
    
    public FrameWindow(){
        /* Create a thread for Frame window */
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                /* Create a JFrame and access its pane 
                   Pane:: Frame Property where other components and 
                          frame functionlity applied 
                 */
                JFrame frame = new JFrame();
                Container pane = frame.getContentPane();

                frame.setLocation(200, 100);
                frame.setSize(600,380);
                /*Combo method:: frame.setBounds(200,100,600,380);*/
                frame.setTitle("JFrame Window");
                frame.setVisible(true);
                frame.setResizable(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                /* Add window icon */
                ImageIcon icon = new ImageIcon("C:\\Users\\hp\\Downloads\\Image\\Sakkhat.png");
                frame.setIconImage(icon.getImage());
                

                /* Frame Pane functionality */
                pane.setBackground(Color.darkGray);
            }
        });
    }
    
    public static void main(String[] args) {
        /* Call the Construction for Display JFrame */
        new FrameWindow();
    }
}
