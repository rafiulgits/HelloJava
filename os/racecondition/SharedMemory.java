package os.racecondition;

/**
 *
 * @author rafiul islam
 */
public class SharedMemory implements Runnable{
    
    private int data;
    
    public SharedMemory(){
        data = 12;
    }
    
    public void increase(){
        System.out.println("increasing by "+Thread.currentThread().getName());
        data++; 
    }
    
    public void decrease(){
        System.out.println("decreasing by "+Thread.currentThread().getName());
        data--;
    }
    
    public void show(){
        System.out.println("Current: "+data);
        try{
            Thread.sleep(100);
        } catch(InterruptedException ex){
            System.err.println(ex);
        }
    }
    
    @Override
    public void run(){
        /**
         * Remove the synchronized block to get involve into race condition.
         */
        synchronized(this){
            show();
            increase();
            show();
            decrease();
            show();
            System.out.println("--------------------");
        }
    }
}
