package sdp.observer;

/**
 *
 * @author rafiul islam
 */
public class Mobile extends Product{
    public Mobile(int price, Basket basket){
        this.basket = basket;
        this.price = price;
        this.name = "Mobile";
        
        basket.add(this);
    }
   
}
