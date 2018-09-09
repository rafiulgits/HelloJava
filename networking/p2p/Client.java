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
    /**
     * Client will try to connect with server using same port as server has.
     * Here I define a constant port and other side username.
     * Before client try to connect with server, server must opened before.
     * @see networking.p2p.Server
    */
    
    private static final int PORT = 6789;
    private static final String SENDER = "SERVER: ";
    
    public static void main(String[] args) {
        /**
         * A Scanner for input user message from console.
         */
        Scanner scan = new Scanner(System.in);
        
        try{
            /**
             * Client socket need an InedAdress for connection and a port that is 
             * also used by server.
             */
            InetAddress host = InetAddress.getByName("localhost");
            System.out.println("Trying to connect by"+host+" with port: "+PORT);
            Socket socket = new Socket(host, PORT);
            
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
            /**
             * DataOutputStream will write by socket OutputStream while socket is opened.
             * Scanner will take the message from console and pass it to DataOutputStream
             * Connection will shutdown after any of user type 'exit' (ignore case).
             */
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
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
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
