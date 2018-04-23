/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author hp
 */
public class FrameListener {

    public FrameListener() {
        
        /* Frame functionality */
        JFrame frame = new JFrame("Frame Listener");
        Container pane = frame.getContentPane();
        
        frame.setBounds(100, 100, 800, 450);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setLayout(null);
        pane.setBackground(Color.darkGray);
        
        /* Component functionality */
        JTextArea area = new JTextArea();
        area.setBounds(200, 50, 300, 350);
        area.setFont(new Font("Arial", Font.PLAIN, 20));
        
        frame.addWindowListener(new WindowListener() {
            
            /* In general Opened , Closing, Closed is not visible 
               When we use multiple Frame Window then it will workable for us
            */
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                area.append("Window Iconified\n");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                area.append("Window De-Iconified\n");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                area.append("Window activated\n");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                area.append("Window deactivated\n");
            }
        });
        
        
        /* add components in frame pane */
        pane.add(area);
        pane.repaint();
    }
    
    public static void main(String[] args) {
        new FrameListener();
    }
}
