package class23;

public class CarTester {
    public static void main(String[] args) {
       /* Car car = new Tesla();
        car.start();
        car= new Toyota();
        car.start();*/

        /*BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        bmw.stop();

        Tesla tesla = new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();

        Toyota toyota = new Toyota();
        toyota.start();
        toyota.stop();
        toyota.stop();*/

        Car car = new Tesla();
        car.start();
        car.stop();
        car.park();

        Car [] cars= {new BMW(),new Tesla(),new Toyota()};

        for (Car c: cars){
            c.start();
            c.stop();
            c.park();
        }

    }
}
