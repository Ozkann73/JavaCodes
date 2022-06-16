package class18;

public class Laptop {
    String make;
    String model;
    String storage;
    String memory;
    double screenSize;


    public Laptop(String make, String model, String storage) {
        /*this.make = make;
        this.model = model;
        this.storage = storage;*/
        this(make, model);
    }

    public Laptop(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Laptop(String make) {
        this.make = make;
    }
    public Laptop(String make, String model, String storage, String memory, double screenSize) {
      /*  this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;*/
        this(make, model, storage);
        this.screenSize = screenSize;}

    public Laptop (){
        System.out.println("Basic of construction is happening");
    }

    public static void main(String[] args) {
        Laptop apple =new Laptop("Apple","M1Pro 14","512");

    }
}
