/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.components;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 *
 * @author hp
 */
public class ButtonInFrame implements ActionListener{
    
    /* for access from other methods */
    private JFrame frame = new JFrame("Button Frame");
    private Container pane = frame.getContentPane();
    
    public ButtonInFrame() {
        
        /* Frame functionality */

        frame.setBounds(100, 100, 800, 450);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setBackground(Color.white);
        pane.setLayout(null);
        
        /* Button functionality */
        JButton greenBt = new JButton("Green");
        JButton blackBt = new JButton("Black");
        Font font = new Font("Arial",Font.BOLD, 20);
        greenBt.setBounds(100, 10, 100, 40);
        blackBt.setBounds(220, 10, 100, 40);
        greenBt.setFont(font);
        blackBt.setFont(font);
        greenBt.setBackground(Color.lightGray);
        blackBt.setBackground(Color.lightGray); 
        greenBt.addActionListener(this);
        blackBt.addActionListener(this);
         
        /* Add components in frame pane */
        pane.add(greenBt);
        pane.add(blackBt);
        pane.repaint();
    }
    public void actionPerformed(ActionEvent event){
        
        System.out.println(event.getSource());
        System.out.println(event.paramString());
        
        if(event.getActionCommand()=="Black"){
            pane.setBackground(Color.BLACK);
            pane.repaint();
        }
        else if(event.getActionCommand().equals("Green")){
            pane.setBackground(Color.green);
            pane.repaint();
        }
    }
    public static void main(String[] args) {
        new ButtonInFrame();
    }
}
