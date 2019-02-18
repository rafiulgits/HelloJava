package sdp.factory.abstracts;

/**
 *
 * @author rafiul islam
 */
public class SUVCar implements Car{
    
    @Override
    public int seat(){
        return 6;
    }
    
    @Override
    public int horsePower(){
        return 1000;
    }
}
