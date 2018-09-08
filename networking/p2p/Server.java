package networking.p2p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author rafiul islam
 */
public class Server {
    private static final int PORT = 6789;
    private static final int MAX_CLIENT_QUEUE = 5;
    private static final int MAX_WAIT = 100000; // sec
    private static final String SENDER = "CLIENT: ";
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try{
            ServerSocket ss = new ServerSocket(PORT);
            System.out.println("Server will waiting 100sec for client with port"+PORT);
            Socket socket = ss.accept();
            System.out.println("Server is connected with "+socket.getRemoteSocketAddress());
            
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF("Welcome !");
            
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
            ss.close();
            
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
