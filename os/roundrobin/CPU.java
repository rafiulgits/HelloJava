package os.roundrobin;

import java.util.ArrayList;

/**
 *
 * @author rafiul islam
 */
public class CPU implements Runnable{
    
    private ArrayList<Process> totalProcess;
    private boolean isIdle;
    private int timeSlot;
    private int currentlyRunning;

    private CPU(int timeSlot){
        totalProcess = new ArrayList<>();
        isIdle = false;
        this.timeSlot = timeSlot;
        currentlyRunning = 0;
    }
    
    public static CPU init(int timeSlot){
        return new CPU(timeSlot);
    }
    
    public void newProcess(Process p){
        totalProcess.add(p);
        if(isIdle){
            isIdle = false;
        }
        currentlyRunning +=1;
    }
    
    @Override
    public void run(){
        while(!isIdle){
            for(Process process : totalProcess){
                if(process.isExecuting()){
                    process.execute(timeSlot);
                }
                else{
                    currentlyRunning-=1;
                }
                if(currentlyRunning == 0){
                    System.out.println("CPU IDLE");
                    isIdle = true;
                    break;
                }
            }
        }
        
        for(Process process : totalProcess){
            System.out.println(process +" need "+process.getWaitingTime()
                    +" millisec to executed");
        }
    }
    
    
}
