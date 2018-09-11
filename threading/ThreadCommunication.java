package com.basic.threading;

/**
 *
 * @author rafiul
 ** Generally we have no idea which thread(method) will executed first in 
 *  synchronized way (let no priority setup). Either login method will execute 
 *  first or status method. But want login method will execute first, so whenever 
 *  status method try to execute first it will check whether this account already 
 *  logged in or not, if not-> then this method will wait for authentication.
 *  After logged in - authentication will have been succeed and a notification 
 *  will send to the status method from login method for continue its works
 */
class Facebook{
    private boolean loggedIn;

    public Facebook() {
        loggedIn = false;
    }
    /**
     * For communicate between threads methods should be under synchronization
     */
    public synchronized void login(){
        for(int i=0; i<5; i++){
            System.out.println("Authenticating...");
        }
        System.out.println("Authenticated Successfull\n");
        
        loggedIn = true;
        notify();
    }
    public synchronized void status(){
        if(! loggedIn){
            try {
                System.out.println("Not authenticated. Trying to log ");
                wait();
            } catch (InterruptedException e) {
                System.err.println("Interrupted");
            }
        }
        for(int i=0; i<5; i++){
            System.out.println("Updating status...");
        }
    }
    
}
public class ThreadCommunication {
    public static void main(String[] args) {
        
        Facebook account = new Facebook();
        
        
        /**
         * Two thread those will communicate with each other.
         * One thread is for updating status method and another for log in.
         * From main thread I call status thread first and after 2 sec I call log thread.
         * When status thread will call the status method it will found that user is not
         * authenticated and it will wait for authentication confirmation. After log thread
         * executed it will make the log boolean true and notify the waiting thread for 
         * it's(waiting thread) further executions.
         */
        Thread logThread = new Thread(new Runnable(){
            public void run(){
                account.login();
            }
        });
        
        Thread statusThread = new Thread(new Runnable(){
            public void run(){
                account.status();
            }
        });
        statusThread.start();
        
        /* wait for 2000 milliseconds */
        try{
            Thread.sleep(2000);
        } catch(InterruptedException ex){
            System.err.println(ex);
        }
        
        logThread.start();
    }
}
