
package com.basic.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author rafiul
 * @see Generally A Thread will dead after a single Execution 
 * 
 * When we have to do n different operation with m different Thread
 * where n > m and m >=1, then we need something that will use a single
 * thread multiple times for complete all n operations. 
 * This concept is Thread Pool.
 * Where we use a single thread multiple times
 */
class ThreadRunner implements Runnable{
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.printf("%s is starting...\n",name);
        System.out.printf("%s is loading 50%%...\n",name);
        System.out.printf("complete\n");
    }
}
public class ThreadReusing {
    public static void main(String[] args) {
        
        /** Creating a Runnable object for create a Thread.
         *  We will use this single Runnable object for different
         *  thread in Executor
        */
        ThreadRunner runner = new ThreadRunner();
        
        /** Here I have total 4 operation and a single Thread
         *  So my thread pool use this single in thread for 4 different
         *  operations and then the thread will dead.
         *  Here this single thread will run 4 time before dead.
        */
        
        /** After Completed all operations must shutdown the executor **/
        
        ExecutorService singleServer = Executors.newSingleThreadExecutor();
        for(int i=0; i<4; i++){
            singleServer.execute(runner);
        }
        singleServer.shutdown();
        
        /** Here I have 2 fixed thread for doing 4 different operations
         *  So, my thread pool will divide this 4 operations between this
         *  2 thread. So each thread will run twice then dead
        */
        ExecutorService multiServer = Executors.newFixedThreadPool(2);
        for(int i=0; i<4; i++){
            multiServer.execute(runner);
        }
        multiServer.shutdown();
        
    }
}
