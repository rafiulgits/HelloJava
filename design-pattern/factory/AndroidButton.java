package sdp.factory;

/**
 *
 * @author rafiul islam
 */
public class AndroidButton implements Button{
    
    @Override
    public void onClick(){
        System.out.println("clicked on android");
    }
    
    @Override
    public Button getButton(){
        return this;
    }
    
    @Override
    public String toString(){
        return "Android button";
    }
    
    public void androMethod(){
        System.out.println("based on linux");
    }
}

