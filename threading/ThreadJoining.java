
package com.basic.threading;

/**
 *
 * @author hp
 */
public class ThreadJoining {
    public static void main(String[] args) {
        System.out.println("main thread initialized");
        Thread t1 = new Thread(new Runnable() {
        
            public void run() {
                for(int i=0; i<5; i++){
                    System.out.println("Thread is running....");
                }
            }
        });
        t1.start();
        /* if we don't join the Thread t1 in main thread then
         * main thread print statement will execute before compliting of 
         * Thread print statements. So using t1.join() statement I told to
         * main thread,"t1 thread will join you, please wait for its finish".
        **/
        try{
            t1.join();
        } catch(InterruptedException e){
            System.err.println(Thread.currentThread().getName()+" interrupted");
        }
        
        System.out.println("main thread done");
    }
}
