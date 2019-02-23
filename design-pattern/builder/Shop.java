package sdp.builder;

/**
 *
 * @author rafiul islam
 */
public class Shop {
    public static final int AMD_PROCESSOR = 1;
    public static final int INTEL_PROCESSOR = 2;
    
    
    public static Computer buyDesktop(int processor, int ram, int hdd){
        Processor myProcessor = null;
        if(processor == AMD_PROCESSOR){
            myProcessor = new AMDProcessor();
        }
        else if(processor == INTEL_PROCESSOR){
            myProcessor = new IntelProcessor();
        }
        else{
            return null;
        }
        
        return new Desktop(myProcessor, ram, hdd);
        
    }
    
    public static Computer buyLaptop(int processor, int ram, int hdd){
        Processor myProcessor = null;
        if(processor == AMD_PROCESSOR){
            myProcessor = new AMDProcessor();
        }
        else if(processor == INTEL_PROCESSOR){
            myProcessor = new IntelProcessor();
        }
        else{
            return null;
        }
        
        return new Laptop(myProcessor, ram, hdd);
    }
}
