package sdp.factory;

/**
 *
 * @author rafiul islam
 */
public class Main {
    
    public static void main(String[] args) {
        
        Button bt1 = ButtonManager.build(ButtonManager.BUTTON_ANDROID);
        Button bt2 = ButtonManager.build(ButtonManager.BUTTON_IOS);
        
        System.out.println(bt1);
        System.out.println(bt2);
        
        bt1.onClick();
        bt2.onClick();
    }
}
