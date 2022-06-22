package class21;

public class Animal {
    String name;
    String color;
    String breed;
    int age;

    public Animal(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    void printInfo (){
        System.out.println("Name "+name+" Color "+" Breed "+breed+" Age "+age);
    }
}
class Dog extends Animal{

    public Dog(String name, String color, String breed,int age) {
        super(name, color, breed);
    }
}
class Cat extends Animal {

    public Cat(String name, String color, String breed, int age) {
        super(name, color, breed, age);
    }
}
