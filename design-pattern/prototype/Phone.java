package sdp.prototype;

/**
 *
 * @author rafiul islam
 */
public abstract class Phone implements Cloneable{
    public abstract String name();
    
    public Object clone(){
        try{
            return super.clone();
        } catch(CloneNotSupportedException ex){
            return null;
        }
    }
}
