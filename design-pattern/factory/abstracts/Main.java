package sdp.factory.abstracts;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        Factory suvFactory = Toyota.factory(Toyota.SUV);
        Factory sedanFactory = Toyota.factory(Toyota.SEDAN);
        
        Car alion = sedanFactory.build();
        Car prado = suvFactory.build();
        
        System.out.println("Alion has "+alion.seat()+" seat");
        System.out.println("Prado has "+prado.seat()+" seat");
    }
}
