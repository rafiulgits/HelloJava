package sdp.prototype;

import java.util.HashMap;

/**
 *
 * @author rafiul islam
 */
public class CloneShop {
    
    public static final int SAMSUNG_S10 = 1;
    public static final int IPHONE_X = 2;
    
    private static HashMap<Integer, Phone> originals = new HashMap<>();
    
    public static void load(){
        originals.put(IPHONE_X, new IPhoneX());
        originals.put(SAMSUNG_S10, new SamsungS10());
    }
    
    public static Phone get(int phone){
        switch(phone){
            case SAMSUNG_S10: return (Phone)originals.get(SAMSUNG_S10).clone();
            case IPHONE_X: return (Phone)originals.get(IPHONE_X).clone();
            default:return null;
        }
    }
}
