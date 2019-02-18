package sdp.factory.abstracts;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        Car alion = Toyota.getCar(Toyota.SEDAN);
        Car prado = Toyota.getCar(Toyota.SUV);
        
        System.out.println("Alion has "+alion.seat()+" seat");
        System.out.println("Prado has "+prado.seat()+" seat");
    }
}
