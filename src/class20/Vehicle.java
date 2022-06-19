package class20;

public class Vehicle {
    int engineHp;
    String make;
    String model;
    String color;
}
class Car extends Vehicle {
    String steeringType;
    boolean autoPilot;
    int noOfWindows;
    void printBasicInfo(){
        engineHp=500;
        System.out.println(engineHp);
    }
}
class BMW extends Car {
    int topspeed;
    void printBasicInfo(){
        engineHp=500;
        System.out.println(engineHp);
    }
}
