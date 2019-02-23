package sdp.builder;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        Computer homeComputer = Shop.buyDesktop(Shop.AMD_PROCESSOR, 8, 1024);
        System.out.println("Home Computer");
        System.out.println(homeComputer.processor().name());
        System.out.println("RAM:"+ homeComputer.ram());
        System.out.println("HDD: "+homeComputer.hddGB());
        System.out.println("-------------------------------");
        
        Computer officeComputer = Shop.buyLaptop(Shop.INTEL_PROCESSOR, 4, 512);
        System.out.println("Office Computer");
        System.out.println(officeComputer.processor().name());
        System.out.println("RAM: "+officeComputer.ram());
        System.out.println("HDD: "+officeComputer.hddGB());
    }
}
