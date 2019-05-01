package sdp.proxy.image;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author rafiul islam
 */
public interface Thumbnail {
    public void display(JLabel imagePanel, File file);
}
