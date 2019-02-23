package sdp.proxy;

/**
 *
 * @author rafiul islam
 */
public class TorProject implements DarkWeb{
    
    @Override
    public void open(String url){
        System.out.println("Opening "+url);
    }
}
