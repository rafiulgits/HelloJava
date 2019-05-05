package sdp.adapter;

/**
 *
 * @author rafiul islam
 */
public class Python implements Driver{
    
    @Override
    public void engine(String type){
        System.out.println("Python interpreter engine: "+type);
    }
}
