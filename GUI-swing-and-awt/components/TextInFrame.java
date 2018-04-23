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
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author hp
 */
public class TextInFrame {

    public TextInFrame() {
        
        /* JFrame Create */
        JFrame frame = new JFrame("Text Components");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100,100, 800, 450);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setBackground(Color.white);
        pane.setLayout(null);
        
        /* Font */
        Font font = new Font("ARIAL",Font.PLAIN, 20);
        
        /* JTextField functionality */
        JTextField txField = new JTextField();
        txField.setBounds(10, 10, 300, 300);
        txField.setText("Hello I am Text Field and I support single text line, no append method"); 
        txField.setBackground(Color.MAGENTA);
        txField.setFont(font);
        
        /* JTextArea functionality */
        JTextArea txArea = new JTextArea();
        txArea.setBounds(340, 10, 300, 300);
        txArea.setText("I am Text Area. I support multiline with append method\n");
        txArea.append("See, I am appended !");
        txArea.setBackground(Color.ORANGE);
        txArea.setFont(font);
        
        /* Add components in frame pane */
        pane.add(txField);
        pane.add(txArea);
        pane.repaint();
        
    }
    
    public static void main(String[] args) {
        new TextInFrame();
    }
}
