package sdp.command;

/**
 *
 * @author rafiul islam
 */
public class DownloadTask implements Task{
    
    private Browser browser;
    
    public DownloadTask(Browser browser){
        this.browser = browser;
    }
    
    @Override
    public void execute(){
        browser.downloadOperations();
    }
}
