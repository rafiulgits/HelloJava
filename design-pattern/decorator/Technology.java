package sdp.decorator;

/**
 *
 * @author rafiul islam
 */
public class Technology implements MobilePhone {
    private MobilePhone mobilePhone;
    
    public Technology(MobilePhone mobilePhone){
        this.mobilePhone = mobilePhone;
    }
    
    @Override
    public void call(){
        mobilePhone.call();
    }
}
