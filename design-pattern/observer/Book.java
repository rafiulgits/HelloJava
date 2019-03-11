package sdp.observer;

/**
 *
 * @author rafiul islam
 */
public class Book extends Product{
    public Book(int price, Basket basket){
        this.basket = basket;
        this.price = price;
        this.name = "Book";
        
        basket.add(this);
    }
   
}
