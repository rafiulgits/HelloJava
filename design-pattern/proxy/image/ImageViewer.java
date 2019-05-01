package sdp.proxy.image;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author rafiul islam
 */
public class ImageViewer implements Thumbnail{

    @Override
    public void display(JLabel imagePanel, File imageFile) {
        ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
        ImageIcon scaledImage = new ImageIcon(icon.getImage()
                    .getScaledInstance(500, 380, Image.SCALE_DEFAULT));
        imagePanel.setIcon(scaledImage);

    }
}
