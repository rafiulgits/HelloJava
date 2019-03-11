package sdp.command;

/**
 *
 * @author rafiul islam
 */
public class UploadTask implements Task {
    private Browser browser;
    
    public UploadTask(Browser browser){
        this.browser = browser;
    }
    
    @Override
    public void execute(){
        browser.uploadOperations();
    }
}
