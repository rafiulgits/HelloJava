package sdp.template;

/**
 *
 * @author rafiul islam
 */
public abstract class Component {
    protected abstract void onCreate();
    protected abstract void onStart();
    protected abstract void onDestroy();
    
    public void render(){
        onCreate();
        onStart();
        System.out.println("component rendering...");
        onDestroy();
        System.out.println();
    }
}
