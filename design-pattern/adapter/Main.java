package sdp.adapter;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        Windows pc = new Windows();
        pc.execute("exe");
        pc.execute("py");
        
        Python python = new Python();
        pc.install("py", python);
        pc.execute("py");
    }
}
