package sdp.state;

/**
 *
 * @author rafiul islam
 */
public class Withdraw implements State{
    private Transection transection;
    
    public Withdraw(Transection transection){
        this.transection = transection;
        this.transection.setCurrentState(this);
    }
    
    @Override
    public void action(){
        System.out.println(String.format("Withdrawing %.2f from %d", 
                transection.getAmount(), transection.getToAC()));
    }
    
    @Override
    public String toString(){
        return "withdraw state running";
    }
}
