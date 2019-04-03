package sdp.memento;

/**
 *
 * @author rafiul islam
 */
public class Editor {
    
    private String data;
    
    public void write(String data){
        this.data = data;
    }
    
    public String read(){
        return data;
    }
    
    public Cache caching(){
        return new Cache(data);
    }
    
    public void load(Cache cache){
        this.write(cache.getData());
    }
}
