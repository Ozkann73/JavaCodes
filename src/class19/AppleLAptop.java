package class19;
import class20.Laptop;
public class AppleLAptop extends Laptop {
    void printMake(){
        // cant access becs we are in a different package
        System.out.println(make);
        System.out.println(ram);
    }
}
