package sdp.decorator;

/**
 *
 * @author rafiul islam
 */
public class BasePhone implements MobilePhone{
    @Override
    public void call(){
        System.out.println("calling...");
    }
}
