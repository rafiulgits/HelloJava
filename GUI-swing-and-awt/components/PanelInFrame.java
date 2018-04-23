/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.components;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class PanelInFrame {

    public PanelInFrame() {
        
        /* Frame functionality */
        JFrame frame = new JFrame("Panel In Frame");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100,100,800,450);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setBackground(Color.darkGray);
        pane.setLayout(null);
        
        /* Panel functionality */
        JPanel left = new JPanel();
        JPanel right = new JPanel();
        
        left.setBounds(50, 100, 200, 200);
        right.setBounds(350, 100, 200, 200); 
        left.setBackground(Color.green);
        right.setBackground(Color.red);
        
        
        /* add components in frame pane */
        pane.add(left);
        pane.add(right);
        pane.repaint();
    }
    
    public static void main(String[] args) {
        new PanelInFrame();
    }
}
