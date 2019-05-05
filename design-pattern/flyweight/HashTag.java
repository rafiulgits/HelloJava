package sdp.flyweight;

/**
 *
 * @author rafiul islam
 */
public class HashTag implements Tag{
    private String tagName;
    private int primaryKey;
    
    public HashTag(String tagName, int primaryKey){
        this.tagName = tagName;
        this.primaryKey = primaryKey;
    }
    
    @Override
    public String name(){
        return tagName;
    }
    
    @Override
    public int id(){
        return primaryKey;
    }
}
