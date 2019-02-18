package sdp.factory;

/**
 *
 * @author rafiul islam
 */
public class IOSButton implements Button{
    
    @Override
    public void onClick(){
        System.out.println("clicked on ios");
    }
    
    @Override
    public Button getButton(){
        return this;
    }
    
    @Override
    public String toString(){
        return "IOS Button";
    }
}
