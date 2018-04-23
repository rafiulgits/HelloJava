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
        
        logThread.start();
        statusThread.start();
    }
}
