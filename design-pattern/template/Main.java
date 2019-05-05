package sdp.template;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        Component reactMessageBox = new MessageBox();
        reactMessageBox.render();

        Component reactNotificationBox = new NotificationBox();
        reactNotificationBox.render();
    }
}
