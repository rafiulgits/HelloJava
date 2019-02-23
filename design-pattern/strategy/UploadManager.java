package sdp.strategy;

/**
 *
 * @author rafiul islam
 */
public class UploadManager {
    private Upload type;
    public UploadManager(Upload type){
        this.type = type;
    }
    
    public void push(String fileName){
        type.push(fileName);
    }
}
