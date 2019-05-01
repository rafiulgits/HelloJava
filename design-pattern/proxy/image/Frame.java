package sdp.proxy.image;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author rafiul islam
 */
public class Frame{
    
    private JFrame frame;
    private Container pane;
    private JLabel imageLabel;
    private ProxyViewer viewer;
   
    public Frame(){
        frame = new JFrame("Proxy Pattern by Image Loading");
        pane = frame.getContentPane();
        
        configure();
        components();
    }
    
    private void configure(){
        frame.setPreferredSize(new Dimension(500, 480));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setBackground(Color.white);
        pane.setLayout(null);
        
        viewer = new ProxyViewer();
    }
    
    private void components(){
        imageLabel = new JLabel("Select Your File");
        imageLabel.setVerticalAlignment(SwingConstants.CENTER);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setLayout(null);
        imageLabel.setBounds(0, 0, 500, 380);
        
        JButton button = new JButton("Select Image");
        button.setBounds(200, 390, 100, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png"));
                int status = chooser.showOpenDialog(null);
                if(status == JFileChooser.APPROVE_OPTION){
                    File file = chooser.getSelectedFile();
                    viewer.display(imageLabel, file);
                }
            }
        });
        
        
        pane.add(button);
        pane.add(imageLabel);
        pane.repaint();
        frame.pack();
    }
}
