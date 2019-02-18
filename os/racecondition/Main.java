package os.racecondition;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        SharedMemory data = new SharedMemory();
        
        Thread t1 = new Thread(data, "Thread:1");
        Thread t2 = new Thread(data, "Thread:2");
        Thread t3 = new Thread(data, "Thread:3");
        
        t1.start();
        t2.start();
        t3.start();
        
        try{
            t1.join();
            t2.join();
            t3.join();
        } catch(InterruptedException ex){
            System.err.println(ex);
        }
    }
}
