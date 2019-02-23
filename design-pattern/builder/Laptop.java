package sdp.builder;

/**
 *
 * @author rafiul islam
 */
public class Laptop implements Computer{
    private Processor myProcessor;
    private int myRam, myHDD;
    
    public Laptop(Processor myProcessor, int myRam, int myHDD){
        this.myProcessor = myProcessor;
        this.myRam = myRam;
        this.myHDD = myHDD;
    }
    
    @Override
    public Processor processor(){
        return myProcessor;
    }
    
    @Override
    public int ram(){
        return myRam;
    }
    
    @Override
    public int hddGB(){
        return myHDD;
    }
}
