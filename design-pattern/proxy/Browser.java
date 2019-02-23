package sdp.proxy;

/**
 *
 * @author rafiul islam
 */
public class Browser implements DarkWeb{
    private TorProject tor;
    
    public Browser(){
        tor = new TorProject();
    }
    
    @Override
    public void open(String url){
        tor.open(url);
    }
}
