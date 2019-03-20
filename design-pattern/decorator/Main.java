package sdp.decorator;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        
        BasePhone basePhone = new BasePhone();
        basePhone.call();
        System.out.println("--------------------");
        Mobile2G mobile2G = new Mobile2G(basePhone);
        mobile2G.call();
        System.out.println("--------------------");
        Mobile3G mobile3G = new Mobile3G(mobile2G);
        mobile3G.call();
        System.out.println("--------------------");
        Mobile4G mobile4G = new Mobile4G(mobile3G);
        mobile4G.call();
    }
}
