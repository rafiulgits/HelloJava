package os.roundrobin;

/**
 *
 * @author rafiul islam
 */
public class Main {
    public static void main(String[] args) {
        CPU cpu = CPU.init(2);
        
        Process p1,p2,p3; 
        p1 = Process.create(3, "Process 1");
        p2 = Process.create(1, "Process 2");
        p3 = Process.create(2, "Process 3");
        
        cpu.newProcess(p1);
        cpu.newProcess(p2);
        cpu.newProcess(p3);
        
        new Thread(cpu).start();
        
    }
}
