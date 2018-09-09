package networking.p2p;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author rafiul islam
 */
public class MultipleP2PServer {
    private static final int PORT = 9876;
    private static final int MAX_WAIT = 100000;
    private static final int MAX_CLIENT_QUEUE = 5;
    
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(PORT, MAX_CLIENT_QUEUE);
            ss.setSoTimeout(MAX_WAIT);
            
            while(true){
                Socket socket = ss.accept();
                System.out.println("Server is connected with "+socket.getRemoteSocketAddress());
                Thread sender = new Thread(new Runnable(){
                    public void run(){
                        try {
                            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                            dos.writeUTF("Hello From Server");
                            dos.flush();
                            dos.close();
                        } catch (IOException ex) {
                            System.err.println(ex);
                        }
                    }
                });
                sender.start();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        } 
    }
}
