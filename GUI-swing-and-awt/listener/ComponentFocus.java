/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class ComponentFocus {

    public ComponentFocus() {
        
        /* Frame functionality */
        JFrame frame = new JFrame("Focus Listenser");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100, 100, 800, 450);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setLayout(null);
        pane.setBackground(Color.darkGray);
        
        /* Component functionality */
        JTextField field = new JTextField();
        field.setBounds(100,50,300,100);
        field.setFont(new Font("Arial", Font.BOLD, 20));
        field.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                field.setText("I am focused");
            }

            @Override
            public void focusLost(FocusEvent e) {
                field.setText("I am not focused");
            }
        });
        
        /* add components in frame pane */
        pane.add(field);
        pane.repaint();
    }
    
    public static void main(String[] args) {
        new ComponentFocus();
    }
}
