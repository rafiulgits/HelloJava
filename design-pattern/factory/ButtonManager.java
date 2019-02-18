package sdp.factory;

/**
 *
 * @author rafiul islam
 */
public class ButtonManager {
    public static final int BUTTON_ANDROID = 1;
    public static final int BUTTON_IOS = 2;
    
    public static Button build(int type){
        switch(type){
            case BUTTON_ANDROID: return new AndroidButton();
            case BUTTON_IOS: return new IOSButton();
            default: return null;
        }
    }
}
