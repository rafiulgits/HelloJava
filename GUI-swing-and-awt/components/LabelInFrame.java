/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.components;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author hp
 */
public class LabelInFrame {
    
    public LabelInFrame(){
        /* Create a Frame Window */
        JFrame frame = new JFrame("Label");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100, 100, 800, 460);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setBackground(Color.white);
        pane.setLayout(null);
        
        /* JLabel functionality */
        JLabel txLabel = new JLabel("I am label", 0);
        txLabel.setBounds(10,10,150,20);
        txLabel.setFont(new Font("ARIAL", Font.BOLD, 20));
        txLabel.setForeground(Color.red);
        /* label background */
        txLabel.setOpaque(true);
        txLabel.setBackground(Color.green);
        
        /* Image Label */
        ImageIcon icon = new ImageIcon("C:\\Users\\hp\\Downloads\\Image\\Sakkhat.png");
        JLabel imgLabel = new JLabel(icon);
        imgLabel.setBounds(200, 10, icon.getIconWidth(), icon.getIconHeight());
        
        /* Add componets in frame pane */
        pane.add(txLabel);
        pane.add(imgLabel);
        pane.repaint();
        
    }
    public static void main(String[] args) {
        new LabelInFrame();
    }
}
