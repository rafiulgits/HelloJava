package sdp.observer;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        
        Shirt shirt = new Shirt(590, basket);
        Book book =  new Book(150, basket);
        Mobile mobile =new Mobile(5999, basket);
        
        basket.checkOut();
    }
}
