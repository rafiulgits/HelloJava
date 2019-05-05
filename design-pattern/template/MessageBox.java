package sdp.template;

/**
 *
 * @author rafiul islam
 */
public class MessageBox extends Component{
    @Override
    public void onCreate(){
        System.out.println("onCreate: message component");
    }
    
    @Override
    public void onStart(){
        System.out.println("onStart: message component");
    }
    
    @Override
    public void onDestroy(){
        System.out.println("onDestroy: message component");
    }
}
