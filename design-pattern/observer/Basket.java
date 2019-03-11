package sdp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafiul islam
 */
public class Basket {
    private List<Product> products;
    private int id;
    
    public Basket(){
        products = new ArrayList<>();
        id = 154545;
    }
    
    public void add(Product product){
        products.add(product);
        System.out.println(product.name+"@"+product.price+" added on basket "+id);
    }
    
    public void checkOut(){
        int total = 0;
        System.out.println("\n---------------------------------------");
        for(Product product: products){
            total += product.price;
            System.out.println("Checking out "+product.name+" = "+product.price);
        }
        
        System.out.println("---------------------------------------");
        System.out.println("Total: "+total);
    }
}
