package sdp.factory.abstracts;

/**
 *
 * @author rafiul islam
 */
public class SUVFactory implements Factory{
    
    @Override
    public Car build(){
        return new SUVCar();
    }
}
