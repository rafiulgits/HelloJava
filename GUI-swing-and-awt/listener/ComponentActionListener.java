/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
/**
 *
 * @author hp
 */
public class ComponentActionListener {

    public ComponentActionListener() {
        
        /* Frame functionality */
        JFrame frame = new JFrame();
        Container pane = frame.getContentPane();
        
        frame.setBounds(100, 100, 800, 450);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setLayout(null);
        pane.setBackground(Color.darkGray);
        
        /* components functionality */
        JPanel panel = new JPanel(null);
        panel.setSize(500, 300);
        panel.setLocation(0, 50);
        panel.setBackground(Color.lightGray);
        
        JPasswordField pass = new JPasswordField();
        pass.setBounds(50, 50, 200, 40);
        pass.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(pass);
        
        JTextArea area = new JTextArea("Your password : ");
        area.setBounds(50, 100, 200, 100);
        panel.add(area);
        
        /* Annonymus method of action listener */
        pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                area.append(String.valueOf(pass.getPassword()));
            } 
        });
        
        /* add components in frame pane */
        panel.repaint();
        pane.add(panel);
        pane.repaint();
    }
    
    public static void main(String[] args) {
        new ComponentActionListener();
    }
}

