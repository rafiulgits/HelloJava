package sdp.factory;

/**
 *
 * @author rafiul islam
 */
public class Main {
    
    public static void main(String[] args) {
        
        Button button1 = ButtonManager.build(ButtonManager.BUTTON_ANDROID);
        Button button2 = ButtonManager.build(ButtonManager.BUTTON_IOS);
        
        System.out.println(button1);
        System.out.println(button2);
        
        button1.onClick();
        button2.onClick();
    }
}
