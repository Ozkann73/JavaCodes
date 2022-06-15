package class17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog (String dogName,String dogBreed, String dogColor, int dogAge , double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;
    }


    void printInfo (){
        System.out.println("Name "+name+" Breed "+breed+" Color "+color+" Weight "+weight);
    }

    public static void main(String[] args) {
       /* Dog dog1 = new Dog();
        dog1.name="lofy";
        dog1.breed="German";
        dog1.color="Black";
        dog1.age=11;
        dog1.weight=40;
        dog1.printInfo();

        Dog dog2 = new Dog();
        dog2.name="ziro";
        dog2.breed="kangal";
        dog2.color="Black";
        dog2.age=11;
        dog2.weight=40;
        dog2.printInfo();*/


    }
}
