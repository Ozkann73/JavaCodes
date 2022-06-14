package class16;

public class Dog {
    String color ;
    String name;
    static int noOfleg;
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.color="Pink";
        dog1.name="Tomy";

        Dog dog2 = new Dog();
        dog2.color="Blue";
        dog2.name="Toma";

        Dog dog3 = new Dog();
        dog3.color="Black";
        dog3.name="Tom";
        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);

    }
}
