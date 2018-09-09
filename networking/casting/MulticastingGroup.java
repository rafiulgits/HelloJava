package networking.casting;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author rafiul islam
 */
public class MulticastingGroup {
    /**
     * Class-D IP address are made for Multi-Casting
     * Range: (224.0.0.0 - 239.255.255.255)
     * Where 224.0.0.0 used for NID and 239.255.255.255 for subnet musk
     * Use between them except them.
    */
    
    public static void main(String[] args) {
       int port = -1;
       InetAddress host = null;
       System.out.print("Your Name: ");
       Scanner scan = new Scanner(System.in);
       String userName = scan.nextLine();
       
       if(args.length == 2){
           try{
               host = InetAddress.getByName(args[0]);
               port = Integer.parseInt(args[1]);
           } catch(UnknownHostException ex){
               System.err.println(ex);
           }
       }
       else{
           try{
               host = InetAddress.getByName("230.120.1.2");
               port = 9696;
           } catch(UnknownHostException ex){
               System.err.println(ex);
           }
       }
       
       try{
           MulticastSocket mlSenderSocket = new MulticastSocket();
           MulticastSocket mlReceiverSocket = new MulticastSocket(port);
           mlReceiverSocket.joinGroup(host);
           
           byte[] receiverBytes;
           byte[] senderBytes;
           
           /**
            * Reading Thread will always read from receiver datagram packet
            */
            receiverBytes = new byte[1024];
            new Thread(new Runnable(){
                public void run(){
                    DatagramPacket receiverPacket = new DatagramPacket(receiverBytes, 
                            receiverBytes.length);
                    String receivedMessage;
                    while(!mlReceiverSocket.isClosed()) {                       
                        try{
                            mlReceiverSocket.receive(receiverPacket);
                            receivedMessage = new String(receiverPacket.getData(), 0, 
                                    receiverPacket.getLength());
                            StringTokenizer st = new StringTokenizer(receivedMessage,":");
                            if(st.nextElement().equals(userName)){
                                continue;
                            }
                            System.out.println(receivedMessage);
                        } catch(IOException ex){
                            System.err.println(ex);
                        }
                    }
                }
            }).start();
            
            DatagramPacket senderPacket;
            /**
             * Greeting Message Send
             */
            String yourMessage = userName+" join";
            senderBytes = (userName+": "+yourMessage).getBytes();
            senderPacket = new DatagramPacket(senderBytes, senderBytes.length,host,port);
            mlSenderSocket.send(senderPacket);
            
            /**
             * Regular message send
             */
            while(!mlSenderSocket.isClosed()){
                yourMessage = scan.nextLine();
                if(yourMessage.equalsIgnoreCase("exit")){
                    senderBytes = (userName+": "+"Exited").getBytes();
                    senderPacket = new DatagramPacket(senderBytes, senderBytes.length,host,port);
                    mlSenderSocket.send(senderPacket);
                    
                    mlReceiverSocket.leaveGroup(host);
                    mlReceiverSocket.close();
                    mlSenderSocket.close();
                }
                else{
                    senderBytes = (userName+": "+yourMessage).getBytes();
                    senderPacket = new DatagramPacket(senderBytes, senderBytes.length,host,port);
                    mlSenderSocket.send(senderPacket);
                }
            }
        }  catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
