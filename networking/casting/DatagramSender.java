package networking.casting;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author rafiul islam
 */
public class DatagramSender {
    public static void main(String[] args) {
        InetAddress host = null;
        int port = -1;
        
        if(args.length == 2){
            try {
                host = InetAddress.getByName(args[0]);
                port = Integer.parseInt(args[0]);
            } catch (UnknownHostException ex) {
                System.err.println(ex);
            }
        }
        else{
            try {
                host = InetAddress.getLocalHost();
                port = 9696;
            } catch (UnknownHostException ex) {
                System.err.println(ex);
            }
        }
        
        try {
            DatagramSocket dgSenderSocket = new DatagramSocket();
            System.out.print("Your Message: ");
            Scanner scan = new Scanner(System.in);
            String data = scan.nextLine();
            byte[] bufferData = data.getBytes();
            DatagramPacket dataPacket = new DatagramPacket(bufferData,bufferData.length,host,port);
            
            dgSenderSocket.send(dataPacket);
            System.out.println("Send length: "+data.length());
            System.out.println("Send to: "+dataPacket.getSocketAddress());
            
        } catch (SocketException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
