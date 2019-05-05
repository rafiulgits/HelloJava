package sdp.state;

/**
 *
 * @author rafiul islam
 */
public class Diposit implements State{ 
    Transection transection;
   
    public Diposit(Transection transection){
        this.transection = transection;
        this.transection.setCurrentState(this);
    }
    
    @Override
    public void action(){
        System.out.println(String.format("Dipositing %.2f to %d", 
                transection.getAmount(), transection.getToAC()));
    }
    
    @Override
    public String toString(){
        return "diposite state running";
    }
}
