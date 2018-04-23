/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;
/**
 *
 * @author hp
 */
public class ComponentKeyListener {

    public ComponentKeyListener() {
        
        /* Frame functionality */
        JFrame frame = new JFrame("Key Listener Frame");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100, 100, 800, 450);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setLayout(null);
        pane.setBackground(Color.darkGray);
        
        /* components functionality */
        JTextArea input = new JTextArea();
        JTextArea output = new JTextArea("KeyBoard Status : \n");
        Font font = new Font("Arial", Font.PLAIN, 20);
        
        input.setBounds(50, 50, 300, 200);
        output.setBounds(400, 50, 300, 200);
        input.setEditable(true);
        output.setEditable(false);
        input.setFont(font);
        output.setFont(font);
        input.setBackground(Color.lightGray);
        output.setBackground(Color.white);
        input.setForeground(Color.white);
        output.setForeground(Color.black);
        
        input.addKeyListener(new KeyListener() {
            
            @Override
            public void keyPressed(KeyEvent e) {
                output.setText("Key Status : \n");
                output.append("Pressd : "+e.getKeyChar()+"\n");
                pane.repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                output.append("Released : "+e.getKeyChar()+"\n");
                pane.repaint();
            }
            @Override
            public void keyTyped(KeyEvent e) {
                output.append("Typed : "+e.getKeyChar()+"\n");
                pane.repaint();
            }
        });
        
        /* add components in frame pane */
        pane.add(input);
        pane.add(output);
        pane.repaint();
    }
    
    public static void main(String[] args) {
        new ComponentKeyListener();
    }
}
