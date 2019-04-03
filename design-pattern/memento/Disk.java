package sdp.memento;

import java.util.ArrayList;
/**
 *
 * @author rafiul islam
 */
public class Disk {
    
    private ArrayList<Cache> savedCaches;
    
    public Disk(){
        savedCaches = new ArrayList<>();
    }
    
    public void save(Cache cache){
        savedCaches.add(cache);
    }
    
    public Cache fetch(int index){
        return savedCaches.get(index);
    }
}
