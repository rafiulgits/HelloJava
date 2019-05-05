package sdp.flyweight;

import java.util.HashMap;

/**
 *
 * @author rafiul islam
 */
public class HashTagTable {
    private static int autoPrimaryKey = 1;
    private static HashMap table = new HashMap();
    
    public static HashTag getOrCreate(String tag){
        tag = tag.toLowerCase();
        HashTag hashTag = (HashTag) table.get(tag);
        
        if(hashTag == null){
            hashTag = new HashTag(tag, autoPrimaryKey++);
            table.put(tag, hashTag);
        }
        return hashTag;
    }
}
