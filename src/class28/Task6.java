package class28;

import java.util.ArrayList;

public class Task6 {
    /*
    /*Create a class Insurance that will have an attribute as insuranceName and unimplemented
 behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health.
Car class has it's own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.*/
    public static void main(String[] args) {
        ArrayList<Insurance>insurances= new ArrayList<>();

    }


}
abstract class Insurance {
    String insuranceName ;
    abstract void getQuote();
    abstract void cancelInsurance();

}
class Car extends Insurance{
 String carModel;

    @Override
    void getQuote() {

    }

    @Override
    void cancelInsurance() {

    }
}
class Pet extends Insurance {
 String petType;

    @Override
    void getQuote() {

    }

    @Override
    void cancelInsurance() {

    }
}
class Health extends Insurance{

    @Override
    void getQuote() {

    }

    @Override
    void cancelInsurance() {

    }
}
