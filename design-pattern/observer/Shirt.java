package sdp.observer;

/**
 *
 * @author rafiul islam
 */
public class Shirt extends Product{
    public Shirt(int price, Basket basket){
        this.basket = basket;
        this.price = price;
        this.name = "Shirt";
        
        basket.add(this);
    }
   
}
