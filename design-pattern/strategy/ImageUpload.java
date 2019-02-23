package sdp.strategy;

/**
 *
 * @author rafiul islam
 */
public class ImageUpload implements Upload{
    @Override
    public void push(String fileName){
        System.out.println(fileName+" is uploading to image drive");
    }
}
