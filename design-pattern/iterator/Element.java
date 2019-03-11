package sdp.iterator;

/**
 *
 * @author rafiul islam
 */
public class Element {
    public int id;
    public String name;
    
    public Element(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString(){
        return id+": "+name;
    }
}
