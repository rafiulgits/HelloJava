package sdp.factory.abstracts;

/**
 *
 * @author rafiul islam
 */
public class SedanCar implements Car{
    @Override
    public int seat(){
        return 4;
    }
    
    @Override
    public int horsePower(){
        return 700;
    }
    
}
