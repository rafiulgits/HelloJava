package sdp.decorator;

/**
 *
 * @author rafiul islam
 */
public class Mobile4G extends Technology{
    
    public Mobile4G(Mobile3G mobile3G) {
        super(mobile3G);
    }
    
    
    @Override
    public void call(){
        super.call();
        System.out.println("Virtual Reality supported: 4G");
    }
    
}
