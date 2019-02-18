package sdp.factory.abstracts;

/**
 *
 * @author rafiul islam
 */
public class Toyota {
    public static final int SUV = 1;
    public static final int SEDAN = 2;
    public static Car getCar(int type){
        switch(type){
            case SUV: return new SUVCar();
            case SEDAN: return new SedanCar();
            default: return null;
        }
    }
}
