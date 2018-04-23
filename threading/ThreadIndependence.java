
package com.basic.threading;

/**
 *
 * @author hp
 */

class IndependentThread extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.printf("Independent Thread %d\n",i);
        }
    }
}
class IndependentRunner implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.printf("Independent Runner %d\n",i);
        }
    }
}
public class ThreadIndependence {
    public static void main(String[] args) {
        
        /* all print operation will execute randomly according with processor
         * and system kernel
         * Thread:1 print operation will always execute first
         * next operation will randomly execute
        */
        
        /* Calling Independent Thread which is Thread extended */
        IndependentThread t1 = new IndependentThread();
        t1.start();
        
        /* Creating a Thread for Runner Runnable */
        Thread t2 = new Thread(new IndependentRunner());
        t2.start();
        
        /* Creating a anonymous Runnable Thread */
        Thread t3 = new Thread(new Runnable(){
            public void run(){
                for(int i=1; i<=5; i++){
                    System.out.printf("Anonymous Runner %d\n",i);
                }
            }
        });
        t3.start();
    }
}
