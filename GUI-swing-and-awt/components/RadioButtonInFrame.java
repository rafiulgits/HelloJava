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
import javax.swing.JRadioButton;
/**
 *
 * @author hp
 */
public class RadioButtonInFrame {

    public RadioButtonInFrame() {
        
        /* Frame functionality */
        JFrame frame = new JFrame("Radio Button Frame");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100, 100, 800, 450);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setBackground(Color.DARK_GRAY);
        pane.setLayout(null);
        
        /* Radio Button functionality */
        Font font = new Font("ARIAL", Font.BOLD, 20);
        JRadioButton cricOp = new JRadioButton("Cricket");
        JRadioButton footOp = new JRadioButton("Football");
        cricOp.setBounds(10, 50, 150, 50);
        footOp.setBounds(10, 110, 150, 50);
        cricOp.setFont(font);
        footOp.setFont(font);
        cricOp.setBackground(Color.ORANGE);
        footOp.setBackground(Color.ORANGE);
        
        
        /* Joint Radio Button by grouping */
        JRadioButton maleOp = new JRadioButton("Male");
        JRadioButton femaleOP = new JRadioButton("Female");
        maleOp.setLocation(400, 50);
        maleOp.setSize(150, 50);
        femaleOP.setLocation(400, 110);
        femaleOP.setSize(150, 50);
        maleOp.setFont(font);
        femaleOP.setFont(font);
        maleOp.setForeground(Color.YELLOW);
        femaleOP.setForeground(Color.YELLOW);
        maleOp.setBackground(Color.MAGENTA);
        femaleOP.setBackground(Color.MAGENTA);
        /* Button group allow us to chose one unique option from a group */
        ButtonGroup gender = new ButtonGroup();
        gender.add(maleOp);
        gender.add(femaleOP);
        
        /* Add components in frame pane */
        pane.add(cricOp);
        pane.add(footOp);
        pane.add(maleOp);
        pane.add(femaleOP);
        pane.repaint();
    }
    
    public static void main(String[] args) {
        new RadioButtonInFrame();
    }
}
