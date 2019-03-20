package sdp.decorator;

/**
 *
 * @author rafiul islam
 */
public class Mobile3G extends Technology{
   
    public Mobile3G(Mobile2G mobile2G) {
        super(mobile2G);
    }
    
    @Override
    public void call(){
        super.call();
        System.out.println("Video Call supported: 3G");
    }
   
}
