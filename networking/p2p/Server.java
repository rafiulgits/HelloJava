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
    /**
     * Server class will create a SocketServer with a defined port.
     * To connect with this server, Client must use this same port.
     * After client send a request to this server to make a P2P connection,
     * server must accept the request before any communication between them.
     * After Server accept the request a Socket will return by the system.
     * Then Server's Socket and Client's Socket can communicate.
     * @see networking.p2p.Client
     * 
     */
    private static final int PORT = 6789;
    private static final int MAX_WAIT = 100000; // sec
    private static final String SENDER = "CLIENT: ";
    
    public static void main(String[] args) {
        /**
         * Scanner for input user message from console.
         */
        Scanner scan = new Scanner(System.in);
        
        try{
            /**
             * A ServerSocket is created with a defined port and set maximum time for
             * routing client.
             * When server accept a client, it will send a greeting message via OutputStream. 
             */
            ServerSocket ss = new ServerSocket(PORT);
            ss.setSoTimeout(MAX_WAIT);
            System.out.println("Server will waiting 100 sec for client with port "+PORT);
            Socket socket = ss.accept();
            System.out.println("Server is connected with "+socket.getRemoteSocketAddress());
            
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF("Welcome !");
            
            /**
             * This thread will stream from remote side of the socket and display to user.
             * socket will return an InputStream to DataInputStream and then DataInputStream
             * will read the message as String and print it on console.
             */
            new Thread(new Runnable(){
                public void run(){
                    DataInputStream dis = null;
                    try{
                        dis = new DataInputStream(socket.getInputStream());
                    } catch(IOException ex){
                        System.err.println(ex);
                    }
                    String message = "";
                    while(!socket.isInputShutdown() || !socket.isClosed()){
                        try {
                            
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
            while(!socket.isOutputShutdown() || !socket.isClosed()){
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
