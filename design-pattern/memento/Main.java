package sdp.memento;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        Disk drive = new Disk();
        Editor sublime = new Editor();
        
        sublime.write("Hello World");
        drive.save(sublime.caching());
        display(sublime.read());
        
        sublime.write("Hello Bangladesh");
        display(sublime.read());
        
        sublime.load(drive.fetch(0));
        display(sublime.read());
        
    }
    
    public static void display(String view){
        System.out.println(view);
    }
}
