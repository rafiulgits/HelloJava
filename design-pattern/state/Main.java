package sdp.state;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        Transection transection = new Transection(101122, 284522, 100.0);
        Withdraw withdraw = new Withdraw(transection);
        System.out.println(transection.getCurrentState());
        withdraw.action();
       
        Diposit diposit = new Diposit(transection);
        System.out.println(transection.getCurrentState());
        diposit.action();
    }
}
