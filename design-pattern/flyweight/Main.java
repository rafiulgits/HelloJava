package sdp.flyweight;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        String[] tags = {"endgame","EndGame", "avengers", "Avengers", "ENDGAME"};
        
        HashTag twitterHashTag;
        for(String item : tags){
            twitterHashTag = HashTagTable.getOrCreate(item);
            System.out.println(twitterHashTag.id()+" : "+twitterHashTag.name());
        }
    }
}
