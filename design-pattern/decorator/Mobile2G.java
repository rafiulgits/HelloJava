package sdp.decorator;

/**
 *
 * @author rafiul islam
 */
public class Mobile2G extends Technology {
    
    public Mobile2G(MobilePhone mobilePhone) {
        super(mobilePhone);
    }
    
    @Override
    public void call(){
        super.call();
        System.out.println("More fast network: 2G");
    }
    
}
