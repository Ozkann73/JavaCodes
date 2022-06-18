package class19;
class Animal{

        String name;
        String breed;
        String color;
        int age;
        double weight;
    void printInfo(){
        System.out.println("Name "+name+" Color "+color);
    }

}
public class Dog extends Animal {
    Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
    void printInfo(){
        System.out.println("Name "+name+" Color "+color);
    }

}
 class Cat extends Animal{
     Cat(String name,String color){
         this.name=name;
         this.color=color;

}
}

