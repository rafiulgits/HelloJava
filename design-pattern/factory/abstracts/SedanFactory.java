package sdp.factory.abstracts;

/**
 *
 * @author rafiul islam
 */
public class SedanFactory implements Factory{
    
    @Override
    public Car build(){
        return new SedanCar();
    }
}
