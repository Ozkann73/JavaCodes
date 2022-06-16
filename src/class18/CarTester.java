package class18;

public class CarTester {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","M4","Blue");
        car1.printInfo();
        Car car2 = new Car("Nissan","Altima","White");
        car2.printInfo();

        Car car = new Car("Tesla");
        car.printCarModel();
    }
}
