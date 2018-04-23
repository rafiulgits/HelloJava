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
import javax.swing.JPasswordField;

/**
 *
 * @author hp
 */
public class PasswordInFrame {

    public PasswordInFrame() {
        
        /* Frame functionality */
        JFrame frame = new JFrame("Password Frame");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100,100,800,450);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setLayout(null);
        pane.setBackground(Color.white);
        
        /* JPassword functionality */
        JPasswordField passField = new JPasswordField();
        passField.setBounds(100, 20, 200, 30);
        passField.setBackground(Color.black);
        passField.setForeground(Color.white);
        passField.setFont(new Font("Arial",Font.PLAIN, 35));
        
        /* add components in pane */
        pane.add(passField);
        pane.repaint();
    }
    
    public static void main(String[] args) {
        new PasswordInFrame();
    }
}
