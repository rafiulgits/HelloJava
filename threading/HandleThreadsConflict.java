package com.basic.threading;
/**
 *
 * @author rafiul
 * 
 * By using synchronized key word we will a complete load of every thread
 * Thread-1 and Thread-2 using synchronized method
 * Thread-3 and Thread-4 using synchronized block for object
 * Start any of this two set = {t1 and t2} or {t3 and t4} 
 */
class Counter1 {
    public synchronized void loader(){
        String name = Thread.currentThread().getName();
        for(int i=0; i<5; i++){
            try {
                System.out.printf("%s loaded %d%% \n",name,i*20);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        System.out.printf("Thread %s loaded\n\n",name);
    }
}
class Counter2 {
    public void loader(){
        String name = Thread.currentThread().getName();
        for(int i=0; i<5; i++){
            try {
                System.out.printf("%s loaded %d%% \n",name,i*20);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        System.out.printf("Thread %s loaded\n\n",name);
    }
}
public class HandleThreadsConflict {
    
    public static void main(String[] args) {
        Counter1 c1 = new Counter1();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                c1.loader();
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                c1.loader();
            }
        });
        
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        
//        t1.start();
//        t2.start();
        
        /*------------------  try any one :: up or down ------------------------*/
        
        Counter2 c2 = new Counter2();
        Thread t3 = new Thread(new Runnable(){
            public void run(){
                synchronized(c2){
                    c2.loader();
                }
                
            }
        });
        
        Thread t4 = new Thread(new Runnable(){
            public void run(){
                synchronized(c2){
                    c2.loader();
                }
            }
        });
        
        t3.setName("Thread 3");
        t4.setName("Thread 4");
        
//        t3.start();
//        t4.start();
        
        
    }
}
