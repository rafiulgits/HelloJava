/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.components;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
/**
 *
 * @author hp
 */
public class CheckBoxInFrame {

    public CheckBoxInFrame() {
        
        /* Frame functionality */
        JFrame frame = new JFrame("Check Box Frame");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100,100,800,450);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setLayout(null);
        pane.setBackground(Color.DARK_GRAY);
        
        /* Check Box functionality */
        Font font = new Font("Arial",Font.BOLD,20);
        JCheckBox cricOp = new JCheckBox("Cricket");
        JCheckBox footOp = new JCheckBox("Football");
        cricOp.setBounds(50, 50, 150, 40);
        footOp.setBounds(50, 100, 150, 40);
        cricOp.setFont(font);
        footOp.setFont(font);
        
        
        /* Group Check box */
        JCheckBox maleOp = new JCheckBox("Male");
        JCheckBox femaleOp = new JCheckBox("Female");
        maleOp.setBounds(450, 50, 150, 40);
        femaleOp.setBounds(450, 100, 150, 40);
        maleOp.setFont(font); 
        femaleOp.setFont(font);
        maleOp.setBackground(Color.ORANGE);
        femaleOp.setBackground(Color.ORANGE);
        maleOp.setForeground(Color.RED);
        femaleOp.setForeground(Color.RED);
        
        /* grouping them */
        ButtonGroup group = new ButtonGroup();
        group.add(maleOp);
        group.add(femaleOp); 
        
        /* Add components in frame */
        pane.add(cricOp);
        pane.add(footOp);
        pane.add(maleOp);
        pane.add(femaleOp);
        pane.repaint();
        
    }
    
    public static void main(String[] args) {
        new CheckBoxInFrame();
    }
}
