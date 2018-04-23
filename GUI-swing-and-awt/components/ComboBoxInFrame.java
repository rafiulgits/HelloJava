/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.components;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JComboBox;
/**
 *
 * @author hp
 */
public class ComboBoxInFrame {

    public ComboBoxInFrame() {
        
        /* Frame functionality */
        JFrame frame = new JFrame("Combo Box Frame");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100, 100, 800, 450);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setLayout(null);
        pane.setBackground(Color.darkGray);
        
        /* Combo Box functionlity */
        String[] cities = {"Dhaka","Chittagong","Sylhet","Khulna"};
        JComboBox<String> options = new JComboBox<>(cities);
        options.setBounds(200, 50, 200, 50);
        options.setBackground(Color.WHITE);
        options.setForeground(Color.MAGENTA);
        options.setFont(new Font("Arial",Font.BOLD,20));
        options.setSelectedItem("Sylhet");
        /* alternate select option : options.setSelectedIndex(2) */
        
        /* add components in frame */
        pane.add(options);
        pane.repaint();
    }
    
    public static void main(String[] args) {
        new ComboBoxInFrame();
    }
}
