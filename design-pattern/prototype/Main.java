package sdp.prototype;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        CloneShop.load();
        
        Phone iphoneXClone = CloneShop.get(CloneShop.IPHONE_X);
        Phone samsungS10Clone = CloneShop.get(CloneShop.SAMSUNG_S10);
        
        System.out.println(iphoneXClone.name());
        System.out.println(samsungS10Clone.name());
        
        
        
    }
}
