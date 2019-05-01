package sdp.proxy.image;

import java.io.File;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author rafiul islam
 */
public class ProxyViewer implements Thumbnail{
    
    private ImageViewer imageViewer;

    public ProxyViewer() {
        imageViewer = new ImageViewer();
    }
    
    @Override
    public void display(JLabel imageLabel, File imageFile){  
        JOptionPane.showMessageDialog(null, imageFile.getName()+" loading...");
        try{
            Thread.sleep(1000);
            imageViewer.display(imageLabel, imageFile);
        } catch(InterruptedException ex){
            System.err.println(ex);
        }
    }

}
