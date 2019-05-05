package sdp.adapter;

import java.util.HashMap;

/**
 *
 * @author rafiul islam
 */
public class Windows implements OS{
    private HashMap installedDrivers;
    
    public Windows(){
        installedDrivers = new HashMap();
    }
    
    @Override
    public void install(String type, Driver driver){
        installedDrivers.put(type, driver);
    }
    
    @Override
    public void execute(String type){
        type = type.toLowerCase();
        if(type == "exe" || type == "msi"){
            System.out.println("Windows default execution engine: "+type);
        }
        else{
            Driver driver = (Driver)installedDrivers.get(type);
            if(driver == null){
                System.out.println("No supported driver found");
            }
            else{
                driver.engine(type);
            }
        }
    }
}
