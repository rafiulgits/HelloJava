package sdp.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafiul islam
 */
public class Processor {
    
    List<Task> processList;

    public Processor(){
        processList = new ArrayList<>();
    }
    
    public void add(Task task){
        processList.add(task);
    }
    
    public void run(){
        for(Task task : processList){
            task.execute();
        }
    }
}
