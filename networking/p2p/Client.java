package networking.p2p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
/**
 *
 * @author rafiul islam
 */
public class Client {
    private static final int PORT = 6789;
    private static final String SENDER = "SERVER: ";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try{
            InetAddress host = InetAddress.getByName("localhost");
            System.out.println("Trying to connect by"+host+" with port: "+PORT);
            Socket socket = new Socket(host,PORT);

            new Thread(new Runnable(){
                public void run(){
                    String message = "";
                    while(!socket.isInputShutdown()){
                        try {
                            DataInputStream dis = new DataInputStream(socket.getInputStream());
                            message = dis.readUTF();
                            if(message.equalsIgnoreCase("exit")){
                                System.out.println(SENDER+"Exited");
                                
                                socket.shutdownInput();
                                socket.shutdownOutput();
                                
                                socket.close();
                            }
                            else
                                System.out.println(SENDER+message);
                        } catch (IOException ex) {
                            System.err.println(ex);
                        }                     
                    }
                }
            }).start();
            
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            String yourMessage = "";
            while(!socket.isOutputShutdown()){
                yourMessage = scan.nextLine();
                if(yourMessage.equalsIgnoreCase("exit")){
                    System.out.println("You are going to shut down this connection");
                    dos.writeUTF(yourMessage);
                    
                    socket.shutdownOutput();
                    socket.shutdownInput();
                    
                    break;
                }
                else
                    dos.writeUTF(yourMessage);
            }
            
            dos.flush();
            dos.close();

            socket.close();
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
