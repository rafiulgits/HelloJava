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
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author hp
 */
public class ComponentMouseListener {

    public ComponentMouseListener() {
        
        /* frame functionality */
        JFrame frame = new JFrame("Mouse Event in Frame");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100,100,800,450);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setLayout(null);
        pane.setBackground(Color.darkGray);
        
        /* components functionality */
        JTextField field = new JTextField();
        field.setBounds(200, 50, 400, 150);
        field.setFont(new Font("Arial", Font.BOLD, 30));
        field.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                field.setText("Mouse Clicked ("+e.getX()+" "+e.getY()+")"); 
            }

            @Override
            public void mousePressed(MouseEvent e) {
                 field.setText("Mouse Pressed ("+e.getX()+" "+e.getY()+")"); 
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                field.setText("Mouse Entered"); 
            }

            @Override
            public void mouseExited(MouseEvent e) {
                field.setText("Mouse Exited"); 
            }
        });
        
        /* add components in frame pane */
        pane.add(field);
        pane.repaint();
    }
    
    public static void main(String[] args) {
        new ComponentMouseListener();
    }
}
