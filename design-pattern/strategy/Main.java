package sdp.strategy;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        UploadManager imageUploadManager = new UploadManager(new ImageUpload());
        imageUploadManager.push("image.png");
        imageUploadManager.push("cover.jpg");
        
        UploadManager videoUploadManager = new UploadManager(new VideoUpload());
        videoUploadManager.push("coldplay.mp4");
        
        UploadManager musicUploadManager = new UploadManager(new MusicUpload());
        musicUploadManager.push("ed sheeran.mp3");
    }
}
