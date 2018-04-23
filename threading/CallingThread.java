
package com.basic.threading;

/**
 *
 * @author hp
 */

/* extends Thread and create a new Thread for supporting own functionality */
class HelloThread extends Thread{

    public HelloThread() {
        System.out.println(Thread.currentThread().getName());
    }
    /* run method execute all operation with a new thread */
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    
}
class Runner implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class CallingThread {
    public static void main(String[] args) {
        
        /* calling HelloThread extends of Thread */
        Thread t1 = new HelloThread();
        t1.setName("Hello Thread");
        t1.start(); 
        
        /* calling Runnable Runner in a Thread */
        Thread t2 = new Thread(new Runner());
        t2.setName("Runner Runnable");
        t2.start();
        
        /* calling anonymous Runnable in a Thread */
        Thread t3 = new Thread(new Runnable(){
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        });
        t3.setName("anonymous Runnable");
        t3.start();
        
    }
}
