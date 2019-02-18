package os.roundrobin;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafiul islam
 */
public class Process {
    
    private long arrivalTime,exitTime;
    private int neededTime,remainingTime,waitingTime;
    
    private String name;
    
    private Process(int neededTime, String name){
        this.neededTime = neededTime;
        this.name = name;
        remainingTime = neededTime;
        arrivalTime = System.currentTimeMillis();
        exitTime = -1;
    }
    
    public static Process create(int neededTime, String name){
        return new Process(neededTime,name);
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public long getExitTime() {
        return exitTime;
    }

    public int getNeededTime() {
        return neededTime;
    }

    public int getRemainingTime() {
        return remainingTime;
    }
    
    public int getWaitingTime() {
        return waitingTime;
    }
    
    public boolean isExecuting() {
        return remainingTime != 0;
    }
       
    
    public void execute(int timeSlot){
        Logger.getLogger("running: ").log(Level.SEVERE, name);
        
        if(timeSlot < remainingTime){
            try{
                Thread.sleep(timeSlot*1000);
            }catch(InterruptedException ex){

            }
            remainingTime -= timeSlot;
        }
        else{
            try{
                Thread.sleep(remainingTime*1000);
            }catch(InterruptedException ex){

            }
            remainingTime = 0;
            exitTime = System.currentTimeMillis();
            waitingTime = (int) ((exitTime-arrivalTime));
        }
    }
    
    public String toString(){
        return name;
    }
}
