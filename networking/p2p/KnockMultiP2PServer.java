package networking.p2p;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author rafiul islam
 */
public class KnockMultiP2PServer {
    private static final int PORT = 9876;
    
    public static void main(String[] args) {
        try {
            InetAddress host = InetAddress.getByName("localhost");
            Socket socket = new Socket(host, PORT);
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            System.out.println(dis.readUTF());
            
            dis.close();
            socket.close();
            
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
