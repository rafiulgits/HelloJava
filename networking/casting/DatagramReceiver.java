package networking.casting;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author rafiul islam
 */
public class DatagramReceiver {
    public static void main(String[] args) {
        int port = 9696;
        if(args.length == 1){
            port = Integer.parseInt(args[0]);
        }
        
        try{
            DatagramSocket dgReceiverSocket = new DatagramSocket(port);
            byte[] bufferData = new byte[100];
            String message;
            DatagramPacket dgDataPacket = new DatagramPacket(bufferData, bufferData.length);
            for(int i=0; i<5; i++){
                dgReceiverSocket.receive(dgDataPacket);
                message = new String(dgDataPacket.getData(),0,dgDataPacket.getLength());
                System.out.println("Receive from("+dgDataPacket.getSocketAddress()+"): "+
                        message.trim());
            }
        } catch(SocketException ex){
            System.err.println(ex);
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
