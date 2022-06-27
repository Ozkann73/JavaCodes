package class11;

public class Dog {
    String name;
    int age;
    double weight;
    String color;
    String breed;
    void bark (){
        System.out.println("Dog barks");
    }
    void walks (){
        System.out.println("Dog walks");
    }
    void eat (){
        System.out.println("Dogs like to eat bone");
    }

    public static void main(String[] args) {
        Dog jimmy = new Dog();
        jimmy.name="Jimmy";
        jimmy.age=6;
        jimmy.weight=20.5;
        jimmy.color="Black";
        jimmy.breed="German";
        jimmy.bark();
        jimmy.walks();
        jimmy.eat();
    }
}
