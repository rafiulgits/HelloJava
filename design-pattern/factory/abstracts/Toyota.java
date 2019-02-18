package sdp.factory.abstracts;

/**
 *
 * @author rafiul islam
 */
public class Toyota {
    public static final int SUV = 1;
    public static final int SEDAN = 2;
    
    public static Factory factory(int type){
        switch(type){
            case SUV: return new SUVFactory();
            case SEDAN: return new SedanFactory();
            default: return null;
        }
    }
}
