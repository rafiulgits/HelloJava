package sdp.template;

/**
 *
 * @author rafiul islam
 */
public class NotificationBox extends Component{
    @Override
    public void onCreate(){
        System.out.println("onCreate: notification component");
    }
    
    @Override
    public void onStart(){
        System.out.println("onStart: notification component");
    }
    
    @Override
    public void onDestroy(){
        System.out.println("onDestroy: notification component");
    }
}
