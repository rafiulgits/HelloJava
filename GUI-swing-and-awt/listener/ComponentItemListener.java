/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class ComponentItemListener {

    public ComponentItemListener() {
        
        /* Frame functionality */
        JFrame frame = new JFrame("Item Listener Frame");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100, 100, 800, 450);
        frame.setVisible(true);
        frame.setResizable(false); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setBackground(Color.darkGray);
        pane.setLayout(null);
        
        /* Component functionality */
        String[] colors = {"Dark Gary","Green","White","Red"};
        JComboBox<String> colorBox = new JComboBox<>(colors);
        colorBox.setBounds(100, 50, 200, 40);
        colorBox.setFont(new Font("Arial",Font.BOLD,20));
        colorBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int selected = colorBox.getSelectedIndex();
                if(selected == 0){
                    pane.setBackground(Color.darkGray);
                    pane.repaint();
                }
                else if(selected == 1){
                    pane.setBackground(Color.green);
                    pane.repaint();
                }
                else if(selected == 2){
                    pane.setBackground(Color.white);
                    pane.repaint();
                }
                else{
                    pane.setBackground(Color.red);
                    pane.repaint();
                }
            }
        });
        
        /* Add components in frame pane */
        pane.add(colorBox);
        pane.repaint();
    }
    
    public static void main(String[] args) {
        new ComponentItemListener();
    }
}
