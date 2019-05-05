package sdp.state;

/**
 *
 * @author rafiul islam
 */
public class Transection {
    private State currentState;
    
    private int fromAC, toAC;
    private double amount;

    public Transection(int fromAC, int toAC, double amount){
        this.fromAC = fromAC;
        this.toAC = toAC;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    
    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getFromAC() {
        return fromAC;
    }

    public int getToAC() {
        return toAC;
    }
}
