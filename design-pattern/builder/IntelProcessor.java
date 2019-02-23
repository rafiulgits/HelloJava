package sdp.builder;

/**
 *
 * @author rafiul islam
 */
public class IntelProcessor implements Processor{
    
    private float cpuSpeed;
    
    @Override
    public float speed(){
        return cpuSpeed;
    }
    
    @Override
    public String name(){
        return "Intel Processor";
    }
}
