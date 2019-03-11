package sdp.command;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        
        Browser chrome = new Browser();
       
        Processor processor = new Processor();
        
        processor.add(new DownloadTask(chrome));
        processor.add(new UploadTask(chrome));
        
        processor.run();
    }
}
