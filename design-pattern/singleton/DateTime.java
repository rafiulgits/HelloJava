package sdp.singleton;

/**
 *
 * @author rafiul islam
 */
public class DateTime {
    
    private static DateTime obj = new DateTime();
   
    private DateTime(){}
    
    public static DateTime init(){
        return obj;
    }
    
    public long now(){
        return System.currentTimeMillis();
    }
}
